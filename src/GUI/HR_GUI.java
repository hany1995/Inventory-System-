package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HR_GUI  extends Parent implements ActionListener{

    public HR_GUI() {

        setLocation(250, 100);
        setSize(450, 450);
        this.setLocationRelativeTo(null);

        this.Label1 = new JLabel("HR");
        add(Label1);

        //this.B1 = new JRadioButton("Adding File HR");
        //add(B1);B1.setActionCommand(null);
        //AddButton1.addActionListener(this);
                this.B2 = new JRadioButton(" Append Worker");
        add(B2);B2.setActionCommand(null);
        //AddButton2.addActionListener(this);
                this.B3 = new JRadioButton("Append Inventory Clerk");
        add(B3);B3.setActionCommand(null);
        
        Group1 = new ButtonGroup();
        Group1.add(B1);Group1.add(B2);Group1.add(B3);
     
        this.Back = new JButton("Back ");
        add(Back);
        Next = new JButton("Next");
        add(Next);
        //BackButton.addActionListener(this);

        setLayout(null);
        Label1.setBounds(10, 10, 150, 50);
        //B1.setBounds(10, 50, 150, 50);
        B2.setBounds(10, 100, 150, 50);
        B3.setBounds(10, 160, 200, 50);
       
        Back.setBounds(10, 300, 100, 50);
        Next.setBounds(300, 300, 100, 50);
        Next.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  

 
    public static void main (String[] args) {
            HR_GUI main = new HR_GUI();
            
            
            main.setVisible(true);
               
            }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next) 
        {
            /*if (B1.isSelected())
            {
                B1.getActionCommand();
                this.setVisible(false);
                new AppendHR().setVisible(true);
            } 
            else */ if ( B2.isSelected()) 
            {
                B2.getActionCommand();
                this.setVisible(false);
                new AppendWorker().setVisible(true);
            }
            
        else if(B3.isSelected()){
                B3.getActionCommand();
                this.setVisible(false);
                new AppendInventoryClerk().setVisible(true);   
             
        }
        }
    }
}
       
