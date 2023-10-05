// import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// import java.awt.event.*;
import java.awt.event.ActionListener;


public class SignupTwo extends JFrame implements ActionListener {
    
    @SuppressWarnings("unchecked")    
    JComboBox religionfield, category, income, education, occupation;
    JTextField addressTextField, cityTextField;
    JButton next;
    JRadioButton yesRadioButton,noRadioButton,noButton,yesButton;

    SignupTwo(){
        setLayout(null);
        setTitle("New Account Application form Page :2");

        JLabel additionaldetails = new JLabel("Page 1: Additional Details"); 
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetails.setBounds(290,80,400,30);
        add(additionaldetails);

        JLabel religion = new JLabel("Religion:"); 
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);

        String religionarr[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        @SuppressWarnings("unchecked");
        religionfield = new JComboBox(religionarr);
        religionfield.setBounds(300,140,400,30);
        religionfield.setFont(new Font("Raleway", Font.BOLD, 14));
        religionfield.setBackground(Color.WHITE);
        add(religionfield);

        JLabel fname = new JLabel("Category:"); 
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String categoryarr[] = {"General", "Sc", "St", "OBC", "Other"};

        category = new JComboBox(categoryarr);
        category.setBounds(300, 190,400,30);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:"); 
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomearr[] = {"Null", "10,000 - 50,000", "50,000 - 1 LAKH", "1 LAKH - 2 LAKH", "More than 2 LAKHS"};

        income = new JComboBox(incomearr);
        income.setBounds(300,240,400,30);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        add(income);

        JLabel gender = new JLabel("Educational"); 
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email = new JLabel("Qualifications:"); 
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,320,200,30);
        add(email);

        String educationarr[] = {"Non-Graduated", "Graduated", "Post Graduate", "Doctrate", "Others"};
        
        education = new JComboBox(educationarr);
        education.setBounds(300, 305,400,30);
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        add(education);

        JLabel marrtial = new JLabel("Occupation:"); 
        marrtial.setFont(new Font("Raleway", Font.BOLD, 20));
        marrtial.setBounds(100,370,200,30);
        add(marrtial);

        String occupationarr[] = {"Employeed", "Unemployed", "Student", "Fresher", "Other"};
        
        occupation = new JComboBox(occupationarr); 
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBounds(300,370,400,30);
        add(occupation);

        JLabel address = new JLabel("PAN Number:"); 
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,430,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 430,400,30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressTextField);

        JLabel city = new JLabel("Aadhar Number:"); 
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490,400,30);
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityTextField);

        JLabel state = new JLabel("Senior Citizen:"); 
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,550,200,30);
        add(state);

        yesRadioButton = new JRadioButton("Yes");
        yesRadioButton.setBounds(300, 550, 100, 30);
        add(yesRadioButton);
        noRadioButton = new JRadioButton("No");
        noRadioButton.setBounds(450, 550, 100, 30);
        add(noRadioButton);
        ButtonGroup btngrp = new ButtonGroup();
        btngrp.add(yesRadioButton);
        btngrp.add(noRadioButton);

        JLabel pincode = new JLabel("Existing Account:"); 
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,610,200,30);
        add(pincode);

        yesButton = new JRadioButton("Yes");
        yesButton.setBounds(300, 610, 100, 30);
        add(yesButton);
        noButton = new JRadioButton("No");
        noButton.setBounds(450, 610, 100, 30);
        add(noButton);
        ButtonGroup buttongrp = new ButtonGroup();
        buttongrp.add(yesButton);
        buttongrp.add(noButton);

        next = new JButton("NEXT");
        next.setBounds(600, 670, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new SignupThree().setVisible(true);
    }

    public static void main(String[] args) {
        new SignupTwo();
    }

}
