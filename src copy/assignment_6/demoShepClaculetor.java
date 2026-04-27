package assignment_6;//done 12-3-26
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class demoShepClaculetor extends JFrame implements ActionListener {
    JFrame fm;
    JRadioButton circle, rectangle, square;
    JPanel panel1, panel2, panel3;
    JButton calculet, cancle;
    JCheckBox area, p, c;
    JTextField r, l, w, s, result;
    JLabel radiusLabel, lengthLabel, widthLabel, sideLabel;

    demoShepClaculetor() {
        fm = new JFrame();
        fm.setSize(500, 700);
        fm.setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(20, 40, 400, 100);
        panel1.setBorder(BorderFactory.createTitledBorder("Select Shape"));
        panel1.setBackground(new Color(220, 240, 255));
        fm.add(panel1);

        circle = new JRadioButton("Circle");
        rectangle = new JRadioButton("Rectangle");
        square = new JRadioButton("Square");
        ButtonGroup bg = new ButtonGroup();

        bg.add(circle);
        bg.add(rectangle);
        bg.add(square);

        panel1.add(circle);
        panel1.add(rectangle);
        panel1.add(square);

        circle.addActionListener(this);
        rectangle.addActionListener(this);
        square.addActionListener(this);

        panel2 = new JPanel();
        panel2.setBounds(20, 150, 400, 200);
        panel2.setBorder(BorderFactory.createTitledBorder("...Get Input..."));
        panel2.setBackground(new Color(220, 210, 255));
        panel2.setLayout(new GridLayout(4, 2, 10, 10));

        radiusLabel = new JLabel("Radius:");
        r = new JTextField();
        panel2.add(radiusLabel);
        panel2.add(r);

        lengthLabel = new JLabel("Length:");
        l = new JTextField();
        panel2.add(lengthLabel);
        panel2.add(l);

        sideLabel = new JLabel("Side:");
        s = new JTextField();
        panel2.add(sideLabel);
        panel2.add(s);

        widthLabel = new JLabel("Width:");
        w = new JTextField();
        panel2.add(widthLabel);
        panel2.add(w);

        fm.add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(20, 400, 400, 250);
        panel3.setLayout(null);
        panel3.setBorder(BorderFactory.createTitledBorder("...Select Options..."));
        panel3.setBackground(new Color(220, 210, 255));

        area = new JCheckBox("Area");
        area.setBounds(20, 30, 100, 30);
        panel3.add(area);

        c = new JCheckBox("Circumference");
        c.setBounds(120, 30, 150, 30);
        panel3.add(c);

        p = new JCheckBox("Perimeter");
        p.setBounds(270, 30, 150, 30);
        panel3.add(p);

        result = new JTextField();
        result.setBounds(30, 100, 300, 50);
        panel3.add(result);

        calculet = new JButton("Calculate");
        calculet.setBounds(60, 170, 100, 60);
        calculet.addActionListener(this);
        panel3.add(calculet);

        cancle = new JButton("Exit");
        cancle.setBounds(200, 170, 100, 60);
        cancle.addActionListener(this);
        panel3.add(cancle);

        fm.add(panel3);

        fm.setVisible(true);
        fm.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        float pi = 3.14f;
        String result1 = "";

        if (e.getSource() == circle) 
        {
            r.setVisible(true);
            radiusLabel.setVisible(true);
            l.setVisible(false);
            lengthLabel.setVisible(false);
            w.setVisible(false);
            widthLabel.setVisible(false);
            s.setVisible(false);
            sideLabel.setVisible(false);
        }

        if (e.getSource() == rectangle)
        {
            l.setVisible(true);
            lengthLabel.setVisible(true);
            w.setVisible(true);
            widthLabel.setVisible(true);
            r.setVisible(false);
            radiusLabel.setVisible(false);
            s.setVisible(false);
            sideLabel.setVisible(false);
        }

        if (e.getSource() == square)
        {
            s.setVisible(true);
            sideLabel.setVisible(true);
            r.setVisible(false);
            radiusLabel.setVisible(false);
            l.setVisible(false);
            lengthLabel.setVisible(false);
            w.setVisible(false);
            widthLabel.setVisible(false);
        }

        if (e.getSource() == calculet) 
        {
            if (circle.isSelected())
            {
                double radius = Double.parseDouble(r.getText());
                if (area.isSelected()) 
                {
                    result1 = "Circle Area: " + String.format("%.2f",(pi * radius * radius));
                }
                if (c.isSelected())
                {
                    result1 += " Circle Circumference: " + (2 * pi * radius);
                }
            } 
            else if (rectangle.isSelected()) 
            {
                double length = Double.parseDouble(l.getText());
                double width = Double.parseDouble(w.getText());
                if (area.isSelected()) 
                {
                    result1 = "Rectangle Area: " + (length * width);
                }
                if (p.isSelected())
                {
                    result1 += " Rectangle Perimeter: " + (2 * (length + width));
                }
            } 
            else if (square.isSelected())
            {
                double side = Double.parseDouble(s.getText());
                if (area.isSelected()) 
                {
                    result1 = "Square Area: " + (side * side);
                }
                if (p.isSelected())
                {
                    result1 += " Square Perimeter: " + (4 * side);
                }
            }
            result.setText(result1);
        }

        if (e.getSource() == cancle)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new demoShepClaculetor();
    }
}
