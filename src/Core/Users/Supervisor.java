package Core.Users;
import Core.Product;
import Interface.FileManager;
import Core.lib.Worker;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Thread;

public class Supervisor extends User implements  Serializable, FileManager{
   
    
    static boolean boo = true; 
    static ArrayList <Supervisor> List = new ArrayList <Supervisor> ();
    static ArrayList <InventoryClerk> I= null;
    static ArrayList <Product> P = null;
    static ArrayList <Worker> W = null;
    static HashMap<String , String> Access = new HashMap<String , String>();

    
     public String toString(InventoryClerk k) {
        return "Name: "+ k.Name+"\n" + "ID: "+k.ID+"\n"+ "Phone: "+k.Phone+"\n"+"Email: "+k.Email;
    }
     public String toString(Product t) {
        return "Name: "+ t.Name+"\n" +"Brand: "+t.Brand+"\n" +"ParCod: "+t.ParCode+"\n" +"Type: "+t.Type+"\n"+"EXP_Date: "+ t.EXP_Date+"\n"+"PRO_Date:"+t.PRO_Date+"\n"+"Quantity:"+t.Quantity;
    }
    public String toString (Worker r){
        return "Name: "+ r.Name+"\n"+"ID: "+r.ID+"\n"+ "Phone: "+r.Phone+ "\n";
    }

   public Supervisor(){  
    //InventoryClerk x= new InventoryClerk();
    //I = (ArrayList <InventoryClerk>) (Object)x.read();
    //Product y= new Product();
    //P = (ArrayList <Product>) (Object)y.read();
    //Worker z=new Worker();
    //W = (ArrayList <Worker>) (Object)z.read();
   }
   
    
    public void write (Object O) {
        if (boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Supervisor x = ((Supervisor) O);
         List.add(x);
          addFile();
           try{
        ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("Supervisor1.bin")); // hena m3 kol class zawed 3ala esm el file el 2sasy 1 
        Access= (HashMap<String , String>)Bin.readObject();
        Bin.close();
        ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream("Supervisor1.bin"));
        Access.put(x.Name, x.getpassword());
        add.writeObject(Access);
        add.close();

         }
        catch(Exception e){
       
             try {
                  ObjectOutputStream add= new ObjectOutputStream(new FileOutputStream("Supervisor1.bin"));
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
                FileOutputStream fileOut = new FileOutputStream("Supervisor.bin");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();
            }
         catch (Exception Error) {}
    }
    
   
    public static void openToRead() throws IOException, ClassNotFoundException {
        try {      
            FileInputStream fileIn =  new FileInputStream("Supervisor.bin");
            ObjectInputStream in =  new ObjectInputStream(fileIn);
            List = (ArrayList<Supervisor>) (Object) in.readObject();
            boo = false;
         }
        catch(Exception e) {}
    }
    @Override
        public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) List;
    }
    
    public String searchInventoryClerk (String ID){
        //if (I==null){
            InventoryClerk h = new InventoryClerk();
            I = (ArrayList<InventoryClerk>) (Object) h.read();
        //}
        for(InventoryClerk x : I)
        {
            if (x.ID.equals(ID)){
                return toString(x);
            }
        }
        return null;
    }
    
    public boolean removeInventoryClerk (String ID){
       /* if (I==null){
            InventoryClerk h = new InventoryClerk();
            I = (ArrayList<InventoryClerk>) (Object) h.read();
        }*/
        searchInventoryClerk(ID);
        int c=-1, i=0;
        for (InventoryClerk x : I){
            if (x.ID.equals(ID)){
                c=i;
                break;
            } 
            i++;
        }
            if (c!=-1){
                I.remove(c);
                InventoryClerk.addFile();
                return true;
            }else {
                return false;
            }
    }
    
    /*public void updateInventoryClerk (String ID) {
        InventoryClerk h = new InventoryClerk();
        //I = (ArrayList<InventoryClerk>) (Object) h.read();
        //h.ID="5555555555555";
        //h.Name="hany galal nour el den el beshbeshy";
        //h.Phone="09000";
        //h.Setpassword("hanya");
        searchInventoryClerk(ID);
        removeInventoryClerk(ID);
        h.write(h);
    }*/
    
    public void appendProduct (Product ProductObject){
        ProductObject.write(ProductObject);
    }
    public  String searchProduct (String ParCode){
        //if (P==null){
            Product h = new Product();
            P= (ArrayList<Product>) (Object) h.read();
        //}
        for(Product y : P)
        {
            if (y.ParCode.equals(ParCode)){
                return toString(y);
            }
        }
        return null;
    }
    public  boolean removeProduct (String ParCode){
        /*if (P==null){
            Product h = new Product();
            P = (ArrayList<Product>) (Object) h.read();
        }*/
        searchProduct(ParCode);
        int k=-1, i=0;
        for (Product x : P){
            if (x.ParCode.equals(ParCode)){
                k=i;
                break;
            }
            i++;
        }
        if (k!=-1){
            P.remove(k);
            Product.addFile();
            return true;
        }else{
            return false;
        }
    }      
        /*public  void updateProduct(String ParCode) {
            Product h = new Product();
            //P = (ArrayList<Product>) (Object) h.read();
            searchProduct(ParCode);
            removeProduct(ParCode);
            h.write(h);
        }*/
        public String searchWorker (String ID){
           // if (W==null){
                Worker h = new Worker();
                W=(ArrayList<Worker>) (Object) h.read();
            //}
        for(Worker z : W)
        {
            if (z.ID.equals(ID)){
                return toString(z);
            }
        }
        return null;
    }
        public boolean removeWorker(String ID) {
         /*if (W == null) {
            Worker h = new Worker();
            W =(ArrayList<Worker>) (Object) h.read();
        }*/
        searchWorker(ID);
        int g = -1, i = 0;
        for (Worker x : W) {
            if (x.ID.equals(ID)) {
                g = i;
                break;
            }
            i++;
        }
        if (g != -1) {
            W.remove(g);
            Worker.addFile();
            return true;
        } else {
            return false;
        }
    }
        /*public void updateWorker (String ID){
            Worker h = new Worker ();
            //W= (ArrayList<Worker>) (Object) h.read();
            searchWorker(ID);
            removeWorker(ID);
            h.write(h);
        }*/       
}

    
 