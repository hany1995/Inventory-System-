package GUI;
import Core.Users.Manager;
import java.awt.*;
import javax.swing.*;
import java .awt.event.*;
public class RemoveHR  extends Remove implements ActionListener{
    public  RemoveHR(){

        this.Label1 = new JLabel("Search an HR To Remove");
        add(Label1);

        Label1.setBounds(10, 40, 200, 40);

        Next.addActionListener(this);
    }
    public static void main (String[] args) {
            RemoveHR main = new RemoveHR();

            main.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Next){
            String SK = Text1.getText();
            if(!SK.equals("ID")){ 
                Manager us = new Manager();
                us.removeHR(SK);
            }
            System.out.println("HR "+SK+" removed");
        }else if(e.getSource()==Back){
            dispose();
            new Manager_GUI().setVisible(true);
        }
    }
}
