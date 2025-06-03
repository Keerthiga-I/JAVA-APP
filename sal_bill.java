import java.awt.*;
import java.awt.event.*;
 
class SalBill extends Frame implements ActionListener 
{
TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
 
public static void main(String[] args) {
SalBill f = new SalBill();
f.setSize(800, 800);
f.setTitle("Salary Bill Receipt");
f.setLayout(null);
f.setVisible(true);
}
 
SalBill() {
this.setBackground(new Color(245, 245, 245));
 
Panel p1 = new Panel();
p1.setLayout(null);
p1.setBackground(Color.RED);
p1.setBounds(0, 30, 800, 150);  
 
Label l0 = new Label("ABC INTERNATIONAL [P] Ltd.");
l0.setFont(new Font("Arial", Font.BOLD, 24));
l0.setBounds(180, 30, 500, 30);
p1.add(l0);
 
Label l11 = new Label("Ongur, Tindivanam, Villupuram");
l11.setFont(new Font("Arial", Font.PLAIN, 18));
l11.setBounds(200, 60, 400, 20);
p1.add(l11);
 
this.add(p1); 
        
Panel p2 = new Panel();
p2.setLayout(null);
p2.setBackground(Color.PINK);
p2.setBounds(0, 180, 800, 50);
 
Label l12 = new Label("Salary Bill Receipt");
l12.setFont(new Font("Arial", Font.BOLD, 22));
l12.setBounds(270, 10, 300, 30);
p2.add(l12);
 
this.add(p2);  
 
Label l1 = new Label("Employee ID:");
l1.setBounds(50, 230, 150, 25);
add(l1);
t1 = new TextField(20);
t1.setBounds(220, 230, 200, 25);
add(t1);
 
Label l2 = new Label("Employee Name:");
l2.setBounds(50, 260, 150, 25);
add(l2);
t2 = new TextField(20);
t2.setBounds(220, 260, 200, 25);
add(t2);
 
Label l3 = new Label("Basic Salary:");
l3.setBounds(50, 290, 150, 25);
add(l3);
t3 = new TextField(20);
t3.setBounds(220, 290, 200, 25);
add(t3);
 
Button b = new Button("SUBMIT");
b.setBounds(220, 330, 100, 30);
b.setBackground(Color.PINK);
b.addActionListener(this);
add(b);
 
t4 = addField("Bonus (20%)", 380);
t5 = addField("Increment (10%)", 410);
t6 = addField("Overtime (5%)", 440);
t7 = addField("Grand Total", 470);
 
t8 = addField("LIC (2%)", 510);
t9 = addField("HRA (3%)", 540);
t10 = addField("Net Salary", 570);
 
      
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
dispose();
}
});
}
 
private TextField addField(String label, int y) {
Label l = new Label(label + ":");
l.setBounds(50, y, 150, 25);
add(l);
TextField tf = new TextField(20);
tf.setBounds(220, y, 200, 25);
add(tf);
tf.setEditable(false);
return tf;
}
 
public void actionPerformed(ActionEvent ae) {
try {
int salary = Integer.parseInt(t3.getText());

int bonus = salary * 20 / 100;
int increment = salary * 10 / 100;
int overtime = salary * 5 / 100;
 
int grandTotal = salary + bonus + increment + overtime;
 
int lic = salary * 2 / 100;
int hra = salary * 3 / 100;
int netTotal = grandTotal - lic - hra;
t4.setText(String.valueOf(bonus));
t5.setText(String.valueOf(increment));
t6.setText(String.valueOf(overtime));
t7.setText(String.valueOf(grandTotal));
t8.setText(String.valueOf(lic));
t9.setText(String.valueOf(hra));
t10.setText(String.valueOf(netTotal));
}
catch (NumberFormatException e) {
t10.setText("Invalid salary input!");
}
}
}
