package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewCustomersPage extends JFrame {
    public ViewCustomersPage() {
        setTitle("Banking Application - View Customers");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Assuming you have some mechanism to retrieve and display customer data
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Sample customer data
        String customers = "Customer 1\nCustomer 2\nCustomer 3";

        textArea.setText(customers);

        add(scrollPane);

        setVisible(true);
    }
}
