package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Cashier_GUI  extends Parent implements ActionListener    {

   
    public Cashier_GUI() {

        setLocation(250, 100);
        setSize(380, 350);
        this.setLocationRelativeTo(null);

        this.Label1 = new JLabel("Cashier");
        add(Label1);
        this.B1 = new JRadioButton("Append Costomer");
        add(B1);
        B1.setActionCommand("");
        this.B2 = new JRadioButton("Search Customer");
        add(B2);
        B2.setActionCommand("");
      
        this.B3 = new JRadioButton("Remove Customer");
        add(B3);
        B3.setActionCommand("");
        this.B4 = new JRadioButton("Update Customer");
        add(B4);
        B4.setActionCommand("");
        
        Group1 = new ButtonGroup();
        Group1.add(B1);
        Group1.add(B2);
        Group1.add(B3);
        Group1.add(B4);

        this.Back = new JButton("Back ");
        add(Back);
        
        Next = new JButton("Next");
        add(Next);
        
        Back.addActionListener(this);
        Next.addActionListener(this);
        
        setLayout(null);
        Label1.setBounds(10, 10, 150, 40);
        B1.setBounds(10, 50, 150, 40);
        B2.setBounds(10, 90, 150, 40);
        B3.setBounds(10, 130, 150, 40);
        B4.setBounds(10, 170, 150, 40);
        Back.setBounds(10, 230, 150, 40);
        Next.setBounds(210, 230, 150, 40);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] args) {
            Cashier_GUI main = new Cashier_GUI();
            
            
            main.setVisible(true);
               
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{       
        if(e.getSource()==Next){
                    if(B1.isSelected()){
                        B1.getActionCommand();
                        dispose();
                        new AppendCustomer().setVisible(true);
                    }
                      if(B2.isSelected()){
                        B2.getActionCommand();
                        dispose();
                        new SearchCustomer().setVisible(true);
                    }
                        if(B3.isSelected()){
                        B3.getActionCommand();                      
                        new RemoveCustomer().setVisible(true);
                    }
                        
                     if(B5.isSelected()){
                        B5.getActionCommand();
                        dispose();
                        new UpdateCustomer().setVisible(true);
                    }
                }else if(e.getSource()==Back){
                    dispose();
                    new Main().setVisible(true);
                }
                }catch(Exception e1){
                    
        }}}
    

