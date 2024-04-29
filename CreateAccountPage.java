package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateAccountPage extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public CreateAccountPage() {
        setTitle("Banking Application - Create Account");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton createAccountButton = new JButton("Create Account");

        createAccountButton.addActionListener(this);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(createAccountButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Perform account creation (you would replace this with your own logic)
        JOptionPane.showMessageDialog(this, "Account created successfully!");

        // Clear fields after account creation
        usernameField.setText("");
        passwordField.setText("");
    }
}
