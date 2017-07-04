
package GUI;

import Core.Supplier;
import Core.Users.HR;
import Core.Users.InventoryClerk;
import Core.Users.Manager;
import Core.Users.Supervisor;
import Core.lib.Worker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateWorker extends Parent implements ActionListener{
    public UpdateWorker(){
            setLocation(100, 200);
         setSize(550, 550);
         //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
                 Label1 = new JLabel("Update For Worker By ID");
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
        Label4 = new JLabel("ID");
        Text4 = new JTextField("");


        
        add(Text2);add(Text3);add(Text4);
        add(Label2);add(Label3);add(Label4);
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
        Label4.setBounds(30, 310, 150, 40);
        Text4.setBounds(100, 310, 150, 40);


        
        Back.setBounds(10, 450, 100, 40);
        Next.setBounds(400, 450, 100, 40);  
            
    }

           public static void main (String[] args) {
            UpdateWorker main = new UpdateWorker();

            main.setVisible(true);  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        Supervisor us = new Supervisor();
        HR hr=new HR();       
        Worker ch = new Worker();
        try{
        if (e.getSource() == Bu1) {
            ch.ID = Text1.getText();
            area1.setText(us.searchWorker(ch.ID));
            us.removeWorker(ch.ID);
        } else if (e.getSource() == Next) {
            ch.Name = Text2.getText();
            ch.Phone = Text3.getText();
            ch.ID = Text5.getText();
            hr.appendWorker(ch);
            area2.setText(us.searchWorker(ch.ID));
              if (!ch.Name.matches("^[a-zA-z]+$")){
                   Myex.checkname(ch.Name);
               }
               if(!ch.Phone.matches("[0-9]+$")){
                   Myex.Invalidation(ch.Phone);
               }
               ch.ID=String.valueOf(Text4.getText());
               
               if (ch.ID.contains("-") ){
                    Myex.checkPositive(ch.ID);
                    
                }
        } else if (e.getSource() == Back) {
            dispose();
            new Supervisor_GUI().setVisible(true);
        }}catch(Exception e1){
            
        }
    }
}
