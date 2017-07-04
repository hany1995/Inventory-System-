package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public abstract class  Remove  extends Parent implements ActionListener{
    public  Remove(){
        setLocation(100, 200);
        setSize(400, 300);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);
        this.Label1 = new JLabel("Search For Employe to remove data ");
        add(Label1);
        this.Label2 = new JLabel ("Enter an ID");
        add(Label2);
        this.Text1 = new JTextField("");
        add(Text1);
        this.Next = new JButton ("Remove OutPut");
        add(Next);
        this.Back = new JButton ("Back");
        Label1.setBounds(10, 10, 300, 40);
        Text1.setBounds(150, 90, 150, 40);
        Label2.setBounds(50, 90, 150, 40);
        Next.setBounds(220, 200, 150, 40);
        Back.setBounds(10, 200, 150, 40);
        Next.addActionListener(this);
        Back.addActionListener(this);
    }

    @Override
    public abstract void actionPerformed(ActionEvent e) ;
 

}
