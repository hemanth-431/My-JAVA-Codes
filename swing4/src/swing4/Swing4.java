
package swing4;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class demo extends JFrame 
{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton button;
    demo()
    {
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         l1=new JLabel("enter username");
         l2=new JLabel("enter password");
         t1=new JTextField(20);
         t2=new JPasswordField(20);
         button=new JButton("Login");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(button);
         setVisible(true);
    }
}
public class Swing4 {

    public static void main(String[] args) {
     new demo();
    }
    
}
