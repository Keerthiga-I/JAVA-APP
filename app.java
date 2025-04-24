import java.awt.*;
class app 
{
public static void main(String[] args)
{
Frame f = new Frame();
f.setTitle("NOTEPAD");
f.setSize(500,400);
f.setLayout(null);
f.setVisible(true);

f.setBackground(new Color(245,245,245));
Label l1 = new Label("REG NO");
Label l2 = new Label("USER NAME");
Label l3 = new Label("PASSWORD");
TextField t1 = new TextField(20);
TextField t2 = new TextField(20);
TextField t3 = new TextField(20);
Button b1 = new Button("LOGIN");
l1.setForeground(Color.RED);
l2.setForeground(Color.PINK);
l3.setForeground(Color.GREEN);

l1.setBounds(50,100,150,30);
l2.setBounds(50,150,150,30);
l3.setBounds(50,200,150,30);

t1.setBounds(200,100,150,30);
t2.setBounds(200,150,150,30);
t3.setBounds(200,200,150,30);

b1.setBounds(200,250,100,30);
b1.setBackground(Color.PINK);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
}
}
