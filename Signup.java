import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
// import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField, fnameTextField, dobTextField, genderTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;

    Signup(){
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel label = new JLabel("Application Form No:" + random); 
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(155,20,600,38);
        add(label);

        JLabel personaldetails = new JLabel("Page 1: Personal Details"); 
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personaldetails.setBounds(290,80,400,30);
        add(personaldetails);

        JLabel name = new JLabel("Name:"); 
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140,400,30);
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:"); 
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 190,400,30);
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:"); 
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dobTextField = new JTextField();
        dobTextField.setBounds(300,240,400,30);
        dobTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(dobTextField);

        JLabel gender = new JLabel("Gender:"); 
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,100, 20);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,100, 20);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel email = new JLabel("Email Address:"); 
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 340,400,30);
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(emailTextField);

        JLabel marrtial = new JLabel("Marrtial Status:"); 
        marrtial.setFont(new Font("Raleway", Font.BOLD, 20));
        marrtial.setBounds(100,390,200,30);
        add(marrtial);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100, 20);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100, 20);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(600,390,100, 20);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup grp = new ButtonGroup();
        grp.add(married);
        grp.add(unmarried);
        grp.add(other);

        JLabel address = new JLabel("Address:"); 
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440,400,30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressTextField);

        JLabel city = new JLabel("City:"); 
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490,400,30);
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityTextField);

        JLabel state = new JLabel("State:"); 
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(300, 540,400,30);
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stateTextField);

        JLabel pincode = new JLabel("PinCode:"); 
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setBounds(300, 590,400,30);
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pinTextField);

        next = new JButton("NEXT");
        next.setBounds(600, 650, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = dobTextField.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String martial = "null";
        if(married.isSelected()){
            martial = "Married";
        } else if(unmarried.isSelected()){
            martial = "Unamrried";
        } else if(other.isSelected()){
            martial = "other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinTextField.getText();

        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Fname is Required");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "DOB is Required");
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            else if(pincode.equals("")){
                JOptionPane.showMessageDialog(null, "PinCode is Required");
            } 
            
                // Conn c = new Conn();
                // String sql = "insert into signup values(`"+formno+"`, `"+name+"`, `"+fname+"`, `"+dob+"`, `"+gender+"`, `"+email+"`, `"+martial+"`, `"+address+"`, `"+city+"`, `"+state+"`, `"+pincode+"`,)" ;
                // c.s.executeUpdate(sql);

                setVisible(false);
                new SignupTwo().setVisible(true);
            

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws Exception {
        new Signup();
     }    
}
