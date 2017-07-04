
package GUI;

import Core.Supplier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import Core.Users.*;
import javax.swing.JOptionPane;

public class AppendSupplier extends Parent implements ActionListener {
    public AppendSupplier(){
            setLocation(100, 200);
         setSize(450, 300);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
         
         
          Label1 = new JLabel("Append on Supplier");
          Label2 = new JLabel("ID");
          Text1= new JTextField("");
          Label3 = new JLabel("Company Name");
          Text2= new JTextField("");
                    Label4 = new JLabel("Address");
          Text3= new JTextField("");
                    Label5 = new JLabel("Telephone");
          Text4= new JTextField("");
          
          Back = new JButton ("Back");         
         add(Back);Back.addActionListener(this);
         Next = new JButton("Submit");
         add(Next); Next.addActionListener(this);
        
          
        
        add(Label1);add(Label2); add(Label3);add(Label4);add(Label5);add(Text1);add(Text2);add(Text3);add(Text4);
        
        
        Label1.setBounds(20, 10, 200, 40);
        Label2.setBounds(30, 50, 200, 40);
        Label3.setBounds(5, 90, 200, 40);
        Label4.setBounds(30, 130, 200, 40);
        Label5.setBounds(30, 170, 200, 40);

        Text1.setBounds(80, 50, 150, 40);
        Text2.setBounds(100, 90, 150, 40);
        Text3.setBounds(100, 130, 150, 40);
        Text4.setBounds(100, 170, 150, 40);

        Back.setBounds(10, 250, 100, 20);
        Next.setBounds(340, 250, 100, 20);
        
            
    }

           public static void main (String[] args) {
            AppendSupplier main = new AppendSupplier();

            main.setVisible(true);  
}

    @Override
    public void actionPerformed(ActionEvent e) {
       
            try{
        if(e.getSource()==Next){
           Supplier  fr= new Supplier();
               InventoryClerk m=new InventoryClerk();
           
               fr.ID=Text1.getText();
               fr.CompanyName=Text2.getText();
               fr.Address=Text3.getText();
               fr.TelephoneNo=Text4.getText();
               if (!fr.CompanyName.matches("^[a-zA-z]+$")){
                   Myex.checkname(fr.CompanyName);
               }
               if(!fr.TelephoneNo.matches("[0-9]+$")){
                   Myex.Invalidation(fr.TelephoneNo);
               }
               fr.ID=String.valueOf(Text4.getText());
               
               if (fr.ID.contains("-") ){
                    Myex.checkPositive(fr.ID);
                    
                }
               JOptionPane.showMessageDialog(null, "You Append On Supplier Get Back to main");
               
               m.appendSupplier(fr);
               
               
    }else if(e.getSource()==Back){
            dispose();
            new InventoryClerk_GUI().setVisible(true);
    }}catch(Exception e1){
                   
               }
        
    }
}
