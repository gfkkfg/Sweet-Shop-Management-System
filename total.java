import java.sql.*;
import javax.swing.*;

class total{
    String wgt,qty,prc,swt;
    total(int wgtt,int qtyy,int prcc,String swtt){
        wgt = String.valueOf(wgtt);
        qty = String.valueOf(qtyy);
        prc = String.valueOf(prcc);
        swt = swtt;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//ADMIN//Desktop//sweetshop//sssm.accdb");
            PreparedStatement ps = con.prepareStatement("insert into total (sweet, weight, quantity, price) values (? , ? , ? , ? )");
            ps.setString(1, swt);
            ps.setString(2, wgt);
            ps.setString(3, qty);   
            ps.setString(4, prc);

            int in = ps.executeUpdate();
            if (in>0)
                JOptionPane.showMessageDialog(null , "Added");
            con.commit();
            con.close();
            ps.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
