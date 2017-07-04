package GUI;

import Core.Users.Cashier;
import Core.Users.Supervisor;
import Core.lib.Customer;
import Core.lib.Worker;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchCustomer extends Parent implements ActionListener {

    public SearchCustomer() {
        setLocation(100, 200);
        setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        Label1 = new JLabel("Search an a Customer");
        add(Label1);

        this.Label2 = new JLabel("Enter Customer's Phone");
        add(Label2);
        this.Text1 = new JTextField("");
        add(Text1);
        this.Next = new JButton("Search");
        add(Next);
        area1 = new JTextArea("");
        add(area1);
        area1.setEnabled(false);
        Back = new JButton("Back");
        add(Back);

        Label1.setBounds(10, 10, 300, 30);
        Text1.setBounds(210, 50, 150, 40);
        Label2.setBounds(50, 50, 150, 40);
        area1.setBounds(10, 110, 300, 150);
        Next.setBounds(220, 280, 150, 40);
        Back.setBounds(10, 280, 150, 40);
        Next.addActionListener(this);
        Back.addActionListener(this);

    }

    public static void main(String[] args) {
        SearchCustomer main = new SearchCustomer();

        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Next) {

            Cashier us = new Cashier();
            Customer ch = new Customer();
            ch.Phone = Text1.getText();
            String x = ch.Phone;
            area1.setText(us.searchCustomer(x));
        }else if(e.getSource()==Back){
            dispose();
            new Cashier_GUI().setVisible(true);
        }

    }
}
