package GUI;
import Core.Users.HR;
import Core.Users.Manager;
import Core.Users.Supervisor;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class RemoveInventoryClerk  extends Remove{
    public  RemoveInventoryClerk(){

        this.Label1 = new JLabel("Search an InventoryClerk To Remove");
        add(Label1);

        Label1.setBounds(10, 40, 200, 40);

        
    }
    public static void main (String[] args) {
            RemoveInventoryClerk main = new RemoveInventoryClerk();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
                if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){ 
            Supervisor us = new Supervisor();
            us.removeInventoryClerk(SK);
            }
            System.out.println("InventoryClerk "+SK+" removed");
        }else if(e.getSource()==Back){
            dispose();
            new Supervisor_GUI().setVisible(true);
        }
    }
    
    
}
