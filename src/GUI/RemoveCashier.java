package GUI;
import Core.Users.Manager;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RemoveCashier  extends Remove {
    public  RemoveCashier(){

        this.Label1 = new JLabel("Search an Cashier To Remove");
        add(Label1);

        Label1.setBounds(10, 40, 200, 40);
       
        
    }
    public static void main (String[] args) {
            RemoveCashier main = new RemoveCashier();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){
                Manager us = new Manager();
                us.removeCashier(SK);
            }
            System.out.println("FR "+SK+" removed");
        } if(e.getSource()==Back){
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }
}
