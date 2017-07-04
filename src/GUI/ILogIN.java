package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Core.Users.*;
import java.awt.Color;
import java.awt.event.*;

public class ILogIN extends Parent implements ActionListener{
    
    public ILogIN (){
                 setLocation(100, 200);
         setSize(400, 300);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--..:))");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
          this.Label1 = new JLabel("Enter Your Identiy :)");
        add(Label1);
        Label1.setForeground(Color.red);
        this.Label2 = new JLabel("User Name ");
        add(Label2);
        this.Text1 = new JTextField("");
        add(Text1);
        this.Label3 = new JLabel("Password ");
        add(Label3);
        this.P1 = new JPasswordField("");
        add(P1);
        this.Bu1 = new JButton("Log in");
        add(Bu1);
        this.Bu2 = new JButton("Forget Password");
        add(Bu2);
    
        setLayout(null);
        Label1.setBounds(120, 20, 200, 40);
        Label2.setBounds(80, 80, 100, 30);
        Label3.setBounds(80, 110, 100, 30);
        Text1.setBounds(180, 80, 100, 30);
        P1.setBounds(180, 110, 100, 30);
        Bu1.setBounds(250, 180, 100, 50);
        Bu2.setBounds(40, 180, 150, 50);
        Bu1.addActionListener(this);
    }

   public static void main(String[] args) {
       ILogIN I = new ILogIN();

        I.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Bu1) {
            User us = new User();
            String usrname = Text1.getText();
            char[] pass = P1.getPassword();
            String passWord = String.copyValueOf(pass);
            if (passWord.length()<8){
                Myex.checkPassLength(passWord);
            }
            
            try {
            String t =  us.LogIn(usrname, passWord);
            if(t.equals("Manager")){
                dispose();
            new Manager_GUI().setVisible(true);
            }else if(t.equals("Supervisor")){
                dispose();
                new Supervisor_GUI().setVisible(true);
            }else if(t.equals("InvnetoryClerk")){
                dispose();
                new InventoryClerk_GUI().setVisible(true);
            }else if(t.equals("HR")){
                dispose();
                new HR_GUI().setVisible(true);
            }else if (t.equals("Cashier")){
                dispose();
                new Cashier_GUI().setVisible(true);
            }
            }catch(Exception e1) {
                e1.printStackTrace();
            }
        }
    }



}

