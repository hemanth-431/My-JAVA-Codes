import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Mysql extends JFrame {
	
	public Mysql() {
		this.setTitle("Anonymous ActionListener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		JLabel t1=new JLabel("Enter a String");
                JLabel t2=new JLabel("Length of String");
		 JTextField textfield1 = new JTextField("input", 20);
		 JTextField textfield2 = new JTextField("output", 20);
                 JLabel t3=new JLabel("No Of Lines is");
                 JTextField no=new JTextField("no.lines",23);
		textfield2.setEditable(false);
		
		JButton button = new JButton("click");
		button.addActionListener ( new ActionListener() {    
			public void actionPerformed(ActionEvent ev) {
				String str = textfield1.getText();
                                int l=str.length();
                              String str1 = Integer.toString(l);
				textfield2.setText(str1);
                                no.setText("1");
				}
			} );
	this.add(t1);
		this.add(textfield1);
                this.add(t2);
		this.add(textfield2);
                this.add(t3);
                this.add(no);
		this.add(button);
		}
	
	public static void main(String args[]) {
		Mysql gui = new Mysql();
		gui.setVisible(true);
	}
}
/*
public void actionPerformed(ActionEvent ae){
try{
String s=t1.getText();
FileInputStream fis=new FileInputStream(s);
int i,c=0,w=0,l=0;
while((i=fis.read())!=-1){
c++;
if((char)i==' ')
w++;
if((char)i=='\n')
l++;
}
t2.setText(String.valueOf(w));
t3.setText(String.valueOf(l));
}
*/
