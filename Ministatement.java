import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ministatement extends JFrame {

    JButton exit;
    Ministatement(){
        setTitle("Mini Statement");
        setLayout(null);

        JLabel text = new JLabel();
        add(text);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card = new JLabel("Card No: 4168XXXXXXXX2422");
        card.setBounds(20,80,300, 20);
        add(card);

        JLabel l1 = new JLabel("Sun Oct 08 17:00:36 IST 2023   Deposit      10000");
        l1.setBounds(20,200, 500, 20);
        add(l1);
        JLabel l2 = new JLabel("Sun Oct 08 17:05:43 IST 2023   Withdrawl    1000");
        l2.setBounds(20,230, 500, 20);
        add(l2);
        JLabel l3 = new JLabel("Sun Oct 08 17:10:56 IST 2023   Withdrawl    2000");
        l3.setBounds(20,260, 500, 20);
        add(l3);

        JLabel balance = new JLabel("Your current account balance is Rs 7000");
        balance.setBounds(20,370,500,20);
        add(balance);

        setSize(400,550);
        setLocation(400, 100);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Ministatement();
    }
}
