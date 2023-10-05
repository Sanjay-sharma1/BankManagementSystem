import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(150,20, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(300, 50, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Railway", Font.BOLD, 28));
        cardno.setBounds(150, 170, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(350, 170, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Railway", Font.BOLD, 28));
        pin.setBounds(150, 240, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350, 240, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        login = new JButton("LOG IN");
        login.setBounds(350, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(500, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(350, 340, 250, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(250,100); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ae.getSource() == login){
            setVisible(false);
            new Transaction().setVisible(true);
        } else if(ae.getSource() == signup){
            setVisible(false);
            new Signup().setVisible(true);
        }
    }
}