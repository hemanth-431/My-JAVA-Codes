import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;


public class Swing {

   
    public static void main(String[] args) {
        new hi();
    }
    
    }
        
        class hi
        {
            hi()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Click Here");
        JButton l3=new JButton("Login");
        JButton b1=new JButton("UserName");
        JButton b=new JButton("Pasword");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
         l3.setBounds(130,100,100,40);
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
       f.add(l3);
       f.add(l1);
       
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
    }
    
}
