import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class payment extends JFrame implements ItemListener,ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    ButtonGroup bg;
    JButton b1,back;
    String total;
    ImageIcon ic;
    JTextField tf1,tf2;
    payment(){

        this.setTitle("Payment");
        this.setLayout(null);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font ft = new Font("Algerian",Font.ITALIC,25);
        bg = new ButtonGroup();

        cart ct = new cart();
        total = String.valueOf(ct.tot);
        this.getContentPane().setBackground(new Color(221, 139, 5));

        l1 = new JLabel("Payment Processing ...!");l1.setFont(ft);this.add(l1);l1.setForeground(new Color(75, 0, 130));
        l2 = new JLabel("Select payment method : ");this.add(l2);
        l3 = new JLabel("Rs." + total);this.add(l3);

        rb1 = new JRadioButton("Cash");bg.add(rb1);this.add(rb1);rb1.addItemListener(this);//rb1.setSelected(true);
        rb2 = new JRadioButton("Debit Card");bg.add(rb2);this.add(rb2);rb2.addItemListener(this);
        rb3 = new JRadioButton("Credit Card");bg.add(rb3);this.add(rb3);rb3.addItemListener(this);
        rb4 = new JRadioButton("Net Banking");bg.add(rb4);this.add(rb4);rb4.addItemListener(this);
        rb5 = new JRadioButton("UPI");bg.add(rb5);this.add(rb5);rb5.addItemListener(this);

        b1 = new JButton("Click to Pay");b1.addActionListener(this);this.add(b1);

        tf1 = new JTextField(); this.add(tf1); tf2 = new JTextField(); this.add(tf2);
        l4 = new JLabel("Last 6 digit Number"); this.add(l4); 
        l5 = new JLabel("CVV"); this.add(l5);
        l6 = new JLabel("Username"); this.add(l6); 
        l7 = new JLabel("Password"); this.add(l7);
        l8 = new JLabel("Scan and Pay"); this.add(l8);
    
        l4.setForeground(new Color(0,0,0));     
        l5.setForeground(new Color(0,0,0));
        l6.setForeground(new Color(0,0,0));     
        l7.setForeground(new Color(0,0,0));
        l8.setForeground(new Color(0,0,0));

        ic = new ImageIcon("qrcode.jpg");
        Image im = ic.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ic1 = new ImageIcon(im);
        l9 = new JLabel(ic1); this.add(l9);

        l1.setBounds(100,25,300,30);
        l2.setBounds(50,70,200,30);
        l3.setBounds(100,100,80,30);

        rb1.setBounds(80,130,100,30);
        rb2.setBounds(80,170,100,30);
        rb3.setBounds(80,210,100,30);
        rb4.setBounds(80,250,100,30);
        rb5.setBounds(80,290,100,30);

        b1.setBounds(80,330,100,30);b1.setForeground(new Color(0,0,0));b1.setBackground(new Color(5,126,7));
        back = new JButton("Previous");back.addActionListener(this);back.setBackground(new Color(211, 18, 6));this.add(back);
        back.setBounds(200,330,100,30);back.setForeground(new Color(0,0,0));
        this.setLocationRelativeTo(null);
    }
    public void itemStateChanged(ItemEvent ie){
        if(rb1.isSelected()){
            revalidate();   repaint();
            this.remove(l4);    this.remove(l5);    this.remove(l6);    this.remove(l7);    this.remove(l8);    this.remove(l9);
            this.remove(tf1);   this.remove(tf2);

            rb1.setBounds(80,130,100,30);
            rb2.setBounds(80,170,100,30);
            rb3.setBounds(80,210,100,30);
            rb4.setBounds(80,250,100,30);
            rb5.setBounds(80,290,100,30);

            b1.setBounds(80,330,100,30);
            back.setBounds(200,330,100,30);
        }else if(rb2.isSelected()){
            revalidate();   repaint();
            this.remove(l6);    this.remove(l7);    this.remove(l8);    this.remove(l9);
            this.add(l4);       this.add(l5);       this.add(tf1);      this.add(tf2);

            rb1.setBounds(80,130,100,30);
            rb2.setBounds(80,170,100,30);
                l4.setBounds(100,210,150,30); tf1.setBounds(250,210,150,30);
                l5.setBounds(100,250,150,30); tf2.setBounds(250,250,150,30);
            rb3.setBounds(80,290,100,30);
            rb4.setBounds(80,330,100,30);
            rb5.setBounds(80,370,100,30);

            b1.setBounds(80,420,100,30);
            back.setBounds(200,420,100,30);
        }
        else if(rb3.isSelected()){
            revalidate();   repaint();
            this.remove(l6);    this.remove(l7);    this.remove(l8);    this.remove(l9);
            this.add(l4);       this.add(l5);       this.add(tf1);      this.add(tf2);
            
            rb1.setBounds(80,130,100,30);
            rb2.setBounds(80,170,100,30);
            rb3.setBounds(80,210,100,30);
                l4.setBounds(100,250,150,30); tf1.setBounds(250,250,150,30);
                l5.setBounds(100,290,150,30); tf2.setBounds(250,290,150,30);
            rb4.setBounds(80,330,100,30);
            rb5.setBounds(80,370,100,30);

            b1.setBounds(80,420,100,30);
            back.setBounds(200,420,100,30);
        }
        else if(rb4.isSelected()){
            revalidate();   repaint();
            this.remove(l4);    this.remove(l5);    this.remove(l8);    this.remove(l9);
            this.add(l6);       this.add(l7);       this.add(tf1);      this.add(tf2);
            
            rb1.setBounds(80,130,100,30);
            rb2.setBounds(80,170,100,30);
            rb3.setBounds(80,210,100,30);
            rb4.setBounds(80,250,100,30);
                l6.setBounds(100,290,150,30); tf1.setBounds(250,290,150,30);
                l7.setBounds(100,330,150,30); tf2.setBounds(250,330,150,30);
            rb5.setBounds(80,370,100,30);

            b1.setBounds(80,420,100,30);
            back.setBounds(200,420,100,30);
        }
        else if(rb5.isSelected()){
            revalidate();   repaint();
            this.remove(l4);    this.remove(l5);    this.remove(l6);    this.remove(l7);    this.remove(tf1);   this.remove(tf2);
            this.add(l8);       this.add(l9);
            
            rb1.setBounds(80,130,100,30);
            rb2.setBounds(80,170,100,30);
            rb3.setBounds(80,210,100,30);
            rb4.setBounds(80,250,100,30);
            rb5.setBounds(80,290,100,30);
                l8.setBounds(100,330,200,30);
                l9.setBounds(125,370,100,100);

            b1.setBounds(80,480,100,30);
            back.setBounds(200,480,100,30);
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            if(rb1.isSelected() || rb2.isSelected() || rb3.isSelected() || rb4.isSelected() || rb5.isSelected()){
                JOptionPane.showMessageDialog(null,"Payment Successfully & Order Confirmed !!");
            }else{
                JOptionPane.showMessageDialog(null, "Please select any payment method !","Payment",JOptionPane.WARNING_MESSAGE);
            }
        }else if(ae.getSource() == back){
            cart ct = new cart();
            ct.setVisible(true);
            this.dispose();
        }
    }
}
