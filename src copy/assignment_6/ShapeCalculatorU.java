package assignment_6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeCalculatorU extends JFrame implements ActionListener {
    private JRadioButton circleBtn, rectBtn, squareBtn;
    private JCheckBox areaChk, perimeterChk, circumChk;
    private JTextField radiusField, lengthField, widthField, sideField;
    private JButton calcBtn, exitBtn;
    private JPanel shapePanel, opPanel, inputPanel, btnPanel;

    public ShapeCalculatorU()
    {
        setTitle("Shape Calculator");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        // Panel for shape selection
        shapePanel = new JPanel(new FlowLayout());
        shapePanel.setBorder(BorderFactory.createTitledBorder("Select Shape"));
        shapePanel.setBackground(new Color(220, 240, 255));
        circleBtn = new JRadioButton("Circle");
        rectBtn = new JRadioButton("Rectangle");
        squareBtn = new JRadioButton("Square");
        ButtonGroup bg = new ButtonGroup();
        bg.add(circleBtn); bg.add(rectBtn); bg.add(squareBtn);
        shapePanel.add(circleBtn); shapePanel.add(rectBtn); shapePanel.add(squareBtn);

        // Panel for operations
        opPanel = new JPanel(new FlowLayout());
        opPanel.setBorder(BorderFactory.createTitledBorder("Select Operation"));
        opPanel.setBackground(new Color(240, 255, 220));
        areaChk = new JCheckBox("Area");
        perimeterChk = new JCheckBox("Perimeter");
        circumChk = new JCheckBox("Circumference");
        opPanel.add(areaChk); opPanel.add(perimeterChk); opPanel.add(circumChk);

        // Panel for input fields
        inputPanel = new JPanel(new GridLayout(4,2,5,5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Values"));
        inputPanel.setBackground(new Color(255, 240, 220));
        radiusField = new JTextField();
        lengthField = new JTextField();
        widthField = new JTextField();
        sideField = new JTextField();
        inputPanel.add(new JLabel("Radius:")); inputPanel.add(radiusField);
        inputPanel.add(new JLabel("Length:")); inputPanel.add(lengthField);
        inputPanel.add(new JLabel("Width:")); inputPanel.add(widthField);
        inputPanel.add(new JLabel("Side:")); inputPanel.add(sideField);

        // Panel for buttons
        btnPanel = new JPanel(new FlowLayout());
        calcBtn = new JButton("Calculate");
        exitBtn = new JButton("Exit");
        calcBtn.setBackground(new Color(200, 255, 200));
        exitBtn.setBackground(new Color(255, 200, 200));
        btnPanel.add(calcBtn); btnPanel.add(exitBtn);

        add(shapePanel, BorderLayout.NORTH);
        add(opPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);
        add(btnPanel, BorderLayout.SOUTH);

        circleBtn.addActionListener(this);
        rectBtn.addActionListener(this);
        squareBtn.addActionListener(this);
        calcBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        hideAllInputs();
        setVisible(true);
    }

    private void hideAllInputs() {
        radiusField.setVisible(false);
        lengthField.setVisible(false);
        widthField.setVisible(false);
        sideField.setVisible(false);
        areaChk.setVisible(false);
        perimeterChk.setVisible(false);
        circumChk.setVisible(false);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == circleBtn)
        {
            hideAllInputs();
            radiusField.setVisible(true);
            areaChk.setVisible(true);
            circumChk.setVisible(true);
        } 
        else if (e.getSource() == rectBtn) 
        {
            hideAllInputs();
            lengthField.setVisible(true);
            widthField.setVisible(true);
            areaChk.setVisible(true);
            perimeterChk.setVisible(true);
        } 
        else if (e.getSource() == squareBtn) 
        {
            hideAllInputs();
            sideField.setVisible(true);
            areaChk.setVisible(true);
            perimeterChk.setVisible(true);
        } 
        else if (e.getSource() == calcBtn)
        {
            String result = "";
            try 
            {
                if (circleBtn.isSelected()) 
                {
                    double r = Double.parseDouble(radiusField.getText());
                    if (areaChk.isSelected()) 
                    	result += "Circle Area: " + (Math.PI * r * r) + "\n";
                    if (circumChk.isSelected()) 
                    	result += "Circle Circumference: " + (2 * Math.PI * r) + "\n";
                } 
                else if (rectBtn.isSelected())
                {
                    double l = Double.parseDouble(lengthField.getText());
                    double w = Double.parseDouble(widthField.getText());
                    if (areaChk.isSelected()) 
                    	result += "Rectangle Area: " + (l * w) + "\n";
                    if (perimeterChk.isSelected())
                    	result += "Rectangle Perimeter: " + (2 * (l + w)) + "\n";
                } 
                else if (squareBtn.isSelected()) 
                {
                    double s = Double.parseDouble(sideField.getText());
                    if (areaChk.isSelected())
                    	result += "Square Area: " + (s * s) + "\n";
                    if (perimeterChk.isSelected()) 
                    	result += "Square Perimeter: " + (4 * s) + "\n";
                }
                JOptionPane.showMessageDialog(this, result, "Result", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if (e.getSource() == exitBtn)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) 
    {
        new ShapeCalculatorU();
    }
}
