package CalculatorUI;

import javax.swing.SwingUtilities;

public class mainClass {
public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}
