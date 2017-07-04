package GUI;

import Core.Users.InventoryClerk;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class RemoveSupplier  extends Remove{
    public  RemoveSupplier(){

        this.Label1 = new JLabel("Search an Supplier To Remove");
        add(Label1);

        Label1.setBounds(10, 40, 200, 40);

        
    }
    public static void main (String[] args) {
            RemoveSupplier main = new RemoveSupplier();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){
                InventoryClerk us = new InventoryClerk();
                us.removeSupplier(SK);
            }
            System.out.println("Supplier "+SK+" removed");
        } else if(e.getSource()==Back){
            dispose();
            new InventoryClerk_GUI().setVisible(true);
        }
    }
}
