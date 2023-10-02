
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame implements ActionListener
{
	JButton back;
	JButton rule;
	JTextField tfname;
	String name;
	Login(){
		this.name=name;
		
		getContentPane().setBackground((Color.white));
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0, 600,500);
		add(image);
		
		JLabel heading= new JLabel("QuiziLearn");   //heading of the frame
		heading.setBounds(800,15,400,45);
		heading.setFont(new Font("ROMAN",Font.BOLD,28));   // set Font and size
		heading.setForeground(Color.blue);
		add(heading);
		
		JLabel name = new JLabel("Enter your Name ");		//Label 
		name.setBounds(810,100, 300, 35);
		name.setFont(new Font("Mangolian Balti",Font.BOLD,18));
		add(name);
		
		tfname = new JTextField();			//receive name (Textbox)
		tfname.setBounds(735, 160, 300, 25);
		tfname.setFont(new Font("Times New Roman",Font.PLAIN,14));
		add(tfname);
		 
		rule = new JButton("START");			//Rules Button
		rule.setBounds(700, 230, 160, 27);
		rule.setFont(new Font("Magolian Balti",Font.BOLD,15));
		rule.setBackground(Color.blue);
		rule.setForeground(Color.white);
		rule.addActionListener(this);    //add actionlistener
		add(rule);
		

        


		
		back = new JButton("QUIT "); 			 //Back Button
		back.setBounds(900, 230, 160, 27);    
		back.setFont(new Font("Magolian Balti",Font.BOLD,15));
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);      //addactionlistener
		add(back);
		
		setSize(1200,500);  //width & height
		setLocation(100,100);  //set frame location
		setVisible(true);	//by default its false 
		  
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==rule)
		{
			String name = tfname.getText();
			setVisible(false);
			new Rules(name);
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
		}
	
	
	}
	
	public static void main(String[] args)  
	{
		new Login();

	}

}
