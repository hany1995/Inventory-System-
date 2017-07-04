package Core;
import Interface.FileManager;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Product implements FileManager,Serializable{
    public String Name;
    public String ParCode;
    public int Quantity;
    public String Type;
    public String Brand;
    public  String EXP_Date;
    public String PRO_Date;
    static ArrayList <Product> List = new ArrayList <Product> ();
    static boolean boo = true;
 
    public String toString() {
        return "Name: " + Name + "\n" + "ParCode: " + ParCode + "\n" + "Quantity: " + Quantity + "\n" + "Type: " + Type + "\n" + "Brand: " + Brand + "\n" + "Expiration Date: " + EXP_Date + "\n" + "Production Date: " + PRO_Date;
    }
    public static void addFile(){
            try {
                FileOutputStream fileOut = new FileOutputStream("Product.bin") ;
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();
            }
         catch (Exception Error) {}
    }
    
    public void write (Object O) {
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Product x = ((Product) O);
         List.add(x);
          addFile();
     }
    
    public static void openToRead() throws IOException, ClassNotFoundException {
        if (boo) {
            FileInputStream  fileIn = new FileInputStream("Product.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List = (ArrayList<Product>) (Object) in.readObject();
            boo = false;
        }
    }
    @Override
    public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
}

