package Core.Users;
import Core.Supplier;
import Interface.FileManager;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InventoryClerk extends User implements Serializable, FileManager{
  
    
    static ArrayList <Supplier> S = null;
    static boolean boo = true; 
    static HashMap<String , String> Access = new HashMap<String , String>();

    static ArrayList <InventoryClerk> List = new ArrayList <InventoryClerk> ();
  /*  public InventoryClerk (String name, String pass, String email){
        super(name, pass, email);
    }*/
    public String toString (Supplier j){
        return "Company Name: "+j.CompanyName+"\n"+"ID: "+j.ID+"\n"+"Address: "+j.Address+"\n"+"TelephoneNo: " +j.TelephoneNo;
    }
    public InventoryClerk(){
    //Supplier x = new Supplier();
    //S = (ArrayList <Supplier>) (Object)x.read();
    }
    
    public static void addFile(){
            try {FileOutputStream fileOut = new FileOutputStream("InventoryClerk.bin"); 
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();
            
        } catch (Exception Error) {}
    }
    
    public void write (Object O) {
        if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(InventoryClerk.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InventoryClerk.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         InventoryClerk x = ((InventoryClerk) O);
         List.add(x);
          addFile();
           try{
         ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("InventoryClerk1.bin"));
         Access= (HashMap<String , String>)Bin.readObject();
         Bin.close();
         ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream("InventoryClerk1.bin"));
         Access.put(x.Name, x.getpassword());
         add.writeObject(Access);
         add.close();

         }
        catch(Exception e){
       
             try {
                  ObjectOutputStream add= new ObjectOutputStream(new FileOutputStream("InventoryClerk1.bin"));
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
            FileInputStream fileIn = new FileInputStream("InventoryClerk.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List = (ArrayList<InventoryClerk>) (Object) in.readObject();
            boo = false;
        }
    }
    @Override
        public ArrayList<Object> read(){
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(InventoryClerk.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InventoryClerk.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
    
     public void appendSupplier (Supplier SupplierObject){
         SupplierObject.write(SupplierObject);
     }
    
     public String searchSupplier (String ID)  {
         //if (S==null){
             Supplier h = new Supplier ();
             S = (ArrayList<Supplier>) (Object) h.read();
         //}
         for (Supplier x: S){
             if (x.ID.equals(ID)) {
                 return toString (x);      
              } 
         }
        return null;
     } 
     
     
     public boolean removeSupplier (String ID) {
       /*  if (S==null) {
             Supplier h = new Supplier ();
             S = (ArrayList<Supplier>) (Object) h.read();
         }*/
         searchSupplier(ID);
         int w=-1, i=0;
         for (Supplier x: S){
             if (x.ID.equals(ID)){
                 w=i;
                 break;
             }
             i++;
         }
         if (w!=-1){
            S.remove(w);
            Supplier.addFile();
            return true;
         }else { 
             return false;
         }
     }  
     /*public void updateSupplier (String ID){
         Supplier h = new Supplier();
         searchSupplier(ID);
         removeSupplier(ID);
         h.write(h);
     }*/
}
