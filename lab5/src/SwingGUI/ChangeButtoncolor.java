package SwingGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeButtoncolor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Direct Color Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Red Button (changes to green when clicked)
        JButton redButton = new JButton("Red Button");
        redButton.setBackground(Color.RED);
        redButton.setOpaque(true);
        redButton.setBorderPainted(false);
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redButton.setBackground(Color.GREEN);
                redButton.setText("Now Green");
            }
        });

        // Green Button (changes to red when clicked)
        JButton greenButton = new JButton("Green Button");
        greenButton.setBackground(Color.GREEN);
        greenButton.setOpaque(true);
        greenButton.setBorderPainted(false);
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greenButton.setBackground(Color.RED);
                greenButton.setText("Now Red");
            }
        });

        frame.add(redButton);
        frame.add(greenButton);
        frame.setVisible(true);
    }
}


