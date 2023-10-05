import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;


public class SignupThree extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    SignupThree(){

        setLayout(null);

        JLabel l1 = new JLabel("Page: 3 Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,100,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,150,150,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,150,200,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,190,150,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,190,250,20);
        add(r4);

        ButtonGroup grp = new ButtonGroup();
        grp.add(r1);
        grp.add(r2);
        grp.add(r3);
        grp.add(r4);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100,250,200,30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-1598");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330,250,300,30);
        add(number);

        JLabel yourcard = new JLabel("Your 16 digit Card Number");
        yourcard.setFont(new Font("Raleway", Font.BOLD, 12));
        yourcard.setBounds(100,280,300,20);
        add(yourcard);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,320,200,30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330,320,300,30);
        add(pnumber);

        JLabel yourpin = new JLabel("Your 4 Digit Password");
        yourpin.setFont(new Font("Raleway", Font.BOLD, 12));
        yourpin.setBounds(100,350,300,20);
        add(yourpin);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,400,200,30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 450, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 450, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("Eamil and SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 550, 200, 30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 550, 200, 30);
        add(c6);

        c7 = new JCheckBox("I Hereby declares that above given details are correct.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 630, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(290, 680, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(450, 680, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        setSize(850, 800);
        setLocation(350, 10);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            JOptionPane.showMessageDialog(null, "Account Created successfully");
            setVisible(false);
            new Login().setVisible(true);
        } else if(e.getSource() == cancel){
            setVisible(false);
        }
    }

    public static void main(String[] args) throws Exception{
        new SignupThree();
    }

}
