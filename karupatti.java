import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class karupatti extends JFrame implements ItemListener{
    JRadioButton kpbadamhalwa,kpkajukatli;
    ImageIcon kpbadamhalwaic,kpkajukatliic;
    ButtonGroup bg;
    karupatti(){
        bg = new ButtonGroup();
        kpbadamhalwaic = new ImageIcon("karupattibadamhalwa.jpeg");
        Image im1 = kpbadamhalwaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic1 = new ImageIcon(im1);

        kpkajukatliic = new ImageIcon("karupattikajukatli.jpeg");
        Image im2 = kpkajukatliic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic2 = new ImageIcon(im2);

        kpbadamhalwa = new JRadioButton("Karupatti Badam Hawla");kpbadamhalwa.setIcon(imic1);kpbadamhalwa.addItemListener(this);kpbadamhalwa.setForeground(new Color(0,0,255));
        kpkajukatli = new JRadioButton("Karupatti Kaju Katli");kpkajukatli.setIcon(imic2);kpkajukatli.addItemListener(this);kpkajukatli.setForeground(new Color(0,0,255));
        
        bg.add(kpbadamhalwa);bg.add(kpkajukatli);
    }    
    public void itemStateChanged(ItemEvent ie){
        kpbadamhalwaf kpbdmhalwa = new kpbadamhalwaf();     kpkajukatlif kpkajkatli = new kpkajukatlif();

        if(kpbadamhalwa.isSelected()){
            kpbdmhalwa.setVisible(true);
        }else if(kpkajukatli.isSelected()){
            kpkajkatli.setVisible(true);
        }
    }
}
class kpbadamhalwaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g200,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    kpbadamhalwaf(){
        this.setTitle("Karupatti Badam Halwa");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g200 = new JLabel("200g - Rs.539/-");pl2.add(g200);g200.setBounds(10, 10, 150, 30);

        wgt.setBounds(20,20,80,30);weight.setBounds(100, 20, 80, 30);pl1.add(wgt);pl1.add(weight);
        quantity.setBounds(20,70,80,30);quantity1.setBounds(100,70,80,30);pl1.add(quantity);pl1.add(quantity1);
        save.setBounds(50,130,100,30);pl1.add(save);

        pl1.setBounds(0, 0, 200, 400);pl2.setBounds(200,0,200,400);pl2.setLayout(null);

        pl1.setBackground(new Color(32, 178, 170));
        pl2.setBackground(new Color(32, 178, 170));
        save.setBackground(new Color(255, 87, 51));save.setForeground(new Color(0,0,0));

        pl1.setLayout(null);this.add(pl1);this.add(pl2);pl1.setSize(200,300);pl2.setSize(200,300);
        this.setSize(400,250);this.setLayout(null); 
    }
    public void actionPerformed(ActionEvent ae){
        int wt = Integer.parseInt(weight.getText());
        int qt = Integer.parseInt(quantity1.getText());
        String swt = this.getTitle();
        int prc = 0;
        if(wt == 200)
            prc += qt * 539;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class kpkajukatlif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc9,pc18,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    kpkajukatlif(){
        this.setTitle("Karupatti kaju katli");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.65/-");pl2.add(pc1);pc1.setBounds(10, 10, 150, 30);
        pc9 = new JLabel("9PC - Rs.440/-");pl2.add(pc9);pc9.setBounds(10, 40, 150, 30);
        pc18 = new JLabel("18PC - Rs.867/-");pl2.add(pc18);pc18.setBounds(10, 70, 150, 30);
        g250 = new JLabel("250g - Rs.699/-");pl2.add(g250);g250.setBounds(10, 100, 150, 30);
        g500 = new JLabel("500g - Rs.1399/-");pl2.add(g500);g500.setBounds(10, 130, 150, 30);

        wgt.setBounds(20,20,80,30);weight.setBounds(100, 20, 80, 30);pl1.add(wgt);pl1.add(weight);
        quantity.setBounds(20,70,80,30);quantity1.setBounds(100,70,80,30);pl1.add(quantity);pl1.add(quantity1);
        save.setBounds(50,130,100,30);pl1.add(save);

        pl1.setBounds(0, 0, 200, 400);pl2.setBounds(200,0,200,400);pl2.setLayout(null);

        pl1.setBackground(new Color(32, 178, 170));
        pl2.setBackground(new Color(32, 178, 170));
        save.setBackground(new Color(255, 87, 51));save.setForeground(new Color(0,0,0));
        
        pl1.setLayout(null);this.add(pl1);this.add(pl2);pl1.setSize(200,300);pl2.setSize(200,300);pl2.setBackground(Color.GRAY);
        this.setSize(400,250);this.setLayout(null);    
    }
    public void actionPerformed(ActionEvent ae){
        int wt = Integer.parseInt(weight.getText());
        int qt = Integer.parseInt(quantity1.getText());
        String swt = this.getTitle();
        int prc = 0;
        if(wt == 1)
            prc = qt * 65;
        else if(wt == 9)
            prc = qt * 440;
        else if(wt == 18)
            prc = qt * 867;
        else if(wt == 250)
            prc = qt * 699;
        else if(wt == 500)
            prc = qt * 1399;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
