
  import javax.swing.*;
//import java.awt.event.*;
import java.awt.*;
public class Swings extends JFrame
{
 public Swings()
 {
     
     JButton b1=new JButton("Ok\n");
  JTextField jtf = new JTextField(20);	//creating JTextField.
  add(jtf);	
        System.out.println("\n");
    JButton b2=new JButton("Thanks");
  //adding JTextField to frame.
   add(b1);
   add(b2);
  setLayout(new FlowLayout());
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(400, 400);
  setVisible(true);
 }
 public static void main(String[] args)
 {
  new Swings();
 }
}
    

// to develop graphical interface 
// ther are two types awt ---> abstract window toolkit. import java.awt.*;
// swing ---> import java.swing.*;