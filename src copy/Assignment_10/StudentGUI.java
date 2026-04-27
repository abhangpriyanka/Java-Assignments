//Assignment-10
package Assignment_10;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class StudentGUI extends JFrame implements ActionListener
{

	JFrame f;
	JLabel id,name,course;
	JTextField tID,tName,tCourse;
	JButton last,next,prev,first;
	ResultSet rs;
	
	private static final long serialVersionUID = 1L;
	StudentGUI()
	{
		f=new JFrame("...Student Record...");
		f.setSize(700, 500);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		
		id=new JLabel("ID:");
		id.setBounds(150, 50, 150, 40);
		id.setFont(new Font("Arial",Font.BOLD,20));
		id.setForeground(Color.BLUE);
		f.add(id);
		
		
		tID=new JTextField();
		tID.setBounds(250, 50, 250, 40);
		tID.setFont(new Font("Arial",Font.BOLD,20));
		tID.setForeground(Color.black);
		tID.setBackground(new Color(255, 255, 200));
		f.add(tID);
		
		name=new JLabel("Name:");
		name.setBounds(150, 120, 150, 40);
		name.setFont(new Font("Arial",Font.BOLD,20));
		name.setForeground(Color.BLUE);
		f.add(name);
		
		tName=new JTextField();
		tName.setBounds(250, 120, 250, 40);
		tName.setFont(new Font("Arial",Font.BOLD,20));
		tName.setForeground(Color.black);
		tName.setBackground(new Color(255, 255, 200));
		f.add(tName);
		
		course=new JLabel("Course:");
		course.setBounds(150, 200, 150, 40);
		course.setFont(new Font("Arial",Font.BOLD,20));
		course.setForeground(Color.BLUE);
		f.add(course);
		
		tCourse=new JTextField();
		tCourse.setBounds(250, 200, 250, 40);
		tCourse.setFont(new Font("Arial",Font.BOLD,20));
		tCourse.setForeground(Color.black);
		tCourse.setBackground(new Color(255, 255, 200));
		f.add(tCourse);
		
		first=new JButton("First");
		first.setBounds(50, 300, 130, 50);
		first.setFont(new Font("Arial",Font.BOLD,10));
		first.setOpaque(true);
		first.setBackground(Color.BLACK); 
//		first.setForeground(Color.WHITE);
		f.add(first);
		
		next=new JButton("Next");
		next.setBounds(200, 300, 130, 50);
		next.setFont(new Font("Arial",Font.BOLD,10));
		next.setOpaque(true);
		next.setBackground(Color.BLACK); 
		f.add(next);
		
		prev=new JButton("Previous");
		prev.setBounds(350, 300, 130, 50);
		prev.setFont(new Font("Arial",Font.BOLD,10));
		prev.setOpaque(true);
		prev.setBackground(Color.BLACK); 
		f.add(prev);
		
		last=new JButton("Last");
		last.setBounds(500, 300, 130, 50);
		last.setFont(new Font("Arial",Font.BOLD,10));
		last.setOpaque(true);
		last.setBackground(Color.BLACK); 
		f.add(last);
		
		first.addActionListener(this);
		last.addActionListener(this);
		next.addActionListener(this);
		prev.addActionListener(this);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		

		try
		{ 
			DBConnection db = new DBConnection();
			Connection conn = db.connection(); 
			Statement stmt = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			rs = stmt.executeQuery("SELECT * FROM students"); 
		} 
			catch (Exception e)
		{ 
				e.printStackTrace(); 
		} 
		
	}

	private void displayRecord()
	{ 
		try 
		{ 
			    tID.setText(String.valueOf(rs.getInt("id")));
			    tName.setText(rs.getString("name"));
			    tCourse.setText(rs.getString("course"));
			
			} 
	        catch (Exception e) 
		   { 
	        	e.printStackTrace(); 
	       } 
		}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	    try 
	    {
	        if (e.getSource() == first && rs.first())
	        {
	            displayRecord();
	        } 
	        else if (e.getSource() == prev) 
	        {
	            if (rs.previous()) 
	            {
	                displayRecord();
	            } 
	            else
	            {
	                rs.last();
	                displayRecord();
	            }
	        } 
	        else if (e.getSource() == next) 
	        {
	            if (rs.next())
	            {
	                displayRecord();
	            } 
	            else
	            {
	                rs.first();
	                displayRecord();
	            }
	        } 
	        else if (e.getSource() == last && rs.last()) 
	        {
	            displayRecord();
	        }
	    } 
	    catch (SQLException e1)
	    {
	        e1.printStackTrace();
	    }
	}

	
	public static void main(String[] args)
	{
		new StudentGUI();

	}
	}
	
