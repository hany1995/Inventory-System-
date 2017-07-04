package GUI;
import Core.Users.Manager;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class RemoveSupervisor extends Remove{
    public  RemoveSupervisor(){
            
                this.Label1 = new JLabel("Search an SuperVisor To Remove");
        add(Label1);

        Label1.setBounds(10, 40, 200, 40);

        
    }
    public static void main (String[] args) {
            RemoveSupervisor main = new RemoveSupervisor();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){
                Manager us = new Manager();
                us.removeSupervisor(SK);
            }
            System.out.println("Supervisor "+SK+" removed");
        } else if(e.getSource()==Back){
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }
}
