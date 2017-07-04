
package GUI;

import Core.Product;
import Core.Users.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AppendProduct extends Parent implements ActionListener{
    public AppendProduct(){
            setLocation(100, 200);
         setSize(500, 500);
         //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
         
         
          Label1 = new JLabel("Append on Product");
          Label2 = new JLabel("Name");
          Text1= new JTextField("");
          Label3 = new JLabel("ParCode");
          Text2= new JTextField("");
                    Label4 = new JLabel("Quantity");
          Text3= new JTextField("");
                    Label5 = new JLabel("Type");
          Text4= new JTextField("");
                    Label6 = new JLabel("Brand");
          Text5= new JTextField("");
                    Label7 = new JLabel("E.X.P Date");
          Text6= new JTextField("");
                    Label8 = new JLabel("P.R.O Date");
          Text7= new JTextField("");
                  Back = new JButton ("Back");
         add(Back);
         Next = new JButton("Submit");
         add(Next);
             
          
        
        add(Label1);add(Label2); add(Label3);add(Label4);add(Label5);add(Label6);add(Label7);add(Label8);add(Text1);add(Text2);add(Text3);add(Text4);add(Text5);add(Text6);add(Text7);
        
        
        Label1.setBounds(20, 10, 200, 40);
        Label2.setBounds(30, 50, 200, 40);
        Label3.setBounds(30, 90, 200, 40);
        Label4.setBounds(30, 130, 200, 40);
        Label5.setBounds(30, 170, 200, 40);
        Label6.setBounds(30, 210, 200, 40);
        Label7.setBounds(10, 250, 200, 40);
        Label8.setBounds(10, 290, 200, 40);
        Text1.setBounds(80, 50, 150, 40);
        Text2.setBounds(80, 90, 150, 40);
        Text3.setBounds(80, 130, 150, 40);
        Text4.setBounds(80, 170, 150, 40);
        Text5.setBounds(80, 210, 150, 40);
        Text6.setBounds(80, 250, 150, 40);
        Text7.setBounds(80, 290, 150, 40);
        Back.setBounds(10, 400, 100, 20);
        Next.setBounds(340, 400, 100, 20);
        //Bu1.setBounds(170, 400, 100, 20);
           
        Next.addActionListener(this);
        Back.addActionListener(this);
    }

          public static void main (String[] args) {
            AppendProduct main = new AppendProduct();

            main.setVisible(true);  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
        if (e.getSource() == Next) {
            
               Product Pr= new Product();
               Supervisor P =  new Supervisor();
               Pr.Name=Text1.getText();
               Pr.ParCode=Text2.getText();   
               Pr.Quantity=Integer.valueOf(Text3.getText());
               Pr.Type=Text4.getText();
               Pr.Brand = Text5.getText();
               Pr.EXP_Date =Text6.getText();
               Pr.PRO_Date = Text7.getText();
               if (!Pr.Name.matches("^[a-zA-z]+$")){
                   Myex.checkname(Pr.Name);
               }
               if (Pr.ParCode.contains("-") ){
                    Myex.checkPositive(Pr.ParCode);
                    
                }
               if (!Pr.Brand.matches("^[a-zA-z]+$")){
                   Myex.checkname(Pr.Brand);
               }
               if (!Pr.Type.matches("^[a-zA-z]+$")){
                   Myex.checkname(Pr.Type);
               }
               
               if (Pr.Quantity <0 ){
                    Myex.checkPositive(String.valueOf(Pr.Quantity));
                    
                }
                  JOptionPane.showMessageDialog(null, "You Append On Product Get Back to main");
               P.appendProduct(Pr);
            
              // if (Pr.EXP_Date <0 ){
                 //   Myex.checkPositive(Pr.EXP_Date);
                    
               // }
               
               
               
            

               
        }else if(e.getSource()== Back){
            dispose();
            new Supervisor_GUI().setVisible(true);
        }
        }catch(Exception e1){
                
            }
    }
    }
