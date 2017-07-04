package GUI;
import java.awt.*;
import javax.swing.*;
import java .awt.event.*;
public abstract class Search extends Parent implements ActionListener {
    public  Search(){
        setLocation(100, 200);
        setSize(400, 390);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         Label2 = new JLabel("Search for employe");
         add(Label2);
        this.Label1 = new JLabel ("Enter an ID");
        add(Label1);
        this.Text1 = new JTextField("");
        
        add(Text1);
        
        area1 = new JTextArea("");
        area1.setEnabled(false);
        add(area1);

        Back = new JButton("Back");
        add(Back);
        Bu1 = new JButton("Search");
        add(Bu1);
        
        Label2.setBounds(10, 20, 200, 40);
        Text1.setBounds(100, 60, 150, 40);
        Label1.setBounds(10, 60, 150, 40);
        area1.setBounds(20, 140, 300, 120);
        Back.setBounds(10, 290, 150, 40);
        Bu1.setBounds(240, 290, 150, 40);
        Bu1.addActionListener(this);
        Back.addActionListener(this);
}
  
    
    
    @Override
    public abstract void actionPerformed(ActionEvent e) ;
    
        
}