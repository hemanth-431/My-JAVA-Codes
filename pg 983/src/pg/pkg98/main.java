
package pg.pkg98;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class main extends JApplet {
    
JList<String> jlst;
JLabel jlab;
JScrollPane jscrlp;
String Cities[]={"new york","darjling","usa","paris","urope","highirhg","hvihr","hihf","hfrgjfr"};
public void init()
{
    try{
        SwingUtilities.invokeAndWait(new Runnable(){
            public void run(){
                makeGUI();
    }
                }
    );
}
catch(Exception exe){
            System.out.println("can't create"+exe);
}
}
private void makeGUI()
{
    setLayout(new FlowLayout());
    jlst=new JList<String>(Cities);
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jscrlp=new JScrollPane(jlst);
    jscrlp.setPreferredSize(new Dimension(120,90));
jlab=new JLabel("Choose a City");
jlst.addListSelectionListener(new ListSelectionListener(){
    public void valueChanged(ListSelectionEvent le){
        int idx=jlst.getSelectedIndex();
        if(idx !=-1)
        { jlab.setText("Current selection: "+Cities[idx]);}
        else
         { jlab.setText("Choose a City");}
            
    }
});
add(jscrlp);
add(jlab);

    

}

}
