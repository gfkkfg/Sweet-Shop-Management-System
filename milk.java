import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class milk extends JFrame implements ItemListener{
    JRadioButton thiratipal,milkpeda,kesarpeda,vanillaburfi,kesarburfi,milkapple,milktomato;
    ImageIcon thiratipalic,milkpedaic,kesarpedaic,vanillaburfiic,kesarburfiic,milkappleic,milktomatoic;
    ButtonGroup bg;
    milk(){
        bg = new ButtonGroup();
        ImageIcon thiratipalic = new ImageIcon("theratipal.jpeg");
        Image im1 = thiratipalic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic1 = new ImageIcon(im1);

        ImageIcon milkpedaic = new ImageIcon("milkpeda.jpeg");
        Image im2 = milkpedaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic2 = new ImageIcon(im2);

        ImageIcon kesarpedaic = new ImageIcon("kesarpeda.jpeg");
        Image im3 = kesarpedaic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic3 = new ImageIcon(im3);

        ImageIcon vanillaburfiic = new ImageIcon("vanilaburfi.jpeg");
        Image im4 = vanillaburfiic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic4 = new ImageIcon(im4);

        ImageIcon kesarburfiic = new ImageIcon("kesarburfi.jpeg");
        Image im5 = kesarburfiic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic5 = new ImageIcon(im5);

        ImageIcon milkappleic = new ImageIcon("milkapple.jpeg");
        Image im6 = milkappleic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic6 = new ImageIcon(im6);

        ImageIcon milktomatoic = new ImageIcon("milktomato.jpeg");
        Image im7 = milktomatoic.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE);
        ImageIcon imic7 = new ImageIcon(im7);

        thiratipal = new JRadioButton("Thiratipal");thiratipal.setIcon(imic1);thiratipal.addItemListener(this);thiratipal.setForeground(new Color(0,0,255));
        milkpeda = new JRadioButton("Milk Peda");milkpeda.setIcon(imic2);milkpeda.addItemListener(this);milkpeda.setForeground(new Color(0,0,255));
        kesarpeda = new JRadioButton("Kesar Peda");kesarpeda.setIcon(imic3);kesarpeda.addItemListener(this);kesarpeda.setForeground(new Color(0,0,255));
        vanillaburfi = new JRadioButton("Vanilla Burfi");vanillaburfi.setIcon(imic4);vanillaburfi.addItemListener(this);vanillaburfi.setForeground(new Color(0,0,255));
        kesarburfi = new JRadioButton("Kesar Burfi");kesarburfi.setIcon(imic5);kesarburfi.addItemListener(this);kesarburfi.setForeground(new Color(0,0,255));
        milkapple = new JRadioButton("Milk Apple");milkapple.setIcon(imic6);milkapple.addItemListener(this);milkapple.setForeground(new Color(0,0,255));
        milktomato = new JRadioButton("Milk Tomato");milktomato.setIcon(imic7);milktomato.addItemListener(this);milktomato.setForeground(new Color(0,0,255));

        bg.add(thiratipal);bg.add(milkpeda);bg.add(kesarpeda);bg.add(vanillaburfi);bg.add(kesarburfi);
        bg.add(milkapple);bg.add(milktomato);
    }    
    public void itemStateChanged(ItemEvent ie){
        thiratipalf thrtipal = new thiratipalf();   milkpedaf mkpeda = new milkpedaf();     kesarpedaf ksrpeda = new kesarpedaf();
        vanillaburfif vnlburfi = new vanillaburfif();   kesarburfif ksrburfi = new kesarburfif(); milkapplef mkapple = new milkapplef();
        milktomatof mktomato = new milktomatof();

        if(thiratipal.isSelected()){
            thrtipal.setVisible(true);
        }else if(milkpeda.isSelected()){
            mkpeda.setVisible(true);
        }else if(kesarpeda.isSelected()){
            ksrpeda.setVisible(true);
        }else if(vanillaburfi.isSelected()){
            vnlburfi.setVisible(true);
        }else if(kesarburfi.isSelected()){
            ksrburfi.setVisible(true);
        }else if(milkapple.isSelected()){
            mkapple.setVisible(true);
        }else if(milktomato.isSelected()){
            mktomato.setVisible(true);
        }
    }
}
class thiratipalf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g300,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    thiratipalf(){
        this.setTitle("Thiratipal");
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
class milkpedaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc8,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    milkpedaf(){
        this.setTitle("Milk Peda");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc8 = new JLabel("8PC - Rs.393/-");pl2.add(pc8);pc8.setBounds(10, 10, 150, 30);
        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 40, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 80, 150, 30);

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
        if(wt == 8)
            prc += qt * 393;
        else if(wt == 250)
            prc += qt * 265;
        else if(wt == 500)
            prc += qt * 530;
        total ghtot = new total(wt,qt,prc,swt);
    }
}
class kesarpedaf extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel pc8,g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    kesarpedaf(){
        this.setTitle("Kesar Peda");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        pc8 = new JLabel("8PC - Rs.390/-");pl2.add(pc8);pc8.setBounds(10, 10, 150, 30);
        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 40, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 80, 150, 30);

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
        if(wt == 8)
            prc += qt * 390;
        else if(wt == 250)
            prc += qt * 265;
        else if(wt == 500)
            prc += qt * 530;
        total ghtot = new total(wt,qt,prc,swt);
    }
} 
class vanillaburfif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    vanillaburfif(){
        this.setTitle("Vanilla Burfi");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
class kesarburfif extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    kesarburfif(){
        this.setTitle("Kesar Burfi");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
class milkapplef extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    milkapplef(){
        this.setTitle("Milk Apple");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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
class milktomatof extends JFrame implements ActionListener{
    JPanel pl1,pl2;
    JLabel g250,g500,wgt,quantity;
    JTextField weight,quantity1;
    JButton save;
    milktomatof(){
        this.setTitle("Milk Tomato");
        pl1 = new JPanel();
        pl2 = new JPanel();
        save = new JButton("Add to Cart");save.addActionListener(this);
        wgt = new JLabel("PC / Weight");
        quantity = new JLabel("Quantity");

        weight = new JTextField();
        quantity1 = new JTextField();

        g250 = new JLabel("250g - Rs.265/-");pl2.add(g250);g250.setBounds(10, 10, 150, 30);
        g500 = new JLabel("500g - Rs.530/-");pl2.add(g500);g500.setBounds(10, 40, 150, 30);

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