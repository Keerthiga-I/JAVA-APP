import java.awt.*;
import java.awt.event.*;

class Cal extends Frame implements ActionListener {

public static void main(String[] args) {
new Cal();
}

TextField t1;
String operator = "";
double num1 = 0, num2 = 0, memory = 0;
boolean startNewNumber = true;

Cal() {
       
setTitle("Calculator");
setSize(400, 550);
setLayout(null);
setBackground(Color.PINK);


t1 = new TextField();
t1.setBounds(30, 50, 330, 50);	
t1.setEditable(false);
add(t1);

     
Panel p = new Panel();
p.setLayout(new GridLayout(6, 4, 5, 5));
p.setBounds(30, 120, 330, 360);

String[] buttons = 
{
"MC", "MR", "M+", "M-",
"CE", "C", "BS", "1/x",
"7", "8", "9", "/",
"4", "5", "6", "*",
"1", "2", "3", "-",
"0", ".", "=", "+"
};

for (String text : buttons) {
Button b = new Button(text);
b.addActionListener(this);
p.add(b);
}

add(p);

       
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});

setVisible(true);
}

public void actionPerformed(ActionEvent ae) {
String input = ae.getActionCommand();

try {
switch (input) {
case "C":
t1.setText("");
num1 = num2 = 0;
operator = "";
startNewNumber = true;
break;

case "CE":
t1.setText("");
startNewNumber = true;
break;
                
case "BS":
String current = t1.getText();
if (current.length() > 0) {
t1.setText(current.substring(0, current.length() - 1));
}
break;

case "1/x":
double val = Double.parseDouble(t1.getText());
t1.setText(String.valueOf(1 / val));
break;

case "√":						
val = Double.parseDouble(t1.getText());
t1.setText(String.valueOf(Math.sqrt(val)));
break;

case "%":
val = Double.parseDouble(t1.getText());
t1.setText(String.valueOf(val / 100));
break;

case "MC":
memory = 0;
break;

case "MR":
t1.setText(String.valueOf(memory));
startNewNumber = true;
break;

case "M+":
memory += Double.parseDouble(t1.getText());
break;
				
				
case "M-":
memory -= Double.parseDouble(t1.getText());
break;

case "+":
case "-":
case "*":
case "/":
num1 = Double.parseDouble(t1.getText());
operator = input;
startNewNumber = true;
break;
		
case "=":
num2 = Double.parseDouble(t1.getText());
double result = 0;
switch (operator) {
case "+": result = num1 + num2; break;
case "-": result = num1 - num2; break;
case "*": result = num1 * num2; break;
case "/": result = num1 / num2; break;
}
t1.setText(String.valueOf(result));
startNewNumber = true;
break;
default:
if (startNewNumber) {
t1.setText(input);
startNewNumber = false;
} else {
t1.setText(t1.getText() + input);
}
break;
}
} 
catch (Exception e) {
t1.setText("Error");
startNewNumber = true;
}
}

}

