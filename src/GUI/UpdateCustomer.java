
package GUI;

import Core.Supplier;
import Core.Users.Cashier;
import Core.Users.HR;
import Core.Users.InventoryClerk;
import Core.Users.Manager;
import Core.lib.Customer;
import Core.lib.Worker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateCustomer extends Parent implements ActionListener{
    public UpdateCustomer(){
            setLocation(100, 200);
         setSize(550, 550);
         //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
                   Label1 = new JLabel("Update For Customer By ID");
        add(Label1);
        Text1 = new JTextField("");
        add(Text1);
        area1 = new JTextArea("");
        add(area1);
        area1.setEnabled(false);
        Label2 = new JLabel("Name");
        Text2 = new JTextField("");
        Label3 = new JLabel("Phone");
        Text3 = new JTextField("");



        
        add(Text2);add(Text3);
        add(Label2);add(Label3);
        area2 = new JTextArea("");
        add(area2);
        area2.setEditable(false);

        Back = new JButton("Back");
        Next = new JButton("Next");
        Bu1 = new JButton("Submit");
        add(Next);
        add(Back);
        add(Bu1);

        Next.addActionListener(this);
        Back.addActionListener(this);
        Bu1.addActionListener(this);
        Label1.setBounds(30, 50, 200, 40);
        Text1.setBounds(110, 80, 150, 40);
        area1.setBounds(270, 10, 270, 200);
        area2.setBounds(270, 230, 270, 200);
        Bu1.setBounds(120, 140, 100, 30);
        Label2.setBounds(30, 230, 150, 40);
        Text2.setBounds(100, 230, 150, 40);
        Label3.setBounds(30, 270, 150, 40);
        Text3.setBounds(100, 270, 150, 40);



        
        Back.setBounds(10, 450, 100, 40);
        Next.setBounds(400, 450, 100, 40);  
         
         
    }

           public static void main (String[] args) {
            UpdateCustomer main = new UpdateCustomer();

            main.setVisible(true);  
}

    @Override
    public void actionPerformed(ActionEvent e) {
       Cashier us = new Cashier();
        Customer ch = new Customer();
        try{
        if (e.getSource() == Bu1) {
            ch.Phone = Text1.getText();
            area1.setText(us.searchCustomer(ch.Phone));
            us.removeCustomer(ch.Phone);
        } else if (e.getSource() == Next) {
            ch.Name = Text2.getText();
            ch.Phone = Text3.getText();
            us.appendCustomer(ch);
            area2.setText(us.searchCustomer(ch.Phone));
              if (!ch.Name.matches("^[a-zA-z]+$")){
                   Myex.checkname(ch.Name);
               }
               if(!ch.Phone.matches("[0-9]+$")){
                   Myex.Invalidation(ch.Phone);
               }
        } else if (e.getSource() == Back) {
            dispose();
            new Manager_GUI().setVisible(true);
        }
        }catch(Exception e1){
            
        }
    }
}
