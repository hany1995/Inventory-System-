/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Core.Users.Cashier;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Thread;
/**
 *
 * @author Rana
 */
public class getOrderThread extends Thread{
        static ArrayList <Product> List1 = new ArrayList <Product> ();

    public static void openToReadR() throws IOException, ClassNotFoundException {
            FileInputStream fileIn = new FileInputStream("report.bin");
            ObjectInputStream  in = new ObjectInputStream(fileIn);
            List1 = (ArrayList<Product>) (Object) in.readObject();
        }
    
        public String getLastOrder() throws IOException{
         String lastElement=null;   
        try {
            openToReadR();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lastElement=List1.get(List1.size() -1).toString();
        }  
        
        public void run() {
            try {
                openToReadR();
            } catch (IOException ex) {
                Logger.getLogger(getOrderThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(getOrderThread.class.getName()).log(Level.SEVERE, null, ex);
            }
  }
}