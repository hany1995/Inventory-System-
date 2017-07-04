package GUI;

import Core.Users.Supervisor;
import Core.lib.Worker;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchWorker extends Parent implements ActionListener {

    public SearchWorker() {
        setLocation(100, 200);
        setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        Label1 = new JLabel("Search an a Worker");
        add(Label1);

        this.Label2 = new JLabel("Enter The ID");
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
        Text1.setBounds(150, 50, 150, 40);
        Label2.setBounds(50, 50, 150, 40);
        area1.setBounds(10, 110, 300, 150);
        Next.setBounds(220, 280, 150, 40);
        Back.setBounds(10, 280, 150, 40);
        Next.addActionListener(this);
        Back.addActionListener(this);

    }

    public static void main(String[] args) {
        SearchWorker main = new SearchWorker();

        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Next) {

            Supervisor us = new Supervisor();
            Worker ch = new Worker();
            ch.ID = Text1.getText();
            String x = ch.ID;
            area1.setText(us.searchWorker(x));
        }else if(e.getSource()==Back){
            dispose();
            new Supervisor_GUI().setVisible(true);
        }

    }
}
