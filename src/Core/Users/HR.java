package Core.Users;
import static Core.Users.Supervisor.Access;
import Interface.FileManager;
import Core.lib.Worker;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HR extends User implements Serializable, FileManager{
    static boolean boo = true; 
    public void testEmployee(){}
    static  ArrayList <HR> List = new ArrayList <HR> ();
    static HashMap<String , String> Access = new HashMap<String , String>();

    //static ArrayList <Worker> W = null;
    //static ArrayList <InventoryClerk> I = null;
         
   /* public HR (String name, String pass, String email){
        super(name, pass, email);
    }*/
    
   public HR( ){
    //Worker x= new Worker();
    //W= (ArrayList <Worker>) (Object)x.read();
    //InventoryClerk y= new InventoryClerk();
    //I= (ArrayList <InventoryClerk>) (Object)y.read();
   }
    
    public static void addFile(){
            try {FileOutputStream fileOut = new FileOutputStream("HR.bin");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();
        } catch (Exception Error) {
      
        }
    }
    
    @Override
    public void write (Object O) {
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         HR x = ((HR) O);
         List.add(x);
          addFile();
          try{
         ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("HR1.bin"));
         Access= (HashMap<String , String>)Bin.readObject();
         Bin.close();
         ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream("HR1.bin"));
         Access.put(x.Name, x.getpassword());
         add.writeObject(Access);
         add.close();

         }
        catch(Exception e){
       
             try {
                  ObjectOutputStream add= new ObjectOutputStream(new FileOutputStream("HR1.bin"));
           Access.put(x.ID, x.getpassword());
         add.writeObject(Access);
         add.close();
             } catch (IOException ex) {
                 Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
             }  
        }
     }
    
    public static void openToRead() throws IOException, ClassNotFoundException {
        if (boo) {
            FileInputStream fileIn = new FileInputStream("HR.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List = (ArrayList<HR>) (Object) in.readObject();
            boo = false;
        }
    }
    @Override
        public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return (ArrayList<Object>) (Object) List;
    }       
         public void appendWorker (Worker WorkerObject) {
         WorkerObject.write(WorkerObject);
     }
         public void appendInventoryClerk (InventoryClerk InventoryClerkObject) {
         InventoryClerkObject.write(InventoryClerkObject);
     }
              
     }
   

