import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class signup extends JFrame implements ActionListener{
    JLabel fname,lname,email,uname,mob,pass,cnfpass,spname;
    JTextField fnametf,lnametf,emailtf,unametf,mobtf,passtf,cnfpasstf;
    JButton btn1,btn2;
    signup(){
        
        Font ft = new Font("serif",Font.ITALIC,25);
        this.getContentPane().setBackground(new Color(0, 249, 242));

        spname = new JLabel("GfK Sweets");spname.setFont(ft);
        fname = new JLabel("First Name");   lname = new JLabel("Last Name");
        email = new JLabel("Email");
        uname = new JLabel("Username");
        mob = new JLabel("Mobile");
        pass = new JLabel("Password");      cnfpass = new JLabel("Confirm Password");

        fnametf = new JTextField();         lnametf = new JTextField();
        emailtf = new JTextField();
        unametf = new JTextField();
        mobtf = new JTextField();
        passtf = new JTextField();          cnfpasstf = new JTextField();

        btn1 = new JButton("Sign up");    btn2 = new JButton("Login");

        spname.setBounds(130,18,200,30);spname.setForeground(new Color(255,0,0));
        fname.setBounds(50,50,150,30);this.add(fname);       fnametf.setBounds(200,50,150,25);this.add(fnametf);
        lname.setBounds(50,80,150,30);this.add(lname);      lnametf.setBounds(200,80,150,25);this.add(lnametf);
        email.setBounds(50,110,150,30);this.add(email);     emailtf.setBounds(200,110,150,25);this.add(emailtf);
        mob.setBounds(50,140,150,30);this.add(mob);         mobtf.setBounds(200,140,150,25);this.add(mobtf);
        uname.setBounds(50,170,150,30);this.add(uname);     unametf.setBounds(200,170,150,25);this.add(unametf);
        pass.setBounds(50,200,150,30);this.add(pass);       passtf.setBounds(200,200,150,25);this.add(passtf);
        cnfpass.setBounds(50,230,150,30);this.add(cnfpass); cnfpasstf.setBounds(200,230,150,25);this.add(cnfpasstf);
        btn1.setBounds(100,270,100,30);btn1.setForeground(new Color(0,0,0));
        btn2.setBounds(220,270,100,30);btn2.setForeground(new Color(0,0,0));
        btn1.addActionListener(this);   btn2.addActionListener(this);
        btn1.setBackground(new Color(5, 126, 7)); btn2.setBackground(new Color(211, 18, 6));

        this.add(spname);
        this.add(btn1);this.add(btn2);
        this.setTitle("Sign up");
        this.setSize(450,350);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent ae){
        String fname = fnametf.getText().toString();
        String lname = lnametf.getText().toString();
        String email = emailtf.getText().toString();
        String uname =  unametf.getText().toString();  
        String mob = mobtf.getText().toString();
        String pword = passtf.getText().toString();

        if(ae.getSource()==btn2){
            login loggin = new login();
            loggin.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource()==btn1){
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//ADMIN//Desktop//sweetshop//sssm.accdb");
                PreparedStatement ps = con.prepareStatement("insert into account (fname , lname , email , mob , uname , pword) values (? , ? , ? , ? , ? , ?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, email);
                ps.setString(4, mob);
                ps.setString(5, uname);
                ps.setString(6, pword);

                int ins = ps.executeUpdate();
                if(ins>0)
                    JOptionPane.showMessageDialog(null , "Successfully signuped","User",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null , "Can't Sign up","User",JOptionPane.WARNING_MESSAGE);
                    
                con.commit();
                con.close();
                ps.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class sign{
    public static void main(String[] args) {
        new signup();
    }
}