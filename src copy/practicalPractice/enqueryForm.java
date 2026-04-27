package practicalPractice;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class enqueryForm implements ActionListener
{
	JLabel l1,l2;
	JComboBox jm1;
	JCheckBox ch1,ch2;
	JRadioButton b1,b2;
	JTextField t1,t2;
	JButton btn;
	enqueryForm ()
	{
	JFrame fm =new JFrame("demo form");
	fm.setSize(400,400);
	 fm.setLayout(null);
	
	
	l1=new JLabel("Enter name:");
	l1.setBounds(10, 20, 200, 40);
	l1.setFont(new Font("Arial",Font.BOLD,24));
	fm.add(l1);
	
	t1=new JTextField();
	t1.setBounds(200,20,200,40);
	fm.add(t1);;
	
	
	l2=new JLabel("elect any one:");
	l2.setBounds(10, 50, 400, 50);
	l2.setFont(new Font("Arial",Font.BOLD,24));
	fm.add(l2);
	String[] name = {"Piya","Safiya","Didi"};
    jm1=new JComboBox<>(name);
    jm1.setBounds(200, 60, 200, 40);
    fm.add(jm1);
    
    ch1=new JCheckBox("one");
    ch1.setBounds(10, 100, 100, 20);
    fm.add(ch1);
    ch2=new JCheckBox("two");
    ch2.setBounds(100, 100, 100, 20);
    fm.add(ch2);
    
    b1=new JRadioButton("Meal");
    b1.setBounds(10, 150, 100, 30);
    fm.add(b1);
    
    b2=new JRadioButton("FeMeal");
    b2.setBounds(100, 150, 100, 30);
    fm.add(b2);
    
    ButtonGroup bg=new ButtonGroup();
    bg.add(b1);
    bg.add(b2);
    
    btn=new JButton("Submit");
    btn.setBounds(100, 200, 100, 30);
    btn.addActionListener(this);
    fm.add(btn);
    
	fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fm.setVisible(true);
	
		//fm.setBounds(10, 20, 40, 40);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			System.out.println("Name:"+t1.getText());
			System.out.println("Course:"+jm1.getSelectedItem());
			if(ch1.isSelected())
				System.out.println("Check box output:"+ch1.getText());
				
			if(ch2.isSelected())
				System.out.println("Check box output:"+ch2.getText());
			if(b1.isSelected())
				System.out.println("redioButton output:"+b1.getText());
			if(b2.isSelected())
				System.out.println("redioButton output:"+b2.getText());
			//System.out.println(":"+ch1.getText());
		}
		Component fm = null;
		String msg="...Admission Form...\n"+"Name:"+t1.getText()+"\n"+"Course:"+jm1.getSelectedItem()
		+"\nCheckBox Input1:"+(ch1.isSelected()?ch1.getText():"Not Selected")+"\nCheckBox Input2:"
		+(ch1.isSelected()?ch1.getText():"Not Selected")+"\nRadioButtun Output:"+
		(b1.isSelected() ? b1.getText() : b2.isSelected() ? b2.getText() : "None");
		JOptionPane.showMessageDialog(fm, msg);

		Connection	con=null;
		String url="jdbc:mysql://localhost:3306/demo";
		String pass="Priyanka";
		String userName="root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,pass);
			JOptionPane.showMessageDialog(fm,"connection sucessfully done....");
		} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		
		
	}
}
