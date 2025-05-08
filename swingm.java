import javax.swing.*;
class swing_menu extends JFrame
{
public static void main(String[] args)
{
swing_menu f = new swing_menu();
f.setSize(500,500);
f.setTitle("NOTEPAD");
f.setVisible(true);
}
swing_menu()
{
JMenuBar mb = new JMenuBar();

JMenu file = new JMenu("File");
JMenu edit = new JMenu("edit");
JMenuItem m1 = new JMenuItem("New");
JMenuItem m2 = new JMenuItem("Open");
JMenuItem m3 = new JMenuItem("Cut");
JMenuItem m4 = new JMenuItem("Copy");
JMenuItem m5 = new JMenuItem("Save");

file.add(m1);
file.add(m2);
file.add(m3);
file.add(m4);
file.add(m5);

mb.add(file);
mb.add(edit);

setJMenuBar(mb);
JTextArea ta = new JTextArea(20,50);
this.add(ta);
}
}


