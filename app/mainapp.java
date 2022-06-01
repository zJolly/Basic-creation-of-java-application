import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class mainapp implements ActionListener
{
    private int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private JButton button;
    public mainapp()
            {
                frame = new JFrame();
                
                button = new JButton("SUS");
                button.addActionListener((ActionListener) this);
                label = new JLabel("Click: 0");
                
                
                panel = new JPanel();
                panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
                panel.setLayout(new GridLayout(0,1));
                
                frame.add(panel, BorderLayout.CENTER);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Geng");
                frame.pack();
                frame.setVisible(true);
            }
     public static void main(String[] args)
    {
        new mainapp();
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText("Click: "+count);
    }
}
