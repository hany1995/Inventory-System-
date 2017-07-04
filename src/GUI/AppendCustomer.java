
package GUI;

import Core.Supplier;
import Core.Users.Cashier;
import Core.Users.HR;
import Core.Users.InventoryClerk;
import Core.lib.Customer;
import Core.lib.Worker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AppendCustomer extends Parent implements ActionListener{
    public AppendCustomer(){
            setLocation(100, 200);
         setSize(400, 300);
         //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
         
         
          Label1 = new JLabel("Append on  Customer");
          Label2 = new JLabel("Name");
          Text1= new JTextField("");
          Label3 = new JLabel("Phone");
          Text2= new JTextField("");
          //Label4 = new JLabel("ID");
          //Text3=new JTextField("");
                   
         Back = new JButton ("Back");
         add(Back);
         Next = new JButton("Submit");
         add(Next);
         //Bu1 = new JButton("Submit");
         //add(Bu1);    
          
        
        add(Label1);add(Label2); add(Label3);add(Text1);add(Text2);
        //add(Label4);add(Text3);
        
        
        Label1.setBounds(20, 10, 200, 40);
        Label2.setBounds(30, 50, 200, 40);
        Label3.setBounds(30, 90, 200, 40);
        //Label4.setBounds(30, 130, 200, 40);
        Text1.setBounds(80, 50, 150, 40);
        Text2.setBounds(80, 90, 150, 40);
        //Text3.setBounds(80, 130, 150, 40);
        Back.setBounds(10, 240, 80, 20);
        Next.setBounds(290, 240, 80, 20);
        //Bu1.setBounds(150, 240, 80, 20);
        
        Next.addActionListener(this);
        Back.addActionListener(this);
            
    }

           public static void main (String[] args) {
            AppendCustomer main = new AppendCustomer();

            main.setVisible(true);  
}

    @Override
    public void actionPerformed(ActionEvent e) {
           try{
        if(e.getSource()==Next){
            
            Customer fr= new Customer();
           
           
               Cashier m=new Cashier();
               fr.Name=Text1.getText();
               fr.Phone = Text2.getText();
               if (!fr.Name.matches("^[a-zA-z]+$")){
                   Myex.checkname(fr.Name);
               }
               if(!fr.Phone.matches("[0-9]+$")){
                   Myex.Invalidation(fr.Phone);
               }
                   JOptionPane.showMessageDialog(null, "You Append On Customer Get Back to main");
               
               m.appendCustomer(fr);
               
               
        }else if(e.getSource()==Back){
            dispose();
            new Cashier_GUI().setVisible(true);
        }
    }catch(Exception e1){
                   
               }}
}
