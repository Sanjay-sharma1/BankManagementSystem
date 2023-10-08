import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transaction extends JFrame implements ActionListener{

    JButton deposit, withdraw, fastcash, ministatement, pinchange, balancsEnquery, exit;
    Transaction(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text); 

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("Cash WithDraw");
        withdraw.setBounds(355, 415, 150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("PIN Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balancsEnquery = new JButton("Balance Enquery");
        balancsEnquery.setBounds(355, 485, 150, 30);
        balancsEnquery.addActionListener(this);
        image.add(balancsEnquery);

        exit = new JButton("EXIT");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit){
            System.exit(0);
        } else if(e.getSource() == deposit){
            setVisible(false);
            new Deposit().setVisible(true);
        } else if(e.getSource() == withdraw){
            setVisible(false);
            new Withdrawl().setVisible(true);
        } else if(e.getSource() == fastcash){
            setVisible(false);
            new Fastcash().setVisible(true);
        } else if(e.getSource() == pinchange){
            setVisible(false);
            new Pinchange().setVisible(true);
        }
    }
    public static void main(String[] args) throws Exception{
        new Transaction();
    }
}
