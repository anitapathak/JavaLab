package SwingGUI;


import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class question1 {
    public static void main(String[] args) {
        
JFrame frame=new JFrame("exampple");
JButton btn = new JButton("Click me!");
btn.setBounds(150,150,100,30);
btn.setBackground(Color.PINK);
frame.add(btn);
btn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello ,I ama anita");
        btn.setBackground(Color.RED);
        
    }
});
frame.getContentPane().setBackground(Color.BLUE);
frame.setSize(400,400);
frame.setLayout(null);  
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);



}}
