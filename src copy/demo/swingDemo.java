package demo;
import javax.swing.*;
import java.awt.*;
public class swingDemo 
{

	void layoutDemo()
	{
		
		JFrame frame = new JFrame("BorderLayout Example");
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        JFrame frame1 = new JFrame("FlowLayout Example"); 
        frame1.setLayout(new FlowLayout()); 
        frame1.add(new JButton("Button 1"));
        frame1.add(new JButton("Button 2"));
        frame1.add(new JButton("Button 3")); 
        frame1.setSize(300, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame1.setVisible(true);
	}
	void buttonDemo()
	{
		JFrame f1= new JFrame("Redio Buton Demo");
		f1.setSize(300,500);
		f1.setLayout(null);
		JRadioButton r1,r2,r3;
		
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		ButtonGroup bg=new ButtonGroup();
		
		r1.setBounds(50, 50, 100, 30); 
		r2.setBounds(50, 100, 100, 30); 
		bg.add(r1);
		bg.add(r2);
		
		f1.add(r1);
		f1.add(r2);
		
		//checkBox demo
		
		JCheckBox ch1=new JCheckBox("Java");
		JCheckBox ch2=new JCheckBox("Python");
		JCheckBox ch3=new JCheckBox("C++");
		ch3.setBounds(50, 150, 100, 30);
		ch1.setBounds(50, 200, 100, 30);
		ch2.setBounds(50, 250, 100, 30);
		f1.add(ch1);
		f1.add(ch2);
		f1.add(ch3);
		
		
		
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	    public static void main(String[] args)
	    {
	    	swingDemo obj=new swingDemo();
	    	obj.buttonDemo();
	    }
	}



