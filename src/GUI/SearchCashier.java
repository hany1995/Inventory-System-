package GUI;
import Core.Users.Cashier;
import Core.Users.Manager;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class SearchCashier extends Search{
    public  SearchCashier(){
        
        this.Label1 = new JLabel("Search an Cashier");
        add(Label1);
        Label1.setBounds(10, 5, 150, 40);
        
    }
    public static void main (String[] args) {
            SearchCashier main = new SearchCashier();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bu1){
            Manager us =new  Manager();
            Cashier ch = new Cashier();
            ch.ID=Text1.getText();
            area1.setText(us.searchCashier(ch.ID));
        }
        else if(e.getSource()==Back){
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }
    
    
}