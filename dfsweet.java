import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dfsweet extends JFrame implements ItemListener{
    JRadioButton badamhalwa,bombayhalwa,apsihalwa;
    ImageIcon badamhalwaic,bombayhalwaic,apsihalwaic;
    ButtonGroup bg;
    dfsweet(){
        bg = new ButtonGroup();
        badamhalwaic = new ImageIcon("badamhalwa.jpeg");
        Image im1 = badamhalwaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic1 = new ImageIcon(im1);

        bombayhalwaic = new ImageIcon("bombayhalwa.jpeg");
        Image im2 = bombayhalwaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic2 = new ImageIcon(im2);

        apsihalwaic = new ImageIcon("apsihalwa.jpeg");
        Image im3 = apsihalwaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic3 = new ImageIcon(im3);

        badamhalwa = new JRadioButton("Badam Halwa");badamhalwa.setIcon(imic1);badamhalwa.addItemListener(this);badamhalwa.setForeground(new Color(0,0,255));
        bombayhalwa = new JRadioButton("Bombay Halwa");bombayhalwa.setIcon(imic2);bombayhalwa.addItemListener(this);bombayhalwa.setForeground(new Color(0,0,255));
        apsihalwa = new JRadioButton("Apsi Halwa");apsihalwa.setIcon(imic3);apsihalwa.addItemListener(this);apsihalwa.setForeground(new Color(0,0,255));
        
        bg.add(badamhalwa);bg.add(bombayhalwa);bg.add(apsihalwa);
    }
    public void itemStateChanged(ItemEvent ie){
        badamhalwaf bdmhalwa = new badamhalwaf();   bombayhalwaf bmbayhlwa = new bombayhalwaf();
        apsihalwaaf apshlwa = new apsihalwaaf();  

        if(badamhalwa.isSelected()){
            bdmhalwa.setVisible(true);
        }else if(bombayhalwa.isSelected()){
            bmbayhlwa.setVisible(true);
        }else if(apsihalwa.isSelected()){
            apshlwa.setVisible(true);
        }
    }
}
class badamhalwaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    badamhalwaf(){
        this.setTitle("Badam Halwa");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g500 = new JLabel("500kg - Rs.550/-");pl2.add(g500);g500.setBounds(10, 10, 150, 30);

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
        if(wt == 500)
            prc += qt * 550;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class bombayhalwaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    bombayhalwaf(){
        this.setTitle("Bombay Halwa");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500kg - Rs.530/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
        if(wt == 250)
            prc += qt * 265;
        else if(wt == 500)
            prc += qt * 530;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class apsihalwaaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    apsihalwaaf(){
        this.setTitle("Apsi Halwa");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.350/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500kg - Rs.700/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
        if(wt == 250)
            prc += qt * 350;
        else if(wt == 500)
            prc += qt * 700;
        total ghtot = new total(wt,qt,prc,swt);
    }
}