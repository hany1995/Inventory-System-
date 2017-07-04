package Core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Supplier implements Serializable{
    public String CompanyName;
    public String Address;
    public String TelephoneNo;
    public String LastPurchaseOrder;
    public String ID;
    static ArrayList <Supplier> List = new ArrayList <> ();
    static boolean boo = true; 
     
     
     
    public void write (Object O) {
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Supplier x = ((Supplier) O);
         List.add(x);
          addFile();
     }
    public static void addFile(){
            try {
                FileOutputStream fileOut = new FileOutputStream("Supplier.bin");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();            
        } catch (Exception Error) {}
    }
    
    public static void openToRead() throws IOException, ClassNotFoundException {
        if (boo) {
            FileInputStream fileIn = new FileInputStream("Supplier.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List = (ArrayList<Supplier>) (Object) in.readObject();
            boo = false;
        }
    }
        public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
}
