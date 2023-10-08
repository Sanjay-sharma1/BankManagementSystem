import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener{

    JPasswordField pinTextField, repinTextField;
    JButton change, back;

    Pinchange(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("CHANGE PIN NUMBER");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setBounds(250,280,300,35);
        image.add(text);

        JLabel pintext = new JLabel("New PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Raleway", Font.BOLD, 16));
        pintext.setBounds(165,320,100,35);
        image.add(pintext);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(330,320,180,25);
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(pinTextField);

        JLabel repintext = new JLabel("Re-Enter Pin:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Raleway", Font.BOLD, 16));
        repintext.setBounds(165,360,150,35);
        image.add(repintext);

        repinTextField = new JPasswordField();
        repinTextField.setBounds(330,360,180,25);
        repinTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(repinTextField);

        change = new JButton("Change");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == change){
            try {
                String pin = pinTextField.getText();
                String repin = repinTextField.getText();
                if(pin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    return;
                }
                if(repin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                    return;
                }                 
                if(!repin.equals(pin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN dose not match");
                    pinTextField.setText("");
                    repinTextField.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                    setVisible(false);
                    new Transaction().setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } 
        else {
            setVisible(false);
            new Transaction().setVisible(true);
        }
    }

    public static void main(String[] args) throws Exception {
        new Pinchange();
    }

}
