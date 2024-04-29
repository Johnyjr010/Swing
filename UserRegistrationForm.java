package Swing;

import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm extends Frame implements ActionListener {
    Label lblFirstName, lblLastName, lblDOB, lblGender, lblPlace, lblContact;
    TextField txtFirstName, txtLastName, txtDOB, txtPlace, txtContact;
    CheckboxGroup genderGroup;
    Checkbox maleCheckbox, femaleCheckbox;
    Button btnSubmit;

    public UserRegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(8, 2));
        setResizable(false);

        lblFirstName = new Label("First Name:");
        lblLastName = new Label("Last Name:");
        lblDOB = new Label("Date of Birth (YYYY-MM-DD):");
        lblGender = new Label("Gender:");
        lblPlace = new Label("Place:");
        lblContact = new Label("Contact Number:");

        txtFirstName = new TextField();
        txtLastName = new TextField();
        txtDOB = new TextField();
        txtPlace = new TextField();
        txtContact = new TextField();

        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);

        btnSubmit = new Button("Submit");
        btnSubmit.addActionListener(this);

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblDOB);
        add(txtDOB);
        add(lblGender);
        add(maleCheckbox);
        add(new Label()); 
        add(femaleCheckbox);
        add(lblPlace);
        add(txtPlace);
        add(lblContact);
        add(txtContact);
        add(new Label()); 
        add(btnSubmit);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String dob = txtDOB.getText();
            String gender = maleCheckbox.getState() ? "Male" : "Female";
            String place = txtPlace.getText();
            String contact = txtContact.getText();

            
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Date of Birth: " + dob);
            System.out.println("Gender: " + gender);
            System.out.println("Place: " + place);
            System.out.println("Contact Number: " + contact);
        }
    }

    public static void main(String[] args) {
        UserRegistrationForm form = new UserRegistrationForm();
        form.setVisible(true);
    }
}
