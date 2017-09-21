import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ui extends JFrame {
	Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize(); //Get Screen's Size
	int swidth = (int)screensize.getWidth();  //Screen's width
	int sheight = (int)screensize.getHeight(); //Screen's height
	int width =330; 
	int height =210;
	//display at middle of screen 
	int x = (swidth-width)/2;  
	int y = (sheight-height)/2;
	JTextField t1,t2;
	JLabel l1,l2;
	JPanel jp1,jp2,jp3;
    JButton jb1;
	Ui(){
	    this.t1=new JTextField(23);
	    this.t2=new JTextField(23);
	    this.l1=new JLabel("Password");
	    this.l2=new JLabel("Encryption");
	    this.jp1=new JPanel();
	    this.jp2=new JPanel();
	    this.jp3=new JPanel();
	    this.jb1=new JButton("ok");
	    
		this.setTitle("Encrypt&Decrypt By Mango");
		this.setBounds(x, y, width, height);
		this.setLayout(new GridLayout(3,1));

		this.jp1.add(l1);
		this.jp1.add(t1);
		this.jp2.add(l2);
		this.jp2.add(t2);
		this.jp3.add(jb1);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String  a= t1.getText();
				String  b= t2.getText();
				if(a.length()>0 && b.length()==0) {
					Encrypt en = new Encrypt();
					t1.setText("");
					t2.setText(en.Encrypt(a));
					
				}else if(a.length()==0 && b.length()>0) {
					Decrypt de = new Decrypt();
					t1.setText(de.Decrypt(b));
					t2.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Please enter only one content¡£", "Wrong", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ui();
	}
}
