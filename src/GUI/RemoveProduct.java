package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Core.Users.*;
public class RemoveProduct extends Parent implements ActionListener {
    public  RemoveProduct(){
        setLocation(100, 200);
        setSize(400, 300);
                 //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
         Label1 = new JLabel ("Search a Product to Remove");
         add(Label1);
        this.Label2 = new JLabel ("Enter an Parcode");
        add(Label2);
        this.Text1 = new JTextField("");
        add(Text1);
        this.Next = new JButton ("Output to Remove");
        add(Next);
        
        Label1.setBounds(10, 10, 300, 30);
        Text1.setBounds(160, 50, 150, 40);
        Label2.setBounds(50, 50, 150, 40);
        Next.setBounds(220, 200, 150, 40);
        Next.addActionListener(this);
    }
    public static void main (String[] args) {
            RemoveProduct main = new RemoveProduct();
            Supervisor_GUI S = new Supervisor_GUI();
            
            main.setVisible(true);
}   @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()== Next){
                if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){ 
                Supervisor us = new Supervisor();
                us.removeProduct(SK);
            }
            System.out.println("product "+SK+" removed");
        }else if(e.getSource()==Back){
            dispose();
            new Supervisor_GUI().setVisible(true);
        }
        
        
        
        this.setVisible(false);
        
        
}
}
}
