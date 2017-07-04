
package GUI;


import Core.Users.HR;
import Core.Users.InventoryClerk;
import Core.Users.Manager;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class AppendInventoryClerk extends Append implements ActionListener{
    public AppendInventoryClerk(){
                       this.Label1 = new JLabel("Append on InventoryClerk");
        add(Label1);
               Label1.setBounds(20, 10, 200, 40);
    }

           public static void main (String[] args) {
            AppendInventoryClerk main = new AppendInventoryClerk();

            main.setVisible(true);  
}   @Override
           public void actionPerformed(ActionEvent e) {
                try{
               if(e.getSource()==Next){
               InventoryClerk fr= new InventoryClerk();
               HR h=new HR();
             
               fr.Name=Text1.getText();
               fr.Phone=Text2.getText();
               fr.Email=Text3.getText();
               
               if (!fr.Name.matches("^[a-zA-z]+$")){
                   Myex.checkname(fr.Name);
               }
               if(!fr.Phone.matches("[0-9]+$")){
                   Myex.Invalidation(fr.Phone);
               }
               if(!fr.Email.contains("@")||!fr.Email.contains(".")){
                   Myex.checkEmail(fr.Email);
               }
               fr.ID=String.valueOf(Text4.getText());
               
               if (fr.ID.contains("-") ){
                    Myex.checkPositive(fr.ID);
                    
                }
               fr.Setpassword(P1.getText());
               if(fr.getpassword().length()<8){
                   Myex.checkPassLength(fr.getpassword());
               }
               JOptionPane.showMessageDialog(null, "You Append On Inventory Clerk Get Back to main");
               h.appendInventoryClerk(fr);
               
               
               
           }else if(e.getSource()==Back){
               dispose();
               new HR_GUI().setVisible(true);
           }
               }catch(Exception e1){
                
               }
}}

