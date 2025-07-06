import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class items extends JFrame implements ItemListener,ActionListener{
    JRadioButton ghrb,milkswt,dfswt,krpatti,casew;
    JPanel pl1,pl2,pl3;
    JButton b1,b2;
    ButtonGroup bg;
    ImageIcon ghee,milk,dryft,karupatti,cashew;
    items(){

        this.setTitle("Sweets");
        ghee = new ImageIcon("ghee.jpeg");
        Image im1 = ghee.getImage().getScaledInstance(130, 80, Image.SCALE_REPLICATE);
        ImageIcon imic1 = new ImageIcon(im1);

        milk = new ImageIcon("milk.jpeg");
        Image im2 = milk.getImage().getScaledInstance(130, 80, Image.SCALE_REPLICATE);
        ImageIcon imic2 = new ImageIcon(im2);

        dryft = new ImageIcon("dryfruit.jpeg");
        Image im3 = dryft.getImage().getScaledInstance(130, 80, Image.SCALE_REPLICATE);
        ImageIcon imic3 = new ImageIcon(im3);

        karupatti = new ImageIcon("karupatti.jpeg");
        Image im4 = karupatti.getImage().getScaledInstance(130, 80, Image.SCALE_REPLICATE);
        ImageIcon imic4 = new ImageIcon(im4);

        cashew = new ImageIcon("cashew.jpeg");
        Image im5 = cashew.getImage().getScaledInstance(130, 80, Image.SCALE_REPLICATE);
        ImageIcon imic5 = new ImageIcon(im5);

        bg = new ButtonGroup();
        ghrb = new JRadioButton(imic1);ghrb.addItemListener(this);bg.add(ghrb);
        milkswt = new JRadioButton(imic2);milkswt.addItemListener(this);bg.add(milkswt);
        dfswt = new JRadioButton(imic3);dfswt.addItemListener(this);bg.add(dfswt);
        krpatti = new JRadioButton(imic4);krpatti.addItemListener(this);bg.add(krpatti);
        casew = new JRadioButton(imic5);casew.addItemListener(this);bg.add(casew);

        pl1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pl1.add(ghrb);pl1.add(milkswt);pl1.add(dfswt);pl1.add(krpatti);pl1.add(casew);pl1.setSize(740,100);
        pl2 = new JPanel(new GridLayout(5,1,10,10));
        pl2.setSize(500,500);
        pl3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        b1 = new JButton("Go to cart");b1.addActionListener(this);
        pl3.setSize(700,50);pl3.add(b1);b1.setForeground(new Color(0,0,0));b1.setBackground(new Color(5, 126, 7));

        b2 = new JButton("Account details");b2.addActionListener(this);
        b2.setForeground(new Color(0,0,0));b2.setBackground(new Color(5, 5, 240));

        this.getContentPane().setBackground(new Color(240,128,128));
        pl1.setBackground(new Color(240, 128, 128));pl2.setBackground(new Color(240, 128, 128));pl3.setBackground(new Color(240, 128, 128));

        pl1.setBounds(5,5,740,100);pl2.setBounds(5,105,740,530);pl3.setBounds(5,650,740,50);

        this.add(pl1,BorderLayout.NORTH);this.add(pl2,BorderLayout.CENTER);this.add(pl3,BorderLayout.SOUTH);this.setSize(780,750);this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie){
        ghee ghswt = new ghee();    milk mkswt = new milk();    dfsweet dfswt1 = new dfsweet();
        karupatti kp = new karupatti();     cashew csw = new cashew();

        if(ghrb.isSelected()){
            pl2.removeAll();
            pl2.add(ghswt.mysurpa);pl2.add(ghswt.boondhiladdu);pl2.add(ghswt.athirasam);pl2.add(ghswt.badusha);
            pl2.add(ghswt.modhiladdu);pl2.add(ghswt.chandrakala);pl2.add(ghswt.jangri);pl2.add(ghswt.wheathalwa);
            pl2.add(ghswt.apsihalwa);pl2.add(ghswt.sonpapadi);
            pl2.revalidate();
            pl2.repaint();
        }
        else if(milkswt.isSelected()){              
            pl2.removeAll();
            pl2.add(mkswt.thiratipal);pl2.add(mkswt.milkpeda);pl2.add(mkswt.kesarpeda);pl2.add(mkswt.vanillaburfi);
            pl2.add(mkswt.kesarburfi);pl2.add(mkswt.milkapple);pl2.add(mkswt.milktomato);
            pl2.revalidate();
            pl2.repaint();
        }
        else if(dfswt.isSelected()){
            pl2.removeAll();
            pl2.add(dfswt1.badamhalwa);pl2.add(dfswt1.bombayhalwa);pl2.add(dfswt1.apsihalwa);
            pl2.revalidate();
            pl2.repaint();
        }
        else if(krpatti.isSelected()){
            pl2.removeAll();
            pl2.add(kp.kpbadamhalwa);pl2.add(kp.kpkajukatli);
            pl2.revalidate();
            pl2.repaint();
        }
        else if(casew.isSelected()){
            pl2.removeAll();
            pl2.add(csw.kajukatli);pl2.add(csw.cashewbites);pl2.add(csw.cashewroll);pl2.add(csw.figkatli);
            pl2.add(csw.cashewcrumble);
            pl2.revalidate();
            pl2.repaint();
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            cart ct = new cart();
            ct.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b2){
            account act = new account();
            act.setVisible(true);
        }
    }
}