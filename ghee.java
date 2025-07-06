import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ghee extends JFrame implements ItemListener{
    JRadioButton mysurpa,boondhiladdu,athirasam,badusha,modhiladdu,chandrakala,jangri,wheathalwa,apsihalwa,sonpapadi;
    ImageIcon mysurpaic,boondhiladduic,athirasamic,badushaic,modhiladduic,chandrakalaic,jangriic,wheathalwaic,apsihalwaic,sonpapadiic;
    ButtonGroup bg;
    ghee(){
        bg = new ButtonGroup();
        mysurpaic = new ImageIcon("Mysurpak.jpeg");
        Image im1 = mysurpaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic1 = new ImageIcon(im1);

        boondhiladduic = new ImageIcon("boondiladdu.jpeg");
        Image im2 = boondhiladduic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic2 = new ImageIcon(im2);

        athirasamic = new ImageIcon("adhirasam.jpeg");
        Image im3 = athirasamic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic3 = new ImageIcon(im3);

        badushaic = new ImageIcon("badusha.jpeg");
        Image im4 = badushaic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic4 = new ImageIcon(im4);

        modhiladduic = new ImageIcon("modhiladdu.jpeg");
        Image im5 = modhiladduic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic5 = new ImageIcon(im5);

        chandrakalaic = new ImageIcon("chandrakala.jpeg");
        Image im6 = chandrakalaic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic6 = new ImageIcon(im6);

        jangriic = new ImageIcon("jangri.jpeg");
        Image im7 = jangriic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic7 = new ImageIcon(im7);

        wheathalwaic = new ImageIcon("wheathalwa.jpeg");
        Image im8 = wheathalwaic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic8 = new ImageIcon(im8);

        apsihalwaic = new ImageIcon("apsihalwa.jpeg");
        Image im9 = apsihalwaic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic9 = new ImageIcon(im9);

        sonpapadiic = new ImageIcon("sonapapadi.jpeg");
        Image im10 = sonpapadiic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imic10 = new ImageIcon(im10);

        mysurpa = new JRadioButton("Mysur Pak");mysurpa.setIcon(imic1);mysurpa.addItemListener(this);mysurpa.setForeground(new Color(0,0,255));
        boondhiladdu = new JRadioButton("Boondhi Laddu");boondhiladdu.setIcon(imic2);boondhiladdu.addItemListener(this);boondhiladdu.setForeground(new Color(0,0,255));
        athirasam = new JRadioButton("Adhirasam");athirasam.setIcon(imic3);athirasam.addItemListener(this);athirasam.setForeground(new Color(0,0,255));
        badusha = new JRadioButton("Badusha");badusha.setIcon(imic4);badusha.addItemListener(this);badusha.setForeground(new Color(0,0,255));
        modhiladdu = new JRadioButton("Modhi Laddu");modhiladdu.setIcon(imic5);modhiladdu.addItemListener(this);modhiladdu.setForeground(new Color(0,0,255));
        chandrakala = new JRadioButton("Chandrakala");chandrakala.setIcon(imic6);chandrakala.addItemListener(this);chandrakala.setForeground(new Color(0,0,255));
        jangri = new JRadioButton("Jangri");jangri.setIcon(imic7);jangri.addItemListener(this);jangri.setForeground(new Color(0,0,255));
        wheathalwa = new JRadioButton("Wheat Halwa");wheathalwa.setIcon(imic8);wheathalwa.addItemListener(this);wheathalwa.setForeground(new Color(0,0,255));
        apsihalwa = new JRadioButton("Apsi Halwa");apsihalwa.setIcon(imic9);apsihalwa.addItemListener(this);apsihalwa.setForeground(new Color(0,0,255));
        sonpapadi = new JRadioButton("Sonpapadi");sonpapadi.setIcon(imic10);sonpapadi.addItemListener(this);sonpapadi.setForeground(new Color(0,0,255));

        bg.add(mysurpa);bg.add(boondhiladdu);bg.add(athirasam);bg.add(badusha);bg.add(modhiladdu);bg.add(chandrakala);
        bg.add(jangri);bg.add(wheathalwa);bg.add(apsihalwa);bg.add(sonpapadi);

    }
    public void itemStateChanged(ItemEvent ie){
        mysurpaf mysur = new mysurpaf();    boondhiladduf bladdu = new boondhiladduf();     athirasamf atrsm = new athirasamf();
        badushaf bdsha = new badushaf();    modhiladduf mdladdu = new modhiladduf();    chandrakalaf cdrakala = new chandrakalaf();
        jangrif jngri = new jangrif();      wheathalwaf whthalwa = new wheathalwaf();   apsihalwaf apshalwa = new apsihalwaf();
        sonapapadif sonpapdi = new sonapapadif();

        if(mysurpa.isSelected()){
            mysur.setVisible(true);
        }else if(boondhiladdu.isSelected()){
            bladdu.setVisible(true);
        }else if(athirasam.isSelected()){
            atrsm.setVisible(true);
        }else if(badusha.isSelected()){
            bdsha.setVisible(true);
        }else if(modhiladdu.isSelected()){
            mdladdu.setVisible(true);
        }else if(chandrakala.isSelected()){
            cdrakala.setVisible(true);
        }else if(jangri.isSelected()){
            jngri.setVisible(true);
        }else if(wheathalwa.isSelected()){
            whthalwa.setVisible(true);
        }else if(apsihalwa.isSelected()){
            apshalwa.setVisible(true);
        }else if(sonpapadi.isSelected()){
            sonpapdi.setVisible(true);
        }
    }
}



class mysurpaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc2,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    mysurpaf(){
        this.setTitle("Mysur Pak");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.62/-");pl2.add(pc1);pc1.setBounds(10, 10, 100, 30);
        pc2 = new JLabel("2PC - Rs.120/-");pl2.add(pc2);pc2.setBounds(10, 40, 100, 30);
        g250 = new JLabel("250g - Rs.283/-");pl2.add(g250);g250.setBounds(10, 80, 100, 30);
        g500 = new JLabel("500g - Rs.563/-");pl2.add(g500);g500.setBounds(10, 120, 100, 30);

        wgt.setBounds(20,20,80,30);weight.setBounds(100, 20, 80, 30);pl1.add(wgt);pl1.add(weight);
        quantity.setBounds(20,70,80,30);quantity1.setBounds(100,70,80,30);pl1.add(quantity);pl1.add(quantity1);
        save.setBounds(50,130,100,30);pl1.add(save);save.addActionListener(this);

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
        if(wt == 1)                            
            prc += qt * 62;
        else if(wt == 2)
            prc += qt * 120;
        else if(wt == 250)
            prc += qt * 283;
        else if(wt == 500)
            prc += qt * 563;  
        total ghtot = new total(wt,qt,prc,swt);
    }
}

class boondhiladduf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc4,pc8,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    boondhiladduf(){

        this.setTitle("Boondhi Laddu");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.60/-");pl2.add(pc1);pc1.setBounds(10, 10, 150, 30);
        pc4 = new JLabel("4PC - Rs.214/-");pl2.add(pc4);pc4.setBounds(10, 40, 150, 30);
        pc8 = new JLabel("8PC - Rs.434/-");pl2.add(pc8);pc8.setBounds(10, 80, 150, 30);
        g250 = new JLabel("250g - Rs.281/-");pl2.add(g250);g250.setBounds(10, 120, 150, 30);
        g500 = new JLabel("500g - Rs.563/-");pl2.add(g500);g500.setBounds(10, 160, 150, 30);

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
        if(wt == 1)
            prc += qt * 60;
        else if(wt == 4)
            prc += qt * 214;
        else if(wt == 8)
            prc += qt * 434;
        else if(wt == 250)
            prc += qt * 281;
        else if(wt == 500)
            prc += qt * 563;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class athirasamf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    athirasamf(){
        this.setTitle("Athirasam");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.207/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500kg - Rs.410/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
            prc += qt * 207;
        else if(wt == 500)
            prc += qt * 410;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class badushaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc4,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    badushaf(){
        this.setTitle("Badusha");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.55/-");pl2.add(pc1);pc1.setBounds(10, 10, 150, 30);
        pc4 = new JLabel("4PC - Rs.228/-");pl2.add(pc4);pc4.setBounds(10, 40, 150, 30);
        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 80, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 120, 150, 30);

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
        if(wt == 1)
            prc += qt * 55;
        else if(wt == 4)
            prc += qt * 228;
        else if(wt == 250)
            prc += qt * 265;
        else if(wt == 500)
            prc += qt * 530;
        total ghtot = new total(wt,qt,prc,swt);
    }
} 
class modhiladduf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc4,pc8,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    modhiladduf(){
        this.setTitle("Modhi Laddu");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.60/-");pl2.add(pc1);pc1.setBounds(10, 10, 150, 30);
        pc4 = new JLabel("4PC - Rs.195/-");pl2.add(pc4);pc4.setBounds(10, 40, 150, 30);
        pc8 = new JLabel("8PC - Rs.395/-");pl2.add(pc8);pc8.setBounds(10, 80, 150, 30);
        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 120, 150, 30);
        g500 = new JLabel("500kg - Rs.530/-");pl2.add(g500);g500.setBounds(10, 160, 150, 30);

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
        if(wt == 1)
            prc += qt * 60;
        else if(wt == 4)
            prc += qt * 195;
        else if(wt == 8)
            prc += qt * 395;
        else if(wt == 250)
            prc += qt * 265;
        else if(wt == 500)
            prc += qt * 530;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class chandrakalaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    chandrakalaf(){
        this.setTitle("Chandrakala");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 1, 150, 30);
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
    public void actionPerformed(ActionEvent ae){int wt = Integer.parseInt(weight.getText());
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
class jangrif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    jangrif(){
        this.setTitle("Jangri");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 1, 150, 30);
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
class wheathalwaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g300,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    int price = 0;
    wheathalwaf(){
        this.setTitle("Wheat Halwa");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g300 = new JLabel("300g - Rs.350/-");pl2.add(g300);g300.setBounds(10, 10, 150, 30);

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
        if(wt == 300)
            prc += qt * 350;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class apsihalwaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    int price = 0;
    apsihalwaf(){
        this.setTitle("Apsi Halwa");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.350/-");pl2.add(g250);g250.setBounds(10, 1, 150, 30);
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
class sonapapadif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    int price = 0;
    sonapapadif(){
        this.setTitle("Sonpapadi");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 1, 150, 30);
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