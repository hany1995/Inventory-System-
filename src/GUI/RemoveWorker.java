package GUI;
import Core.Users.Manager;
import Core.Users.Supervisor;
import java.awt.event.*;
import javax.swing.*;
public class RemoveWorker extends Parent implements ActionListener{
    public  RemoveWorker(){
        setLocation(100, 200);
        setSize(400, 300);
                 //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("\t\t(-->( Welcome To You In Inventory )<--)");
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         this.getContentPane().setLayout(null);

        this.Label2 = new JLabel ("Enter The Name of the worker to Remove");
        add(Label2);
        this.Text1 = new JTextField("");
        add(Text1);
        this.Next = new JButton ("Output");
        add(Next);

        Text1.setBounds(150, 90, 150, 40);
        Label2.setBounds(50, 50, 300, 40);
        Next.setBounds(220, 200, 150, 40);
        Next.addActionListener(this);
        
    }
        public static void main (String[] args) {
            RemoveWorker main = new RemoveWorker();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){
                Supervisor us = new Supervisor();
                us.removeWorker(SK);
            }
            System.out.println("Worker"+SK+" removed");
        } else if(e.getSource()==Back){
            dispose();
            new Supervisor_GUI().setVisible(true);
        }
            
            
        
    }

}
