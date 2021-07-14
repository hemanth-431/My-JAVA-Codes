
package m_in_n.seats;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Swing {

   Swing()
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


public class M_in_nSeats extends JFrame{
static int papers=90;

  public M_in_nSeats()
  {
      for (int i = 0; i < 4; i++) {
          
      
      this.setTitle("Xerox");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400, 400);
      JLabel s=new JLabel("System-1");
       JLabel s1=new JLabel(" Pages    ");
      this.setLayout(new FlowLayout());
  
      JTextField f1=new JTextField("Please Enter No.of Pages",28);
      JTextField f2=new JTextField("No of pages Left",28);
  
   JButton button = new JButton("                                          click                                             ");
		button.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                             Swing obj=new Swing();
				String str = f1.getText();
                              int i = Integer.parseInt(str);
                              papers=papers-i;
                              String hi=Integer.toString(papers);
				f2.setText(hi);
                               
                                
                               
				}
			} );
	this.add(s);
		this.add(f1);
                this.add(s1);
                this.add(f2);
		
		this.add(button);
		}
     
  }
 
	public static void main(String args[]) {
		 M_in_nSeats gui = new  M_in_nSeats();
               
		gui.setVisible(true);
                
	}
       
  }
    
