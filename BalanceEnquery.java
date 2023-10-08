import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BalanceEnquery extends JFrame implements ActionListener{

    JButton back;

    BalanceEnquery(){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel balance = new JLabel("Your Account Balance is Rs: 0");
        balance.setBounds(220, 400, 500, 25);
        balance.setFont(new Font("Raleway", Font.BOLD, 16));
        balance.setForeground(Color.WHITE);
        image.add(balance);

        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == back){
            setVisible(false);
            new Transaction().setVisible(true);
        }
    }
    public static void main(String[] args) throws Exception {
        new BalanceEnquery();
    }
}
