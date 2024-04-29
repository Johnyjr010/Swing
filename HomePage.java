package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {
    public HomePage() {
        setTitle("Banking Application - Home");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to the Banking Application!");
        JButton createAccountButton = new JButton("Create Account");
        JButton viewCustomersButton = new JButton("View All Customers");

        createAccountButton.addActionListener(e -> new CreateAccountPage());
        viewCustomersButton.addActionListener(e -> new ViewCustomersPage());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(label);
        panel.add(createAccountButton);
        panel.add(viewCustomersButton);

        add(panel);

        setVisible(true);
    }
}
