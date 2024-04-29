package Swing;

import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField displayField;
    Button[] numberButtons;
    Button addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    String operand1 = "";
    String operand2 = "";
    String operator = "";

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 300);
        setLayout(new BorderLayout());

        displayField = new TextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel(new GridLayout(4, 4));

        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(Integer.toString(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        addButton = new Button("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        subtractButton = new Button("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        multiplyButton = new Button("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        divideButton = new Button("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new Button("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "C":
                clear();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = command;
                operand1 = displayField.getText();
                displayField.setText("");
                break;
            case "=":
                operand2 = displayField.getText();
                double result = calculate();
                displayField.setText(Double.toString(result));
                operand1 = Double.toString(result);
                operator = "";
                break;
            default:
                displayField.setText(displayField.getText() + command);
                break;
        }
    }

    private void clear() {
        displayField.setText("");
        operand1 = "";
        operand2 = "";
        operator = "";
    }

     double calculate() {
        double num1 = Double.parseDouble(operand1);
        double num2 = Double.parseDouble(operand2);
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                } else {
                    return num1 / num2;
                }
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setVisible(true);
    }
}
