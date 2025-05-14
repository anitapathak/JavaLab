package SwingGUI;

import java.awt.FlowLayout;
import java.awt.event.*; 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frameexmp {
    public static void main(String[] args) {
        JFrame frame=new JFrame("sum calculator");
        JTextField t1=new JTextField(10);
        frame.add(t1);
        JTextField t2=new JTextField(10);
        frame.add(t2);
        JButton b=new JButton("Sum");
        frame.add(b);
        JLabel L=new JLabel("Results: ");
        frame.add(L);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int sum = num1 + num2;
                    L.setText("Result: " + sum);
               
            }
        });
        
         frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
   

}
