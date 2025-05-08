import java.awt.*;
import java.awt.event.*;
class arith extends Frame implements ActionListener
{
TextField t1,t2,t3,t4;
Button b1,b2,b3,b4;	
public static void main(String args[])
{
arith f = new arith();
f.setTitle("ARITHMETIC");
f.setSize(500,400);
f.setVisible(true);
}

arith()
{
this.setLayout(null);
this.setBackground(new Color(245,245,245));
Panel p1=new Panel();
Label l0= new Label("ARITHMETIC OPERATION");
p1.setBackground(Color.PINK);
Font f0= new Font("Arial",Font.BOLD,32);
l0.setFont(f0);
p1.add(l0);
this.add(p1);
p1.setBounds(0,30,500,50);
Label l1 = new Label("First Number");
Label l2 = new Label("Second Number");
Label l3 = new Label("Result");
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
b1 = new Button("ADD");
b1.setBackground(Color.GREEN);
b2 = new Button("SUB");
b2.setBackground(Color.WHITE);
b3 = new Button("MUL");
b3.setBackground(Color.YELLOW);
b4 = new Button("DIV");
b4.setBackground(Color.ORANGE);
this.add(t1);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(t1);
this.add(t2);
this.add(t3);
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
l0.setBounds(100,50,250,30);
l1.setBounds(50,100,150,30);
l2.setBounds(50,150,150,30);
l3.setBounds(50,200,150,30);
t1.setBounds(200,100,150,30);
t2.setBounds(200,150,150,30);
t3.setBounds(200,200,150,30);
b1.setBounds(50,250,80,30);
b2.setBounds(150,250,80,30);
b3.setBounds(250,250,80,30);
b4.setBounds(350,250,80,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{

if(ae.getSource() == b1)
{
String s1 = t1.getText();
String s2 = t2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a + b;
t3.setText("" + c);
}	
if(ae.getSource() == b2)
{
String s1 = t1.getText();
String s2 = t2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a - b;
t3.setText("" + c);
}	
if(ae.getSource() == b3)
{
String s1 = t1.getText();
String s2 = t2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a * b;
t3.setText("" + c);
}
if(ae.getSource() == b4)
{
String s1 = t1.getText();
String s2 = t2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a / b;
t3.setText("" + c);
}		
}
}
