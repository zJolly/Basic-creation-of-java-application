import javax.swing.*;
import java.awt.GridLayout;

public class MyGridLayout extends JFrame
{
private JPanel p;
private JButton button; 
private JTextField text;
private int W_SIZE = 500; 
private int H_SIZE = 406;

public MyGridLayout()
{ 
    setSize(W_SIZE, H_SIZE);
    init();
}

private void init(){
p = new JPanel(); 
p.setLayout(new GridLayout(4,3));
JLabel l = new JLabel("Inserisci testo qui:");
button = new JButton("Ok");
text= new JTextField(20);
p.add(l);
p.add(text); 
p.add(button);
add(p);
}
}