package GUI;

import Core.Users.InventoryClerk;
import Core.Users.Manager;
import Core.Users.Supervisor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SearchSupervisor extends Search {

    public SearchSupervisor() {

        this.Label1 = new JLabel("Search an SuperVisor");
        add(Label1);
        Label1.setBounds(10, 10, 150, 40);
    }

    public static void main(String[] args) {
        SearchSupervisor main = new SearchSupervisor();

        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Bu1) {
            Manager us = new Manager();
            Supervisor ch = new Supervisor();
            ch.ID = Text1.getText();
            area1.setText(us.searchSupervisor(ch.ID));

        } else if (e.getSource() == Back) {
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }
}
