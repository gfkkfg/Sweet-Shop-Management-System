import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1,tf2;
    JButton btn1,btn2;
    String uname,pword;
    login(){

        Font ft = new Font("serif",Font.ITALIC,25);
        this.getContentPane().setBackground(new Color(250, 170, 68));
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("GfK sweets");l3.setFont(ft);
        tf1 = new JTextField();
        tf2 = new JTextField();
        btn1 = new JButton("Login");    btn2 = new JButton("Sign up");

        l1.setBounds(50,50,150,30);l1.setForeground(new Color(0,0,0));
        l2.setBounds(50,100,150,30);l2.setForeground(new Color(0,0,0));
        l3.setBounds(100,8,200,40);l3.setForeground(new Color(8, 15, 174));
        tf1.setBounds(150,50,150,25);
        tf2.setBounds(150,100,150,25);
        btn1.setBounds(50,150,100,30);btn1.setForeground(new Color(0,0,0));
        btn2.setBounds(180,150,100,30);btn2.setForeground(new Color(0,0,0));
        btn1.addActionListener(this);   btn2.addActionListener(this);
        btn1.setBackground(new Color(5, 126, 7)); btn2.setBackground(new Color(211, 18, 6));

        this.add(l1);this.add(l2);this.add(l3);this.add(tf1);this.add(tf2);this.add(btn1);this.add(btn2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login Page");
        this.setSize(350,250);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent ae){
            try{
                uname = tf1.getText();
                pword = tf2.getText();
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//ADMIN//Desktop//sweetshop//sssm.accdb");
                PreparedStatement ps = con.prepareStatement("select * from account where uname = '" + uname + "' and pword = '" + pword + "'");
                ResultSet rs = ps.executeQuery();
                if(ae.getSource() == btn1){
                    if(rs.next()){
                        items itm = new items();
                        itm.setVisible(true);
                        this.dispose();
                    }else if(uname.equals("admin") & pword.equals("admin")){
                        items itm = new items();
                        itm.pl3.add(itm.b2);
                        itm.setVisible(true);
                    } else{
                        JOptionPane.showMessageDialog(null,"Invalie User :(","User",JOptionPane.WARNING_MESSAGE);
                    }
                }else if(ae.getSource() == btn2){
                    signup sign = new signup();
                    sign.setVisible(true);
                    this.dispose();
                }
            }
            catch (ClassNotFoundException cnfex){
                System.out.println(cnfex);
            }
            catch(SQLException sqe){
                System.out.println(sqe);
            }
    }
}

class log {
    public static void main (String args []){
        login logiin = new login();
        logiin.setVisible(true);
    }
}