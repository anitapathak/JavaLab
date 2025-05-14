package example;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
//impott java.awt.event.ActionListener;

public class eg {
public static void main(String[] args) {
    JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 
        
        JLabel l1= new JLabel("Word");
        l1.setBounds(100,100,50,30);
        frame.add(l1);
        JTextField t1= new JTextField();
        t1.setBounds(200,100,50,30);
        frame.add(t1);
         
        JButton b1=new JButton("Reversse");
        b1.setBounds(200,150,100,30);
        frame.add(b1);

    JLabel l2=new JLabel("result");
    l2.setBounds(200,200,100,30);
    frame.add(l2);
    
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = t1.getText();  
            StringBuilder reversedStr = new StringBuilder(s);  
            reversedStr.reverse();  
            String s1 = reversedStr.toString();  
            l2.setText("Result: " + s1);  
        }
    });

    frame.setVisible(true);
}
}
