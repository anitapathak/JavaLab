package calculatorBasics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JTextField tf1, tf2;
    JLabel lb1, lb2, lb3;
    JButton btn1, btn2, btn3, btn4;

    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        lb1 = new JLabel("First number: ");
        lb1.setBounds(100, 50, 130, 30);
        frame.add(lb1);
        lb2 = new JLabel("Second number: ");
        lb2.setBounds(100, 100, 130, 30);
        frame.add(lb2);
        tf1 = new JTextField();
        tf1.setBounds(250, 50, 200, 30);
        frame.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(250, 100, 200, 30);
        frame.add(tf2);

        btn1 = new JButton("Add");
        btn1.setBounds(100, 150, 100, 30);
        frame.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Subtract");
        btn2.setBounds(250, 150, 100, 30);
        frame.add(btn2);
        btn2.addActionListener(this);
        
        btn3 = new JButton("multiply");
        btn3.setBounds(100, 200, 100, 30);
        frame.add(btn3);
        btn3.addActionListener(this);

        btn4 = new JButton("Divide");
        btn4.setBounds(250, 200, 100, 30);
        frame.add(btn4);
        btn4.addActionListener(this);
        lb3 = new JLabel();
        lb3.setBounds(200, 250, 100, 30);
        frame.add(lb3);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double val1 = Double.parseDouble(tf1.getText());
        double val2 = Double.parseDouble(tf2.getText());
        double result = 0;
        if (e.getSource() == btn1) {
            result = val1 + val2;
        } else if (e.getSource() == btn2) {
            result = val1 - val2;
        } else if (e.getSource() == btn3) {
            result = val1 * val2;
        } else {
            if (val2 != 0) {
                result = val1 / val2;
            } else {
                lb3.setText(" not able to find result!");
            }

        }
        lb3.setText("Result is " + result);
    };

    public static void main(String[] args) {
        new Calculator();
    }

}
