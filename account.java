import javax.swing.*;
import java.awt.*;;
import java.sql.*;

public class account extends JFrame{
    JLabel l1;
    JTextArea ta1;
    String fname,lname,email,mob,uname,pword;
    account(){
        this.setTitle("Account Details");
        this.setSize(700,700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font ft = new Font("serif",Font.ITALIC,12); Font ft1 = new Font("Algerian",Font.ITALIC,25);
        this.getContentPane().setBackground(new Color(0, 250, 154));

        l1 = new JLabel("Account Details");l1.setFont(ft1);this.add(l1);l1.setForeground(new Color(75, 0, 130));l1.setBounds(250,15,300,30);

        ta1 = new JTextArea(50,50);ta1.setFont(ft);ta1.setBounds(50,50,600,400);
        this.add(ta1);
        this.setLocationRelativeTo(null);
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//ADMIN//Desktop//sweetshop//sssm.accdb");
            PreparedStatement ps = con.prepareStatement("select * from account");
            ResultSet rs = ps.executeQuery();
            ta1.append("First Name" + "\t\t" + "Last Name" + "\t" + "Email Id" + "\t\t" + "Mobile No" + "\t\t" + "Username" + "\t" + "Password\n");
            while (rs.next()){
                fname = rs.getString(1);lname = rs.getString(2);email = rs.getString(3);mob = rs.getString(4);
                uname = rs.getString(5);pword = rs.getString(6);
                ta1.append(fname + "\t\t" + lname + "\t" + email + "\t" + mob + "\t" + uname + "\t" + pword + "\n");
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