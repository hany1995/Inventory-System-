package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Manager_GUI extends Parent implements ActionListener {
    
    public Manager_GUI() {
        
        setLocation(100, 200);
        setSize(410, 410);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        
        this.Label1 = new JLabel("Manger");
        add(Label1);
        //this.B1 = new JRadioButton("Add Supervisor");
        //add(B1);
        this.B2 = new JRadioButton("Append on HR");
        add(B2);
        this.B3 = new JRadioButton("Search an HR");
        add(B3);
        this.B4 = new JRadioButton("Remove An HR");
        add(B4);
        this.B5 = new JRadioButton("Append FR");
        add(B5);
        this.B6 = new JRadioButton("Search  FR");
        add(B6);
        this.B7 = new JRadioButton("Remove FR");
        add(B7);
        this.B8 = new JRadioButton("Search Supervisor");
        add(B8);
        this.B9 = new JRadioButton("Remove Supervisor");
        add(B9);
        this.B10 = new JRadioButton("Append Supervisor");
        add(B10);

        //B1.setActionCommand(null);
        B2.setActionCommand(null);
        B3.setActionCommand(null);
        B4.setActionCommand(null);
        B5.setActionCommand(null);
        B6.setActionCommand(null);
        B7.setActionCommand(null);
        B8.setActionCommand(null);
        B9.setActionCommand(null);
        B10.setActionCommand(null);
        
        Group1 = new ButtonGroup();
        //Group1.add(B1);
        Group1.add(B2);
        Group1.add(B3);
        Group1.add(B4);
        Group1.add(B5);
        Group1.add(B6);
        Group1.add(B7);
        Group1.add(B8);
        Group1.add(B9);
        Group1.add(B10);
        
        this.Back = new JButton("Back ");
        add(Back);
        Next = new JButton("Next");
        add(Next);
        
        Next.addActionListener(this);
        Back.addActionListener(this);

        // BackButton.addActionListener(this);
        setLayout(null);
        Label1.setBounds(10, 10, 150, 20);
        //B1.setBounds(10, 30, 150, 20);
        B2.setBounds(10, 60, 150, 20);
        B3.setBounds(10, 90, 150, 20);
        B4.setBounds(10, 120, 150, 20);
        B5.setBounds(10, 150, 150, 20);
        B6.setBounds(10, 180, 150, 20);
        B7.setBounds(10, 210, 150, 20);
        B8.setBounds(10, 240, 150, 20);
        B9.setBounds(10, 270, 150, 20);
        B10.setBounds(10, 300, 150, 20);
        Back.setBounds(10, 350, 150, 20);
        Next.setBounds(230, 350, 150, 20);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Manager_GUI main = new Manager_GUI();
        
        main.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next) {
            /*if (B1.isSelected()) {
             dispose();
             new AddSupervisor().setVisible(true);
             } else*/
            try {
                if (B2.isSelected()) {
                    dispose();
                    new AppendHR().setVisible(true);
                } else if (B3.isSelected()) {
                    dispose();
                    new SearchHR().setVisible(true);
                } else if (B4.isSelected()) {
                    
                    new RemoveHR().setVisible(true);
                } else if (B5.isSelected()) {
                    dispose();
                    new AppendCashier().setVisible(true);
                } else if (B6.isSelected()) {
                    dispose();
                    new SearchCashier().setVisible(true);
                } else if (B7.isSelected()) {
                    new RemoveHR().setVisible(true);
                } else if (B8.isSelected()) {
                    dispose();
                    new SearchSupervisor().setVisible(true);
                } else if (B9.isSelected()) {
                    new RemoveSupervisor().setVisible(true);
                } else if (B10.isSelected()) {
                    dispose();
                    new AppendSupervisor().setVisible(true);
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == Back) {
            
            dispose();
            new Main().setVisible(true);
        }
    }
    
}
