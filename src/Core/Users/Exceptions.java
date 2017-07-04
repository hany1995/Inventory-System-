/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core.Users;

import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

public class  Exceptions extends Exception {
  public  Exceptions()
    {
        super();
    }
    public  Exceptions(String s)
    {
        super(s);
    }
    @Override
    public String toString()
    {
        return "My Exception";
    }

   /* int checkPositive(String x){
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for "+x +" !"));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Tray Again :(");
            }
        } while (number <= 0);

        return number;
    } */

          public   String checkEmail(String x){
        String email;
        do {
            email = JOptionPane.showInputDialog("Enter Valid input for "+x +" !");
            if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Tray Again :(");
            }
        } while (!email.contains("@") || !email.contains("."));

        return email;
    }
    
   public String checkPassLength(String x){
        String pass;
        do {
            pass = JOptionPane.showInputDialog("Enter more than 8 char for "+x +" !");
            if (pass.length()<8) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Try Again :(");
            }
        } while (pass.length()<8);

        return pass;
    }
       public int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for" + x));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Try Again");
            }
        } while (number <= 0);

        return number;
    }

   

   public String checkname(String x) {
        String name;
        String val = "^[a-zA-z]+$";

        do {
            name = JOptionPane.showInputDialog("Enter Characters only " + x);
            if (!name.matches(val)) {
                JOptionPane.showMessageDialog(null, "Not valid Name Try Again");
            }
        } while (!name.matches(val));

        return name;
    }
   
     public  String Invalidation(String x){
		
		String	number=x;
		while(!number.matches("[0-9]+$")){
	     	 number=JOptionPane.showInputDialog("Enter Numbers only " + x);
			if (!number.matches("[0-9]+")) { // to check int string crash 
                JOptionPane.showMessageDialog(null, "Not valid Input Try Again");
		    }
                }
		return number;
	}

}
