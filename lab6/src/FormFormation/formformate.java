
package FormFormation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class formformate implements ActionListener {
    JLabel l1, l2, l3, l4, l6, l7;
    JRadioButton jb1, jb2, jb3;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JComboBox j1;
    JCheckBox jc;
    JButton btn;
    JFrame frame;

    public formformate() {
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Name: ");
        l1.setBounds(50, 50, 100, 30);
        frame.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(180, 50, 100, 30);
        frame.add(tf1);

        l2 = new JLabel("CRN:");
        l2.setBounds(50, 100, 100, 30);
        frame.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(180, 100, 100, 30);
        frame.add(tf2);

        
        l7 = new JLabel("Email:");
        l7.setBounds(50, 150, 100, 30);
        frame.add(l7);

        tf5 = new JTextField();
        tf5.setBounds(180, 150, 200, 30);
        frame.add(tf5);

        l3 = new JLabel("Gender:");
        l3.setBounds(50, 200, 100, 30);
        frame.add(l3);

        jb1 = new JRadioButton("Male");
        jb1.setBounds(180, 200, 80, 30);
        frame.add(jb1);

        jb2 = new JRadioButton("Female");
        jb2.setBounds(250, 200, 80, 30);
        frame.add(jb2);

        jb3 = new JRadioButton("Other");
        jb3.setBounds(340, 200, 90, 30);
        frame.add(jb3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);

        l4 = new JLabel("Blood group:");
        l4.setBounds(50, 250, 150, 30);
        frame.add(l4);

        String[] str = {"Select an option", "A+", "O-", "O+","AB+","B+","B-"};
        j1 = new JComboBox<>(str);
        j1.setBounds(180, 250, 200, 30);
        frame.add(j1);

        jc = new JCheckBox("I accept data submission:");
        jc.setBounds(50, 300, 200, 30);
        frame.add(jc);
        jc.addActionListener(this);

        btn = new JButton("Submit");
        btn.setBounds(250, 350, 100, 30);
        btn.setEnabled(false);
        frame.add(btn);
        btn.addActionListener(this);

        

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new formformate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jc) {
            btn.setEnabled(jc.isSelected()); 
        } else {
            String gender = "";
            if (jb1.isSelected()) gender = "Male";
            else if (jb2.isSelected()) gender = "Female";
            else if (jb3.isSelected()) gender = "Other";

            String name = tf1.getText();
            String crn = tf2.getText();
            String email = tf5.getText();
            Object Blood_group = j1.getSelectedItem();

            JOptionPane.showMessageDialog(
                    frame,
                    "Name: " + name + "\nCRN: " + crn + "\nEmail: " + email + "\nGender: " + gender + "\nblood group: " + Blood_group,
                    "Form Submitted",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}

   

   
   
   
   
    
    

