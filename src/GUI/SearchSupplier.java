package GUI;

import Core.Supplier;
import Core.Users.InventoryClerk;
import Core.Users.Supervisor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchSupplier extends Search {

    public SearchSupplier() {

        this.Label5 = new JLabel("Search an Supplier");
        add(Label5);
        Label5.setBounds(10, 10, 150, 40);
    }

    public static void main(String[] args) {
        SearchSupplier main = new SearchSupplier();

        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Bu1) {
            InventoryClerk us = new InventoryClerk();
            Supplier ch = new Supplier();
            ch.ID = Text1.getText();
            String x = ch.ID;
            area1.setText(us.searchSupplier(x));
        }else if(e.getSource()==Back){
            dispose();
            new InventoryClerk_GUI().setVisible(true);
        }

    }
}
