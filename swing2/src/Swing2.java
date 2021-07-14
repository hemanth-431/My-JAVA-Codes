
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Swing2 extends JFrame{

   
    public static void main(String[] args) {
        new hi();
    
    
    }
    
    
}
class hi
{
    hi()
    {
    JFrame f=new JFrame();
    JButton b1=new JButton("Submit");
    JTextField f1=new JTextField(25);
    JTextField f2=new JTextField(23);
    JLabel l1=new JLabel("Number of words");
    JPasswordField z1=new JPasswordField(30);
    
    b1.setBounds(130,100,100,400);
   // f.add(f1);
   // f.add(b1);
    //f.add(l1);
   // f.add(f2);
    f.add(z1);
   f.setSize(400,400);
   f.setLayout(new FlowLayout());
   f.setVisible(true);
}}