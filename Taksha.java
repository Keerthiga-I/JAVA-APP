import java.awt.*;
class Taksha extends Frame
{
public static void main(String[] args)
{
Taksha f = new Taksha();
f.setSize(800,600);
f.setTitle("TAKSHA");
f.setLayout(null);
f.setVisible(true);
}
Taksha()
{

this.setBackground(Color.WHITE);

Panel p1 = new Panel();
p1.setLayout(null);
p1.setBackground(Color.ORANGE);
p1.setBounds(0, 30, 800, 150);

Label l0 = new Label("TAKSHASHILA UNIVERSITY");
Label l1 = new Label("(State Private University)");
Label l2 = new Label("Ongur,Tindivanam,Villupuram Dist");


Font f0 = new Font("Arial",Font.BOLD,29);
Font f1 = new Font("Arial",Font.BOLD,25);
Font f2 = new Font("Arial",Font.BOLD,24);
l0.setFont(f0);
l0.setForeground(Color.RED);
l1.setFont(f1);
l2.setFont(f2);

l0.setBounds(180,10,400,30);
l1.setBounds(180,40,400,30);
l2.setBounds(180,70,400,30);

p1.add(l0);
p1.add(l1);
p1.add(l2);
this.add(p1);

Panel p2 = new Panel();
p2.setLayout(null);
p2.setBackground(Color.YELLOW);
p2.setBounds(0,180,800,50);

Label l3 = new Label("STUDENT MARK LIST");
l3.setFont(f0);
l3.setBounds(200,10,400,30);
p2.add(l3);
this.add(p2);

Label l11 = new Label("ENROLLMENT NO");
l11.setBounds(50,250,150,25);
this.add(l11);
TextField t1 = new TextField(20);
t1.setBounds(250,250,200,25);
this.add(t1);

Label l12 = new Label("NAME OF THE STUDENT");
l12.setBounds(50,280,150,25);
this.add(l12);
TextField t2 = new TextField(20);
t2.setBounds(250,280,200,25);
this.add(t2);

Label l13 = new Label("JAVA PROGRAM MARK");
l13.setBounds(50,310,150,25);
this.add(l13);
TextField t3 = new TextField(20);
t3.setBounds(250,310,200,25);
this.add(t3);

Label l14 = new Label("COMPUTER NETWORK MARK");
l14.setBounds(50,340,180,25);
this.add(l14);
TextField t4 = new TextField(20);
t4.setBounds(250,340,200,25);
this.add(t4);

Label l15 = new Label("OPERATING SYSTEM MARK");
l15.setBounds(50,370,180,25);
this.add(l15);
TextField t5 = new TextField(20);
t5.setBounds(250,370,200,25);
this.add(t5);

Label l16 = new Label("TOTAL MARK");
l16.setBounds(50,400,150,25);
this.add(l16);
TextField t6 = new TextField(20);
t6.setBounds(250,400,200,25);
this.add(t6);


Label l17 = new Label("AVERAGE MARK");
l17.setBounds(50,430,150,25);
this.add(l17);
TextField t7 = new TextField(20);
t7.setBounds(250,430,200,25);
this.add(t7);


Button b1 = new Button("SUMBIT");
b1.setBackground(Color.PINK);
b1.setBounds(300,470,100,30);
this.add(b1);

}
}