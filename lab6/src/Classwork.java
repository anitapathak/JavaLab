
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Classwork implements ActionListener{
    JRadioButton jb1, jb2, jb3;
    JCheckBox jc1, jc2, jc3;
    JLabel l1, l2, l3;
    JComboBox <String>j1;
    JButton btn;
    JFrame frame;

    public Classwork() {
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jc1 = new JCheckBox("DSA");
        jc1.setBounds(240, 100, 100, 30);
        frame.add(jc1);

        jc2 = new JCheckBox("Java");
        jc2.setBounds(350, 100, 100, 30);
        frame.add(jc2);

        jc3 = new JCheckBox("Web Tech");
        jc3.setBounds(450, 100, 100, 30);
        frame.add(jc3);
        
        l1 = new JLabel("Chose the subject you Like:");
        l1.setBounds(20, 100, 200, 30);
        frame.add(l1);

        l2 = new JLabel("Chose your favorite subject:");
        l2.setBounds(20, 150, 200, 30);
        frame.add(l2);

        jb1 = new JRadioButton("DSA");
        jb1.setBounds(240, 150, 100, 30);
        frame.add(jb1);

        jb2 = new JRadioButton("Java");
        jb2.setBounds(350, 150, 100, 30);
        frame.add(jb2);

        jb3 = new JRadioButton("Web Tech");
        jb3.setBounds(450, 150, 100, 30);
        frame.add(jb3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);

        l3 = new JLabel("select the subject you Like:");
        l3.setBounds(20, 200, 200, 30);
        frame.add(l3);

        String[] str = { "Select an option", "DSA", "Java", "web tech" };
        j1 = new JComboBox<>(str);
        j1.setBounds(240, 200, 200, 30);
        frame.add(j1);


        btn=new JButton("Submit");
        btn.setBounds(250, 250, 100, 30);
        frame.add(btn);
        btn.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Classwork();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,"Form submited!", "Form Submission", JOptionPane.INFORMATION_MESSAGE);
    }
}
