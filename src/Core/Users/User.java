package Core.Users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

public  class User extends Info implements Serializable{
    public String ID;
    public String Email;
    String Password;
   public void Setpassword( String x){
       this.Password=x;
   }
   public String getpassword(){
       return Password;
   }
    /*public void setID(String id) {
       this.ID = id;
    }
    public String getID() {
       return this.ID;
    }*/
    static  Exceptions MyEX = new Exceptions("Inventory Exception");
 /*  public User(){
        
    }*/
   public User() {
        this.Email=" ";
        this.Name = " ";
        this.Password = " ";

     /*   if (!Email.contains("@") || !Email.contains(".")) {
            this.Email = MyEX.checkEmail("User name");
        } else {
            this.Email = email;
        }
*/
       /* if (pass.length() < 8) {
            this.Password = MyEX.checkPassLength("Password");
        } else {
            this.Password = pass;
        }*/
   
   }
    /*
    public String LogIn(String name,String pass) throws FileNotFoundException, IOException, ClassNotFoundException{
    HashMap<String,String> map = new HashMap<String,String>();
 
   
   if (true){
        ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("Manager1.bin"));
        map=( HashMap<String,String>)Bin.readObject();
          Bin.close();
        try{
        for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "Manager";
     }}
          catch(NullPointerException e){
          }
   } 
   else if(true) {    ObjectInputStream a = new ObjectInputStream(new FileInputStream("InventoryClerk1.bin"));
        map=( HashMap<String,String>)a.readObject();
          a.close();
        try{
        for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "InventoryClerk";
     }}
          catch(NullPointerException e){
          }
       
  
   }
   else if(true) {   ObjectInputStream B = new ObjectInputStream(new FileInputStream("Supervisor1.bin"));
        map=( HashMap<String,String>)B.readObject();
          B.close();
        try{
          for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "Supervisor";
     }}
          catch(NullPointerException e){
          }
        
   }
   else if (true){
        ObjectInputStream c = new ObjectInputStream(new FileInputStream("HR1.bin"));
        map=( HashMap<String,String>)c.readObject();
          c.close();
        try{
          for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "HR";
     }}
          catch(NullPointerException e){
          }
   }
   else {    
        ObjectInputStream d = new ObjectInputStream(new FileInputStream("FR1.bin"));
        map=( HashMap<String,String>)d.readObject();
          d.close();
        try{
          for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "FR";
        
     }}     
          catch(NullPointerException e){
          }
    }        
       return "!";  

    }*/
   public String LogIn(String name,String pass) throws FileNotFoundException, IOException, ClassNotFoundException{
    HashMap<String,String> map = new HashMap<String,String>();
 
  while (true){ 
   if (true){
        ObjectInputStream Bin = new ObjectInputStream(new FileInputStream("Manager1.bin"));
        map=( HashMap<String,String>)Bin.readObject();
          Bin.close();
        try{
        for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "Manager";
     }}
          catch(NullPointerException e){
          }
   } 
   if(true)  {    ObjectInputStream a = new ObjectInputStream(new FileInputStream("InventoryClerk1.bin"));
        map=( HashMap<String,String>)a.readObject();
          a.close();
        try{
        for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "InventoryClerk";
     }}
          catch(NullPointerException e){
          }
       
  
   }
    if(true) {   ObjectInputStream B = new ObjectInputStream(new FileInputStream("Supervisor1.bin"));
        map=( HashMap<String,String>)B.readObject();
          B.close();
        try{
          for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "Supervisor";
     }}
          catch(NullPointerException e){
          }
        
   }
   if(true) {
        ObjectInputStream c = new ObjectInputStream(new FileInputStream("HR1.bin"));
        map=( HashMap<String,String>)c.readObject();
          c.close();
        try{
          for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "HR";
     }}
          catch(NullPointerException e){
          }
   }
    if(true){    
        ObjectInputStream d = new ObjectInputStream(new FileInputStream("Cashier1.bin"));
        map=( HashMap<String,String>)d.readObject();
          d.close();
        try{
          for(String x: map.keySet()){
        if(map.get(name).equals(pass) && x.equals(name))
        return "Cashier";
        
     }}     
          catch(NullPointerException e){
          }
    }         
      return "!";  
    
  }

}
}



