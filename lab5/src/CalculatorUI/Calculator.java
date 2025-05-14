package CalculatorUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JTextField display;
    String operator = "",currentInput="";
    double num1 = 0;

    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        // Buttons
        String[] buttons = {
            "C", "(", ")", "%",
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 10, 10));
        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = ((JButton) e.getSource()).getText();

        if (input.matches("[0-9.]")) {
            display.setText(display.getText() + input);
        } else if (input.matches("[+\\-*/%]")) {
            
                num1 = Double.parseDouble(display.getText());
                operator = input;
                //display.setText(display.getText() + " " + operator + " ");

                display.setText("");
          
            }
         else if (input.equals("=")) {
           
                double num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            display.setText("Divide by 0");
                            return;
                        }
                        result = num1 / num2;
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                }

                display.setText(String.valueOf(result));
                
            } 
         else if (input.equals("C")) {
            display.setText("");
            num1 = 0;
            operator = "";
         }  else if (input.equals("(") || input.equals(")")) {
            display.setText(display.getText() + input);
         }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

    