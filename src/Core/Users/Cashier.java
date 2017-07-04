package Core.Users;
import Core.Container;
import Core.Product;
import Core.Supplier;
import static Core.Users.Supervisor.Access;
import Core.lib.Customer;
import Interface.FileManager;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cashier extends User implements Serializable, FileManager{
    static ArrayList <Cashier> List = new ArrayList <Cashier> ();
    static ArrayList <Customer> C = null;
    static ArrayList<Product> List1 = new ArrayList<Product>();
    //static ArrayList <Container> cashier=null;
    public String toString (Customer c){
        return "Name: "+c.Name+"\n"+"Phone: " +c.Phone;
    }
    public void employeesPayment() {}
    public void supplierPayment (Supplier x){}
    public boolean sell (ArrayList<Container> cash) {
        try {
            ArrayList<Product> ProductList = new ArrayList<Product>();
            for (Container a: cash){
                Product pro = new Product();
                //pro = Supervisor.searchProduct(pro.ParCode);
                pro.Quantity -= a.num;
                ProductList.add(pro);            
            }
            for (Product b : ProductList){
                Product pro = new Product();
                //pro = Supervisor.updateProduct(pro.ParCode);
                
            }
        }
        catch (Exception Error){}
        return false;
    }
    static boolean boo = true; 
    
    
    public Cashier() {} 
    
    /*public Cashier (String name, String pass, String email){
        super(name, pass, email);
    }*/
    @Override
    public void write (Object O) {
        if(boo){
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Cashier x = ((Cashier) O);
         List.add(x);
          addFile();
           try{
        ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("Cashier1.bin"));
        Access= (HashMap<String , String>)Bin.readObject();
        Bin.close();
        ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream("Cashier1.bin"));
        Access.put(x.Name, x.getpassword());
        add.writeObject(Access);
        add.close();
         }
        catch(Exception e){
       
             try {
                  ObjectOutputStream add= new ObjectOutputStream(new FileOutputStream("Cashier1.bin"));
           Access.put(x.ID, x.getpassword());
         add.writeObject(Access);
         add.close();
             } catch (IOException ex) {
                 Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
             }    
        }
     }
    
    public static void addFile(){
            try {FileOutputStream fileOut = new FileOutputStream("Cashier.bin");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(List);
                out.close();
                fileOut.close();
            }
         catch (Exception Error) {}
    }
    
   
    public static void openToRead() throws IOException, ClassNotFoundException {
        if (boo) {
            FileInputStream fileIn = new FileInputStream("Cashier.bin");
            ObjectInputStream  in = new ObjectInputStream(fileIn);
            List = (ArrayList<Cashier>) (Object) in.readObject();
            boo = false;
        }
    }
    @Override
    public ArrayList<Object> read() {
       if (boo) {
            try {
                openToRead();
            } catch (IOException ex) {
                Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return (ArrayList<Object>) (Object) List;
    }
        public void appendCustomer (Customer CustomerObject){
            CustomerObject.write(CustomerObject);
        }
        public String searchCustomer (String Phone){
            Customer h = new Customer();
            C = (ArrayList<Customer>) (Object) h.read();
            for (Customer x : C){
                if (x.Phone.equals(Phone)){
                    return toString(x);
                }
            }
            return null;
        }
        public boolean removeCustomer (String Phone){
            //Customer h = new Customer ();
            //C = (ArrayList<Customer>) (Object) h.read();
            searchCustomer(Phone);
            int r=-1, i=0;
            for (Customer x: C){
                if (x.Phone.equals(Phone)){
                    r=i;
                    break;
                }
                i++;
            }
            if (r!=-1){
                C.remove(r);
                Customer.addFile();
                return true;
            }else{
                return false;
            }
        }
        
}
