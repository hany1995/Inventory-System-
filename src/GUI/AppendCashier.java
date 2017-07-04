
package GUI;

import Core.Users.Cashier;
import Core.Users.Manager;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AppendCashier extends Append {
    public AppendCashier(){
                       this.Label1 = new JLabel("Append on Cashier");
        add(Label1);
               Label1.setBounds(20, 10, 200, 40);
              
               
    }

           public static void main (String[] args) {
            AppendCashier main = new AppendCashier();

            main.setVisible(true);  
}
   @Override
           public void actionPerformed(ActionEvent e) {
               
                try {
            if (e.getSource() == Next) {
                Cashier fr = new Cashier();
                Manager m = new Manager();

                fr.Name = Text1.getText();
                fr.Phone = Text2.getText();
                fr.Email = Text3.getText();

                if (!fr.Name.matches("^[a-zA-z]+$")) {
                    Myex.checkname(fr.Name);
                }
                if (!fr.Phone.matches("[0-9]+$")) {
                    Myex.Invalidation(fr.Phone);
                }
                if (!fr.Email.contains("@") || !fr.Email.contains(".")) {
                    Myex.checkEmail(fr.Email);
                }
                fr.ID = String.valueOf(Text4.getText());

                if (fr.ID.contains("-")) {
                    Myex.checkPositive(fr.ID);

                }
                fr.Setpassword(P1.getText());
                if (fr.getpassword().length() < 8) {
                    Myex.checkPassLength(fr.getpassword());
                }
                JOptionPane.showMessageDialog(null, "You Append On FR Get Back to main");
                m.appendCashier(fr);

            } else if (e.getSource() == Back) {
                dispose();
                new Manager_GUI().setVisible(true);
            }

        } catch (Exception e1) {

        }
    }
}
