
package GUI;

import Core.Product;
import Core.Users.*;
import Core.Users.Manager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateProduct extends Parent implements ActionListener{
    public UpdateProduct(){
            setLocation(100, 200);
         setSize(600, 600);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         
         
        Label1 = new JLabel("Update For Product By ID");
        add(Label1);
        Text1 = new JTextField("");
        add(Text1);
        area1 = new JTextArea("");
        add(area1);
        area1.setEnabled(false);
        Label2 = new JLabel("Name");
        Text2 = new JTextField("");
        Label3 = new JLabel("ParCode");
        Text3 = new JTextField("");
        Label4 = new JLabel("Quantity");
        Text4 = new JTextField("");
        Label5 = new JLabel("Type");
        Text5 = new JTextField("");
        Label6 = new JLabel("Brand");
        Text6 = new JTextField("");
        Label7 = new JLabel("E.X.P Date");
        Text7 = new JTextField("");
        Label8 = new JLabel("P.R.O Date");
        Text8 = new JTextField("");
        
        add(Text2);add(Text3);add(Text4);add(Text5);add(Text6);add(Text7);add(Text8);
        add(Label2);add(Label3);add(Label4);add(Label5);add(Label6);add(Label7);add(Label8);
        area2 = new JTextArea("");
        add(area2);
        area2.setEditable(false);

        Back = new JButton("Back");
        Next = new JButton("Next");
        Bu1 = new JButton("Submit");
        add(Next);
        add(Back);
        add(Bu1);

        Next.addActionListener(this);
        Back.addActionListener(this);
        Bu1.addActionListener(this);
        Label1.setBounds(30, 50, 150, 40);
        Text1.setBounds(110, 50, 150, 40);
        area1.setBounds(270, 10, 270, 200);
        area2.setBounds(270, 230, 270, 200);
        Bu1.setBounds(120, 120, 100, 30);
        Label2.setBounds(30, 200, 150, 40);
        Text2.setBounds(100, 200, 150, 40);
        Label3.setBounds(30, 240, 150, 40);
        Text3.setBounds(100, 240, 150, 40);
        Label4.setBounds(30, 280, 150, 40);
        Text4.setBounds(100, 280, 150, 40);
        Label5.setBounds(30, 320, 150, 40);
        Text5.setBounds(100, 320, 150, 40);
        Label6.setBounds(30, 360, 150, 40);
        Text6.setBounds(100, 360, 150, 40);
        Label7.setBounds(30, 400, 150, 40);
        Text7.setBounds(100, 400, 150, 40);
        Label8.setBounds(30, 440, 150, 40);
        Text8.setBounds(100, 440, 150, 40);
        
        Back.setBounds(10, 500, 100, 40);
        Next.setBounds(400, 500, 100, 40);
       
    }

          public static void main (String[] args) {
            UpdateProduct main = new UpdateProduct();

            main.setVisible(true);  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        Product fr= new Product();
        Supervisor m=new Supervisor();
        try{
        if (e.getSource() == Next) {
               fr.ParCode = Text1.getText();
            area1.setText(m.searchProduct(fr.ParCode));
            m.removeProduct(fr.ParCode);
        } else if (e.getSource() == Next) {
               fr.Name=Text1.getText();
               fr.ParCode=Text2.getText();
               fr.Quantity=Integer.valueOf(Text3.getText());
               fr.Type=Text4.getText();
               fr.Brand=Text5.getText();
               fr.EXP_Date=Text6.getText();
               m.appendProduct(fr);
            area2.setText(m.searchProduct(fr.ParCode));
        }    
        }catch(Exception e1){
            
    }
     if(e.getSource()== Back){
            dispose();
            new Supervisor_GUI().setVisible(true);
        }
    }
    }
