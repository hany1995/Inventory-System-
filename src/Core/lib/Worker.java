package Core.lib;
import Core.Users.Info;
import Interface.FileManager;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker extends Info implements Serializable, FileManager{

    public String ID;
    static boolean boo = true; 
    static ArrayList <Worker> List = new ArrayList <Worker> ();
    
         public static void addFile() {
             try {
                 FileOutputStream outFile = new FileOutputStream("Worker.bin"); 
                 ObjectOutputStream out = new ObjectOutputStream(outFile);
                 out.writeObject(List);
                 out.close();
                 outFile.close();
         }
         catch (Exception Error) {}
     }
    @Override
        public void write (Object O){
        if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Worker x = ((Worker)O);
         List.add(x);
         addFile();
     }
     
    public static void openToRead() throws IOException, ClassNotFoundException {
            if (boo) {
            FileInputStream fileIn = new FileInputStream("Worker.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List = (ArrayList<Worker>) (Object) in.readObject();
            boo = false;
            }
    }
    @Override
    public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
}
