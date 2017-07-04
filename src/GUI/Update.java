
package GUI;
import java.awt.event.*;
import javax.swing.*;


public abstract class Update  extends Parent implements ActionListener{
    public Update(){
        setLocation(100, 200);
        setSize(550, 550);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
     
        Label2 = new JLabel("Search By ID");
        add(Label2);
        Text1 = new JTextField("");
        add(Text1);
        area1 = new JTextArea("");
        add(area1);
        area1.setEnabled(false);
        this.Label3 = new JLabel("Name");
        add(Label3);
        this.Text2 = new JTextField("");
        add(Text2);
        this.Label4 = new JLabel("Phone");
        add(Label4);
        this.Text3 = new JTextField("");
        add(Text3);
        this.Label5 = new JLabel("Email");
        add(Label5);
        this.Text4 = new JTextField("");
        add(Text4);
        this.Label6 = new JLabel("ID");
        add(Label6);
        this.Text5 = new JTextField("");
        add(Text5);
        Label7 = new JLabel("Password");
        add(Label7);
        P1 = new JPasswordField("");
        add(P1);
        area2 = new JTextArea("");
        add(area2);
        area2.setEditable(false);

         Back = new JButton ("Back");
         Next = new JButton("Next");
         Bu1 = new JButton("Submit");
         add(Next);
         add(Back);
         add(Bu1);
         
          Next.addActionListener(this);
          Back.addActionListener(this);
          Bu1.addActionListener(this);
         Label2.setBounds(30, 50, 150, 40);
         Text1.setBounds(110, 50, 150, 40);
         area1.setBounds(270, 10, 270, 200);
         area2.setBounds(270, 230, 270, 200);
         Bu1.setBounds(120, 120, 100, 30);
         Label3.setBounds(30, 240, 150, 40);
         Text2.setBounds(100, 240, 150, 40);
         Label4.setBounds(30, 280, 150, 40);
         Text3.setBounds(100, 280, 150, 40);
         Label5.setBounds(30, 320, 150, 40);
         Text4.setBounds(100, 320, 150, 40);
         Label6.setBounds(30, 360, 150, 40);
         Text5.setBounds(100, 360, 150, 40);
         Label7.setBounds(30, 400, 150, 40);
         P1.setBounds(100, 400, 150, 40);
         Back.setBounds(10, 450, 100, 40);         
         Next.setBounds(400, 450, 100, 40);

    }

  
    @Override
    public abstract void actionPerformed(ActionEvent e);
 
    
}
