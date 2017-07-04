package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class InventoryClerk_GUI extends Parent implements ActionListener {

    public InventoryClerk_GUI() {
        setLocation(100, 200);
        setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);

        this.Label1 = new JLabel("Inventory Clerk");
        add(Label1);
        //this.B1 = new JRadioButton("Adding File InventoryClerk");
        //add(B1);
        this.B2 = new JRadioButton(" Append Supllier");
        add(B2);
        this.B3 = new JRadioButton("Search Supplier");
        add(B3);
        this.B4 = new JRadioButton("Remove Suppllier");
        add(B4);

        //B1.setActionCommand("");
        B2.setActionCommand("");
        B3.setActionCommand("");
        B4.setActionCommand("");

        Group1 = new ButtonGroup();
        //Group1.add(B1);
        Group1.add(B2);
        Group1.add(B3);
        Group1.add(B4);

        Back = new JButton("Back ");
        add(Back);
        Next = new JButton("Next");
        add(Next);
        Next.addActionListener(this);
        Back.addActionListener(this);
            


        setLayout(null);
        Label1.setBounds(10, 10, 200, 50);
        //B1.setBounds(10, 50, 200, 50);
        B2.setBounds(10, 100, 200, 50);
        B3.setBounds(10, 150, 200, 50);
        B4.setBounds(10, 200, 200, 50);

        Back.setBounds(10, 300, 100, 50);
        Next.setBounds(280, 300, 100, 50);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        InventoryClerk_GUI I = new InventoryClerk_GUI();

        I.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
               if (e.getSource() == Next) {
            /*if (B1.isSelected()) {
                B1.getActionCommand();
                this.setVisible(false);
                new AppendInventoryClerk().setVisible(true);

            } else*/ if (B2.isSelected()) {
                B2.getActionCommand();
                this.setVisible(false);
                new AppendSupplier().setVisible(true);
            } else if (B3.isSelected()) {
                B3.getActionCommand();
                this.setVisible(false);
                new SearchSupplier().setVisible(true);
            } else if (B4.isSelected()) {
                B4.getActionCommand();
                this.setVisible(false);
                new RemoveSupplier().setVisible(true);
            }
        }
               if(e.getSource()==Back){
                   this.setVisible(false);
                   new ILogIN().setVisible(true);
                   
               }
    }
}
