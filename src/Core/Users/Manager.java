package Core.Users;
import static Core.Users.Supervisor.Access;
import Interface.FileManager;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends User implements Serializable, FileManager{
    static ArrayList<Supervisor> V = null;
    static ArrayList<HR> H = null;
    static ArrayList<Cashier> F = null;
  /* public Manager(String name, String pass, String email) {
        super(name, pass, email);
    }*/
    public String toString (Supervisor u){
        return "Name: "+u.Name+"\n"+"ID: "+ u.ID+"\n"+ "Email: "+u.Email+"\n"+"Phone: "+u.Phone;
    }
    public String toString (HR q){
        return "Name: "+q.Name+"\n"+"ID: "+ q.ID+"\n"+ "Email: "+q.Email+"\n"+"Phone: "+q.Phone;
    }
    public String toString (Cashier q){
        return "Name: "+q.Name+"\n"+"ID: "+ q.ID+"\n"+ "Email: "+q.Email+"\n"+"Phone: "+q.Phone;
    }
     public Manager(){
    //Supervisor x= new Supervisor();
    //V = (ArrayList <Supervisor>) (Object)x.read();
    //HR y= new HR();
    //H = (ArrayList <HR>) (Object)y.read();
    //Cashier z=new Cashier();
    //F = (ArrayList <Cashier>) (Object)z.read();
   }
     
    static boolean boo = true; 
    static ArrayList <Manager> List = new ArrayList <Manager> ();
    
    @Override
    public void write (Object O) {
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Manager x = ((Manager) O);
         List.add(x);
          addFile();
           try{
        ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("Manager1.bin"));
        Access= (HashMap<String , String>)Bin.readObject();
        Bin.close();
        ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream("Manager1.bin"));
        Access.put(x.Name, x.getpassword());
        add.writeObject(Access);
        add.close();

         }
        catch(Exception e){
       
             try {
                  ObjectOutputStream add= new ObjectOutputStream(new FileOutputStream("Manager1.bin"));
           Access.put(x.ID, x.getpassword());
         add.writeObject(Access);
         add.close();
             } catch (IOException ex) {
                 Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
             }  
        }
     }
    
    public static void addFile(){
            try {
                FileOutputStream fileOut = new FileOutputStream("Manager.bin"); 
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();
            
        } catch (Exception Error) {}
    }
    
   
    public static void openToRead() throws IOException, ClassNotFoundException {
        if (boo) {
            FileInputStream fileIn = new FileInputStream("Manager.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List = (ArrayList<Manager>) (Object) in.readObject();
            boo = false;
        }
    }
    @Override
        public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
    
    
     public  void appendSupervisor (Supervisor SupervisorObject) {
         SupervisorObject.write(SupervisorObject);
     }
    
    public String searchSupervisor (String ID){
         //if (V == null){
           Supervisor h = new Supervisor();
           V =(ArrayList<Supervisor>) (Object) h.read();
        //}
         for (Supervisor x: V){
             if (x.ID.equals(ID)) {
                 return toString(x);
             }
         }
        return null;
     }
    
    public  boolean removeSupervisor (String ID) {  
        /*if (V == null) {
            Supervisor h = new Supervisor();
            V =(ArrayList<Supervisor>) (Object) h.read();
        }*/
        searchSupervisor(ID);
         int w = -1, i = 0;
         for (Supervisor x : V){
             if (x.ID.equals(ID)) {
                w = i;
                break;
            }
            i++;
         }
         if (w!=-1){
            V.remove(w);
            Supervisor.addFile();
            return true;
         }else { 
             return false;
         }
     }  
    /*public void updateSupervisor (String ID){
        Supervisor h = new Supervisor();
        searchSupervisor(ID);
        removeSupervisor(ID);
        h.write(h);
    }*/
    
    
    public void appendHR (HR HRObject) {
         HRObject.write(HRObject);
     }
    
    public String searchHR (String ID)  {
        //if (H == null) {
            HR h = new HR ();
            H = (ArrayList<HR>) (Object) h.read();
        //}
         for (HR y: H){
             if (y.ID.equals(ID)) {
                 return toString(y);
             }
         }
        return null;
     }
    
     public boolean removeHR (String ID){
         /*if (H==null) {
             HR h = new HR();
             H = (ArrayList<HR>) (Object) h.read();
         }*/
         searchHR(ID);
         int m=-1, i=0;
         for (HR x : H){
             if (x.ID.equals(ID)){
                 m=i;
                 break;
             }
             i++;
         }
         if (m!=-1){
            H.remove(m);
            HR.addFile();
            return true;
         }else { 
             return false;
         }
     }
     /*public void updateHR (String ID){
         HR h = new HR ();
         searchHR(ID);
         removeHR(ID);
         h.write(h);
     }*/
     
         
       
    public void appendCashier (Cashier CashierObject) {
         CashierObject.write(CashierObject);
     }
    
    public String searchCashier (String ID){
         //if (F==null){
             Cashier h = new Cashier ();
             F = (ArrayList<Cashier>) (Object) h.read();
         //}
         for (Cashier z: F){
             if (z.ID.equals(ID)) {
                 return toString(z);
             }
         }
        return null;
     }
    
     public boolean removeCashier (String ID){
         /*if (F==null){
             Cashier h = new Cashier ();
             F = (ArrayList<Cashier>) (Object) h.read();
         }*/
         searchCashier(ID);
         int d=-1, i=0;
         for (Cashier x : F){
             if (x.ID.equals(ID)){
             d=i;
             break;
             }
             i++;
         }
         if (d!=-1){
            F.remove(d);
            Cashier.addFile();
            return true;
         }else { 
             return false;
         }
     }  
     /*public void updateCashier (String ID){
         Cashier h = new Cashier ();
         searchCashier(ID);
         removeCashier(ID);
         h.write(h);
     }*/
}