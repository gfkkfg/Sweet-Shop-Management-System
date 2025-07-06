import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class cart extends JFrame implements ActionListener{
    JLabel l1;
    JTextArea ta1;
    JButton b1,b2,back;
    JTextField tf1;
    int tot = 0;
    String sweet,weight,quantity,price,email;
    cart(){
        
        this.setTitle("Cart");
        this.setSize(700,700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font ft = new Font("serif",Font.ITALIC,12); Font ft1 = new Font("Algerian",Font.ITALIC,25);
        this.getContentPane().setBackground(new Color(0, 250, 154));

        l1 = new JLabel("CART");l1.setFont(ft1);this.add(l1);l1.setForeground(new Color(75, 0, 130));l1.setBounds(250,15,300,30);

        ta1 = new JTextArea(50,50);ta1.setFont(ft);ta1.setBounds(50,50,600,400);
        this.add(ta1);

        b1 = new JButton("Find Total");b1.addActionListener(this);b1.setBackground(new Color(255,102,178));b1.setForeground(new Color(102,0,204));
        b1.setBounds(50,470,100,30);this.add(b1);

        tf1 = new JTextField();tf1.setBounds(170,470,100,30);this.add(tf1);

        b2 = new JButton("Go to Payment");b2.addActionListener(this); b2.setBackground(new Color(5, 126, 7));b2.setForeground(new Color(0,0,0));
        b2.setBounds(50,520,180,30);this.add(b2);
        back = new JButton("Previous");back.addActionListener(this);back.setBackground(new Color(211, 18, 6));this.add(back);
        back.setBounds(250,520,100,30);back.setForeground(new Color(0,0,0));

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//ADMIN//Desktop//sweetshop//sssm.accdb");
            PreparedStatement ps = con.prepareStatement("select * from total");
            ResultSet rs = ps.executeQuery();
            ta1.append("Sweet name" + "\t" + "Weight" + "\t" + "Quantity" + "\t" + "Price\n");
            while (rs.next()){
                sweet = rs.getString(1);weight = rs.getString(2);quantity = rs.getString(3);price = rs.getString(4);
                ta1.append(sweet + "\t" + weight + "\t" + quantity + "\t" + price + "\n");
                tot += Integer.parseInt(price);
            }
        }
        catch (ClassNotFoundException cnfex){
            System.out.println(cnfex);
        }
        catch(SQLException sqe){
            System.out.println(sqe);
        }
        this.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            tf1.setText("Rs." + String.valueOf(tot));
        }else if(ae.getSource() == b2){
            payment pymt = new payment();
            pymt.setVisible(true);
            this.dispose();
        }else if(ae.getSource() == back){
            items itm = new items();
            itm.setVisible(true);
            this.dispose();
        }
    }
}
class ct{
    public static void main(String[] args) {
        new cart();
    }
}