/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.lang.Thread;
import Core.Product;

/**
 *
 * @author Rana
 */
public class makeOrderThread extends Thread {
    static ArrayList <Product> List1 = new ArrayList <Product> ();

    public synchronized void addFileR(){
            try {FileOutputStream fileOut = new FileOutputStream("report.bin");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List1);
                out.close();
                fileOut.close();
            }
         catch (Exception Error) {}
    }
    

      public void makeOrder(Object O){
         Product x =((Product) O);
         List1.add(x);
         addFileR(); 
      }
    @Override
   public void run(){ 
   addFileR();
   }
}
