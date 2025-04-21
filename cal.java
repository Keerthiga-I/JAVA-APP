import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class calculator implements ActionListener
{
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton addButton,subtractButton,multiplyButton,divideButton,equalButton,clearButton;
	JPanel panel;
	Font font = new Font("Arial",Font.BOLD,20);
	double number1,number2,result;
	char operation;
	public calculator()
	{
		createGUI();
	}
	public void createGUI()
	{
		frame = new JFrame("CALCULATOR");
		frame.setSize(300,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField();
		textField.setBounds(20,20,240,40);
		textField.setBackground(Color.WHITE);
		textField.setFont(font);
		frame.add(textField);
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.PINK);
		panel.setBounds(20,80,240,240);
		for(int i=0; i<10;i++)
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(font);
		}
	addButton = new JButton("+");
	subtractButton = new JButton("-");
	multiplyButton = new JButton("*");
	divideButton = new JButton("/");
	equalButton = new JButton("=");
	clearButton = new JButton("C");
	addButton.addActionListener(this);
	subtractButton.addActionListener(this);
	multiplyButton.addActionListener(this);
	divideButton.addActionListener(this);
	equalButton.addActionListener(this);
	clearButton.addActionListener(this);
	addButton.setFont(font);
	subtractButton.setFont(font);
	multiplyButton.setFont(font);
	divideButton.setFont(font);
	equalButton.setFont(font);
	clearButton.setFont(font);
	panel.add(numberButtons[7]);
	panel.add(numberButtons[8]);
	panel.add(numberButtons[9]);
	panel.add(divideButton);
	panel.add(numberButtons[4]);
	panel.add(numberButtons[5]);
	panel.add(numberButtons[6]);
	panel.add(multiplyButton);
	panel.add(numberButtons[1]);
	panel.add(numberButtons[2]);
	panel.add(numberButtons[3]);
	panel.add(subtractButton);
	panel.add(numberButtons[0]);
	panel.add(clearButton);
	panel.add(equalButton);
	panel.add(addButton);
	frame.add(panel);
	frame.setVisible(true);
	}
    public void actionPerformed(ActionEvent e)
	{
		for(int i =0; i <10; i++)
		{
			if(e.getSource() == numberButtons[i])
			{
				textField.setText(textField.getText()+i);
			}
		}
		if(e.getSource() == addButton)
		{
			number1 = Double.parseDouble(textField.getText());
			operation = '+';
			textField.setText("");
		}
		if(e.getSource() == multiplyButton)
		{
			number1 = Double.parseDouble(textField.getText());
			operation = '*';
			textField.setText("");
		}
		if(e.getSource() == divideButton)
		{
			number1 = Double.parseDouble(textField.getText());
			operation = '/';
			textField.setText("");
		}
		if(e.getSource() == equalButton)
		{
			number2 = Double.parseDouble(textField.getText());
			switch (operation)
			{
				case '+':
				  result = number1 + number2;
				  break;
				case '-':
				  result = number1 - number2;
				  break;
				case '*':
				  result = number1 * number2;
				  break;
				case '/':
				   result = number1 / number2;
				   break;
			}
		textField.setText(String.valueOf(result));
		}
		if (e.getSource() == clearButton)
		{
			textField.setText("");
		}
	}
	public static void main(String[] args)
	{
		new calculator();
	}
}
				  
		
	
	 