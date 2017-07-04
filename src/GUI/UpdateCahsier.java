package GUI;

import Core.Users.Cashier;
import Core.Users.Manager;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UpdateCahsier extends Update {

    public UpdateCahsier() {
        this.Label1 = new JLabel("Update on Cashier");
        add(Label1);
        Label1.setBounds(20, 10, 200, 40);

    }

    public static void main(String[] args) {
        UpdateCahsier main = new UpdateCahsier();

        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Manager us = new Manager();
        Cashier ch = new Cashier();
        try{
        if (e.getSource() == Bu1) {
            ch.ID = Text1.getText();
            area1.setText(us.searchCashier(ch.ID));
            us.removeCashier(ch.ID);
        } else if (e.getSource() == Next) {
            ch.Name = Text2.getText();
            ch.Phone = Text3.getText();
            ch.Email = Text4.getText();
            ch.ID = Text5.getText();
            ch.Setpassword(P1.getText());
            us.appendCashier(ch);
            area2.setText(us.searchCashier(ch.ID));
             if (!ch.Name.matches("^[a-zA-z]+$")){
                   Myex.checkname(ch.Name);
               }
               if(!ch.Phone.matches("[0-9]+$")){
                   Myex.Invalidation(ch.Phone);
               }
               if(!ch.Email.contains("@")||!ch.Email.contains(".")){
                   Myex.checkEmail(ch.Email);
               }
               ch.ID=String.valueOf(Text4.getText());
               
               if (ch.ID.contains("-") ){
                    Myex.checkPositive(ch.ID);
                    
                }
               ch.Setpassword(P1.getText());
               if(ch.getpassword().length()<8){
                   Myex.checkPassLength(ch.getpassword());
               }
        } else if (e.getSource() == Back) {
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }catch(Exception e1){
        
    }

}}
