import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Withdrawl extends JFrame implements ActionListener{

    JButton withdraw, back;
    JTextField amount;
    Withdrawl(){

        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setBounds(170, 300, 400, 20);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170,350,320,25);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(350, 10);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == withdraw){
            String number = amount.getText();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter amount you want to Withdraw");
            } else{
                JOptionPane.showMessageDialog(null, "Rs" + number + "Deposited Successfully");
                JOptionPane.showMessageDialog(null, "Thank You for Banking with us");
                setVisible(false);
                // new Transaction().setVisible(true);
            }
        } else if(e.getSource() == back){
            setVisible(false);
            new Transaction().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Withdrawl();
    }
}

