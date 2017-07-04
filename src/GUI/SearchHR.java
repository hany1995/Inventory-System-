package GUI;
import Core.Users.Cashier;
import Core.Users.HR;
import Core.Users.Manager;
import Core.Users.User;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SearchHR  extends Search {
    public  SearchHR(){
        
        this.Label1 = new JLabel("Search an HR");
        add(Label1);
        
        Label1.setBounds(10, 10, 150, 40);
        
    }
    public static void main (String[] args) {
            SearchHR main = new SearchHR();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
       
             if(e.getSource()==Bu1){
            Manager us =new  Manager();
            HR ch = new HR();
            ch.ID=Text1.getText();
            area1.setText(us.searchHR(ch.ID));
        }
        else if(e.getSource()==Back){
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }

}
    

