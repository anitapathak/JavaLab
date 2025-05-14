package primeDisplay;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class UIPrimeDisplay implements ActionListener {
JLabel l1,l2;
JTextField t1;
JButton b1;
public UIPrimeDisplay(){
JFrame frame=new JFrame("Prime display: ");
frame.setSize(400,400);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1=new JLabel("enter the value you want:");
l1.setBounds(80, 50, 200, 30);
frame.add(l1);
l2=new JLabel("result:");
l2.setBounds(200,200,200,30);
frame.add(l2);
frame.add(l2);
t1=new JTextField();
t1.setBounds(250, 50, 100, 30);
frame.add(t1);

b1=new JButton("Display Prime");
b1.setBounds(100,150, 200, 30);
frame.add(b1);

b1.addActionListener(this);
frame.setVisible(true);
}
public static void main(String[] args) {
    new UIPrimeDisplay();
}
@Override
public void actionPerformed(ActionEvent e) {
int p=Integer.parseInt(t1.getText());
String str=" ";
for(int i=2;i<=p;i++){
int c=0;
for(int j=1;j<=i;j++){
if(i%j==0){
    c++;
}
}
if(c==2){
    //System.out.print(i +",");
    str += String.valueOf(i)+" ,";
    l2.setText("Prime No.:"+ str);
}
}
}

}

