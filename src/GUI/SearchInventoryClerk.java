package GUI;

import Core.Users.Cashier;
import Core.Users.InventoryClerk;
import Core.Users.Manager;
import Core.Users.Supervisor;
import javax.swing.*;
import java.awt.event.*;

public class SearchInventoryClerk extends Search {

    public SearchInventoryClerk() {

        this.Label1 = new JLabel("Search an InventoryClerk");
        add(Label1);

        Label1.setBounds(10, 10, 200, 40);

    }

    public static void main(String[] args) {
        SearchInventoryClerk main = new SearchInventoryClerk();

        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Bu1) {
            Supervisor us = new Supervisor();
            InventoryClerk ch = new InventoryClerk();
            ch.ID = Text1.getText();
            area1.setText(us.searchInventoryClerk(ch.ID));

        } else if (e.getSource() == Back) {
            dispose();
            new Supervisor_GUI().setVisible(true);
        }
    }

}
