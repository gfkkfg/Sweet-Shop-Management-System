import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cashew extends JFrame implements ItemListener{
    JRadioButton kajukatli,cashewbites,cashewroll,figkatli,cashewcrumble;
    ImageIcon kajukatliic,cashebitesic,cashewrollic,figkatliic,cashewcrumpleic;
    ButtonGroup bg;
    cashew(){
        bg = new ButtonGroup();
        kajukatliic = new ImageIcon("kajukatli.jpeg");
        Image im1 = kajukatliic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic1 = new ImageIcon(im1);

        cashebitesic = new ImageIcon("cashewbites.jpeg");
        Image im2 = cashebitesic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic2 = new ImageIcon(im2);

        cashewrollic = new ImageIcon("cashewroll.jpeg");
        Image im3 = cashewrollic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic3 = new ImageIcon(im3);

        figkatliic = new ImageIcon("figkatli.jpeg");
        Image im4 = figkatliic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic4 = new ImageIcon(im4);

        cashewcrumpleic = new ImageIcon("cashewcrumble.jpeg");
        Image im5 = cashewcrumpleic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic5 = new ImageIcon(im5);

        kajukatli = new JRadioButton("Kaju Katli");kajukatli.setIcon(imic1);kajukatli.addItemListener(this);kajukatli.setForeground(new Color(0,0,255));
        cashewbites = new JRadioButton("Cashew Bites");cashewbites.setIcon(imic2);cashewbites.addItemListener(this);cashewbites.setForeground(new Color(0,0,255));
        cashewroll = new JRadioButton("Cashew Roll");cashewroll.setIcon(imic3);cashewroll.addItemListener(this);cashewroll.setForeground(new Color(0,0,255));
        figkatli = new JRadioButton("Fig Katli");figkatli.setIcon(imic4);figkatli.addItemListener(this);figkatli.setForeground(new Color(0,0,255));
        cashewcrumble = new JRadioButton("Cashew Crumple");cashewcrumble.setIcon(imic5);cashewcrumble.addItemListener(this);cashewcrumble.setForeground(new Color(0,0,255));

        bg.add(kajukatli);bg.add(cashewbites);bg.add(cashewroll);bg.add(figkatli);bg.add(cashewcrumble);
    }
    public void itemStateChanged(ItemEvent ie){
        kajukatlif kajktli = new kajukatlif();      cashewbitesf cswbites = new cashewbitesf();     cashewrollf cswroll = new cashewrollf();
        figkatlif figktli = new figkatlif();        cashewcrumblef cswcrumble = new cashewcrumblef();
        
        if(kajukatli.isSelected()){
            kajktli.setVisible(true);
        }else if(cashewbites.isSelected()){
            cswbites.setVisible(true);
        }else if(cashewroll.isSelected()){
            cswroll.setVisible(true);
        }else if(figkatli.isSelected()){
            figktli.setVisible(true);
        }else if(cashewcrumble.isSelected()){
            cswcrumble.setVisible(true);
        }

    }
}

class kajukatlif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc9,pc18,pc36,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    kajukatlif(){
        this.setTitle("Kajukatli");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.50/-");pl2.add(pc1);pc1.setBounds(10,10,150,30);
        pc9 = new JLabel("9PC - Rs.283/-");pl2.add(pc9);pc9.setBounds(10, 40, 150, 30);
        pc18 = new JLabel("18PC - Rs.545/-");pl2.add(pc18);pc18.setBounds(10, 70, 150, 30);
        pc36 = new JLabel("36PC - Rs.1084/-");pl2.add(pc36);pc36.setBounds(10, 100, 150, 30);
        g250 = new JLabel("250g - Rs.438/-");pl2.add(g250);g250.setBounds(10, 130, 150, 30);
        g500 = new JLabel("500g - Rs.877/-");pl2.add(g500);g500.setBounds(10, 160, 150, 30);

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
            prc += qt * 50;
        else if(wt == 9)
            prc += qt * 283;
        else if(wt == 18)
            prc += qt * 545;
        else if(wt == 36)
            prc += qt * 1084;
        else if(wt == 250)
            prc += qt * 438;
        else if(wt == 500)
            prc += qt * 877;
        total ghtot = new total(wt,qt,prc,swt);
    }
}

class cashewbitesf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc4,pc9,pc20,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    cashewbitesf(){
        this.setTitle("cashewbites");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc4 = new JLabel("1PC - Rs.207/-");pl2.add(pc4);pc4.setBounds(10,10,150,30);
        pc9 = new JLabel("9PC - Rs.489/-");pl2.add(pc9);pc9.setBounds(10, 40, 150, 30);
        pc20 = new JLabel("18PC - Rs.1053/-");pl2.add(pc20);pc20.setBounds(10, 70, 150, 30);

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
        if(wt == 4)
            prc += qt * 207;
        else if(wt == 9)
            prc += qt * 489;
        else if(wt ==20)
            prc += qt * 1053;
        total ghtot = new total(wt,qt,prc,swt);
    }
}

class cashewrollf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    cashewrollf(){
        this.setTitle("Cashew Roll");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.496/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500g - Rs.992/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
            prc += qt * 496;
        else if(wt == 500)
            prc += qt * 992;
        total ghtot = new total(wt,qt,prc,swt);
    }
}

class figkatlif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc1,pc9,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    figkatlif(){
        this.setTitle("Figkatli");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc1 = new JLabel("1PC - Rs.47/-");pl2.add(pc1);pc1.setBounds(10,10,150,30);
        pc9 = new JLabel("9PC - Rs.375/-");pl2.add(pc9);pc9.setBounds(10, 40, 150, 30);

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
            prc += qt * 47;
        else if(wt == 9)
            prc += qt * 375;
        total ghtot = new total(wt,qt,prc,swt);
    }
}

class cashewcrumblef extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc9,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    cashewcrumblef(){
        this.setTitle("Cashew Crumble");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc9 = new JLabel("9PC - Rs.480/-");pl2.add(pc9);pc9.setBounds(10, 40, 150, 30);

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
        if(wt == 9)
            prc += qt * 480;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
