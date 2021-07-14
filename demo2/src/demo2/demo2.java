
package demo2;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class demo2 extends JFrame 
{
    JLabel l1,l2;
    JTextField t1,t3;
    JPasswordField t2;
    JButton button;
   public demo2()
    {
        
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         l1=new JLabel("enter username");
         l2=new JLabel("enter password");
         t1=new JTextField(20);
         t2=new JPasswordField(20);
         t3=new JTextField(20);
         button=new JButton("Login");
       button.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
                 String str = t1.getText();
                 if(str=="180030431")
                     t3.setText("Hello");;
             }
       });
       this.add(l1);
       this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(t3);
        this.add(button);
         this.setVisible(true);
    }



  public static void main(String args[]) {
		demo2 gui = new demo2();
		gui.setVisible(true);
    }
    
}

