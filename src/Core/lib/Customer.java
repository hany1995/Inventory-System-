package Core.lib;


import Core.lib.*;
import Core.Users.Info;
import Core.Users.Supervisor;
import Interface.FileManager;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Customer extends Info implements Serializable, FileManager{
    static ArrayList <Customer> List = new ArrayList <Customer>();
    static boolean boo = true;
    public void order (Supervisor x) {}
    public static void addFile (){
        try {
            FileOutputStream outFile = new FileOutputStream("Customer.bin");
            ObjectOutputStream out = new ObjectOutputStream(outFile);
            out.writeObject(List);
            outFile.close();
            out.close();
            }
        catch (Exception Error){}
    }
    @Override
    public void write (Object O){
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        Customer x = ((Customer)O);
        List.add(x);
        addFile();
    }
    public static void openToRead () throws IOException, ClassNotFoundException{
        if (boo) {
        FileInputStream inFile = new FileInputStream("Customer.bin");
        ObjectInputStream in = new ObjectInputStream(inFile);
        List = (ArrayList<Customer>) (Object) in.readObject();
        boo = false;
        }
    }
            
    @Override
    public ArrayList<Object> read() {
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
}
