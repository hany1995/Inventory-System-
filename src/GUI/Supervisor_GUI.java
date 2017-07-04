package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Supervisor_GUI  extends Parent implements ActionListener {

    public Supervisor_GUI () {

        setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.Label1 = new JLabel("Supervisor");
        add(Label1);

       // this.B1 = new JRadioButton("Add File Supervisor");
        //add(B1);
                this.B2 = new JRadioButton("Search InventoryClerk");
        add(B2);
                this.B3 = new JRadioButton("Remove InventoryClerk");
        add(B3);
                this.B4 = new JRadioButton("Search Product");
        add(B4);
                this.B5 = new JRadioButton("Append Product");
        add(B5);
                this.B6 = new JRadioButton("Remove Product");
        add(B6);
                this.B7 = new JRadioButton("Search Worker");
        add(B7);
                this.B8 = new JRadioButton("Remove Worker");
        add(B8);
                this.B9 = new JRadioButton("Make Purchase Order ");
        add(B9);
               
        //B1.setActionCommand(null);
        B2.setActionCommand(null);
        B3.setActionCommand(null);
        B4.setActionCommand(null);
        B5.setActionCommand(null);
        B6.setActionCommand(null);
        B7.setActionCommand(null);
        B8.setActionCommand(null);
        B9.setActionCommand(null);
        
        Group1 = new ButtonGroup();
        //Group1.add(B1);
        Group1.add(B2);Group1.add(B3);Group1.add(B4);Group1.add(B5);Group1.add(B6);Group1.add(B7);Group1.add(B8);Group1.add(B9);
        
        this.Back = new JButton("Back ");
        add(Back);
        Next = new JButton("Next");
        add(Next);
        Next.addActionListener(this);
        Back.addActionListener(this);
        //BackButton.addActionListener(this);

        setLayout(null);
        Label1.setBounds(10, 10, 150, 40);
        //B1.setBounds(10, 50, 200, 40);
        B2.setBounds(10, 90, 200, 40);
        B3.setBounds(10, 130, 200, 40);
        B4.setBounds(10, 170, 200, 40);
        B5.setBounds(10, 210, 200, 40);
        B6.setBounds(10, 250, 200, 40);
        B7.setBounds(10, 290, 200, 40);
        B8.setBounds(10, 330, 200, 40);
        B9.setBounds(10, 370, 200, 40);
     
        Back.setBounds(10, 500, 150, 40);
        Next.setBounds(340, 500, 150, 40);

      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  


    public static void main (String[] args) {
            Supervisor_GUI main = new Supervisor_GUI();
            
            
            main.setVisible(true);
               
            }

    Supervisor_GUI(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Next){
           // if(B1.isSelected()){
             //   B1.getActionCommand();
               // this.setVisible(false);
                //new AppendSupervisor().setVisible(true);
             if(B2.isSelected()){
                this.setVisible(false);
                new SearchInventoryClerk().setVisible(true);
            }    else if(B3.isSelected()){                
                new RemoveInventoryClerk().setVisible(true);
            }    else if(B4.isSelected()){
                this.setVisible(false);
                new SearchProduct().setVisible(true);
            }    else if(B5.isSelected()){
                this.setVisible(false);
                new AppendProduct().setVisible(true);
            }    else if(B6.isSelected()){
                new RemoveProduct().setVisible(true);
            }    else if(B7.isSelected()){
                this.setVisible(false);
                new SearchWorker().setVisible(true);
            }    else if(B8.isSelected()){
                new RemoveWorker().setVisible(true);
            }
        }else if(e.getSource()==Back){
            this.setVisible(false);
            new Main().setVisible(true);
        }
    }
}