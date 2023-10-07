import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ministatement extends JFrame implements ActionListener{

    JButton rs100, rs500, rs1000, rs2000, rs5000, rs10000, exit;
    Ministatement(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter money you want to withdraw.");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text); 

        rs100 = new JButton("100");
        rs100.setBounds(170, 415, 150,30);
        rs100.addActionListener(this);
        image.add(rs100);

        rs500 = new JButton("500");
        rs500.setBounds(355, 415, 150,30);
        rs500.addActionListener(this);
        image.add(rs500);

        rs1000 = new JButton("1000");
        rs1000.setBounds(170, 450, 150,30);
        rs1000.addActionListener(this);
        image.add(rs1000);

        rs2000 = new JButton("2000");
        rs2000.setBounds(355, 450, 150,30);
        rs2000.addActionListener(this);
        image.add(rs2000);

        rs5000 = new JButton("5000");
        rs5000.setBounds(170, 485, 150, 30);
        rs5000.addActionListener(this);
        image.add(rs5000);

        rs10000 = new JButton("10000");
        rs10000.setBounds(355, 485, 150, 30);
        rs10000.addActionListener(this);
        image.add(rs10000);

        exit = new JButton("BACK");
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
            setVisible(false);
            new Transaction().setVisible(true);
        } else if (e.getSource() == rs100){
            JOptionPane.showMessageDialog(null, "Rs 100 Debited Successfully");
        } 
         else if (e.getSource() == rs500){
            JOptionPane.showMessageDialog(null, "Rs 500 Debited Successfully");
         
        } else if (e.getSource() == rs1000){
            JOptionPane.showMessageDialog(null, "Rs 1000 Debited Successfully");
        
        } else if (e.getSource() == rs2000){
            JOptionPane.showMessageDialog(null, "Rs 2000 Debited Successfully");
        
        } else if (e.getSource() == rs5000){
            JOptionPane.showMessageDialog(null, "Rs 5000 Debited Successfully");
         
        } else if (e.getSource() == rs10000){
            JOptionPane.showMessageDialog(null, "Rs 10000 Debited Successfully");
        } 
    }
    public static void main(String[] args) throws Exception{
        new Fastcash();
    }
}
