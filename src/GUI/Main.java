package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends Parent implements ActionListener {

    public Main() {

        setSize(500, 400);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);

        Group1 = new ButtonGroup();
        B1 = new JRadioButton("Manger");
        B2 = new JRadioButton("Supervisor");
        B3 = new JRadioButton("InventoryClerk");
        B4 = new JRadioButton("HR");
        B5 = new JRadioButton("Cashier");
        Bu1 = new JButton("Submit");

        B1.setSelected(true);
        B2.setSelected(true);
        B3.setSelected(true);
        B4.setSelected(true);
        B5.setSelected(true);

        B1.setActionCommand("Manager");
        B2.setActionCommand("Supervisor");
        B3.setActionCommand("InventoryClerk");
        B4.setActionCommand("HR");
        B5.setActionCommand("Cashier");
        Bu1.addActionListener(this);

        B1.setBounds(10, 10, 100, 50);
        B2.setBounds(10, 60, 100, 50);
        B3.setBounds(10, 110, 100, 50);
        B4.setBounds(10, 160, 100, 50);
        B5.setBounds(10, 210, 100, 50);
        Bu1.setBounds(350, 300, 100, 50);

        Group1.add(B1);
        Group1.add(B2);
        Group1.add(B3);
        Group1.add(B4);
        Group1.add(B5);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(Bu1);

    }

    public static void main(String[] args) {
        Main I = new Main();

        I.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource()==Bu1){
            if(B1.isSelected()){
                B1.getActionCommand();
                this.setVisible(false);
                new ILogIN().setVisible(true);
            }else   if(B2.isSelected()){
                B2.getActionCommand();
                this.setVisible(false);
                new ILogIN().setVisible(true);
            }else   if(B3.isSelected()){
                B3.getActionCommand();
                this.setVisible(false);
                new ILogIN().setVisible(true);
            }else   if(B4.isSelected()){
                B4.getActionCommand();
                this.setVisible(false);
                new ILogIN().setVisible(true);
            }  else if(B5.isSelected()){
                B5.getActionCommand();
                this.setVisible(false);
                new ILogIN().setVisible(true);
            }
            
    }
    }
}