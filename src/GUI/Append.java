
package GUI;
import java.awt.event.*;
import javax.swing.*;


public abstract class Append  extends Parent implements ActionListener{
    public Append(){
         setLocation(100, 200);
         setSize(400, 400);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
         

         

        this.Label2 = new JLabel("Name");
        add(Label2);
        this.Text1 = new JTextField("");
        add(Text1);
        this.Label3 = new JLabel("Phone");
        add(Label3);
        this.Text2 = new JTextField("");
        add(Text2);
        this.Label4 = new JLabel("Email");
        add(Label4);
        this.Text3 = new JTextField("");
        add(Text3);
        this.Label5 = new JLabel("ID");
        add(Label5);
        this.Text4 = new JTextField("");
        add(Text4);
        this.Label6 = new JLabel("Password");
        add(Label6);
        this.P1 = new JPasswordField("");
        add(P1);
         
         Back = new JButton ("Back");
         Next = new JButton("Next");
         
        
         
          add(Next);
          add(Back);
         
          Next.addActionListener(this);
          Back.addActionListener(this);
  
         Label2.setBounds(30, 50, 150, 40);
         Text1.setBounds(100, 50, 150, 40);
         Label3.setBounds(30, 100, 150, 40);
         Text2.setBounds(100, 100, 150, 40);
         Label4.setBounds(30, 150, 150, 40);
         Text3.setBounds(100, 150, 150, 40);
         Label5.setBounds(30, 200, 150, 40);
         Text4.setBounds(100, 200, 150, 40);
         Label6.setBounds(30, 250, 150, 40);
         P1.setBounds(100, 250, 150, 40);
         Back.setBounds(10, 300, 100, 40);         
         Next.setBounds(300, 300, 100, 40);
    }
    @Override
    public abstract void actionPerformed(ActionEvent e);   
}
