package Core;


import Core.Users.HR;
import Core.Users.Supervisor;
import Core.Users.*;
import Core.lib.*;
import Interface.FileManager;
import java.util.*;
import java.io.*;
public class Inventoryproject {
       
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException
	{
            
            makeOrderThread x= new makeOrderThread();
            Product z= new Product();
            z.Brand= "betti";
            z.Name= "juice";
            z.Brand= "3aser";
            x.start();
            x.makeOrder(z);
            
            getOrderThread n=new getOrderThread();
            String c;
            n.start();
            c=n.getLastOrder();
            System.out.println(c);
            
            
            
            
           /*User x=new User();
           String c;

            c = x.LogIn("mohamed" ,"1234");
            System.out.println(c);*/
           /* 
            HR k=new HR();
            k.Name="mohamed";
            k.ID="1234";
            k.Setpassword("1234");
            k.write(k);*/
            /*
            Supervisor x = new Supervisor();
            x.ID = "dfik";
            x.Name = "shamn";
            x.Phone = "010000000";
            x.Email = "sha2labaz@gmail.com";
            x.Setpassword("12345");
            x.write(x);
            */
            /*Supervisor s = new Supervisor();
            s.Name="ss";
            s.ID="12";
            s.Email="as@s";
            s.write(s);
            Manager m = new Manager ();
            //m.removeSupervisor("12");
            //System.out.println(m.searchSupervisor("12"));*/
            
            
            /*HR rr = new HR();
            rr.Name="salah";
            rr.ID="123";
            rr.Email="as@s";
            //rr.write(rr);
            Manager g = new Manager();
            //g.removeHR("12");
            System.out.println(g.searchHR("123"));*/
            
            /*Cashier ff = new Cashier();
            ff.Name="ss";
            ff.ID="12";
            ff.Email="as@s";
            ff.write(ff);
            Manager n = new Manager();
            //n.removeCashier("12");
            System.out.println(n.searchCashier("12"));*/
            
            /*Supplier s = new Supplier();
            s.Address = "12 Mahmoud Elbadry";
            s.ID = "56734";
            s.CompanyName = "Dr. Mohammad Morsi Ltd";
            s.write(s);
            //InventoryClerk x = new InventoryClerk();
            //x.removeSupplier("56734");*/
            
            /*Worker e = new Worker();
            e.ID="2015";
            e.Name="3amel";
            e.Phone="696969";
            //e.write(e);
            Supervisor p = new Supervisor();
            //p.removeWorker("2015");
            System.out.println(p.searchWorker("2015"));*/
            
            /*Customer u = new Customer();
            u.Name="zebon";
            u.Phone="lo2ta";
            //u.write(u);
            Cashier t = new Cashier();
            t.removeCustomer("lo2ta");
            //System.out.println(t.searchCustomer("lo2ta"));*/
            
                        
            /*Product x=new Product();
            x.Brand="jkj";
            x.Name="gohayna";
            x.Quantity=10;
            x.ParCode="1111";
            x.write(x);
            Supervisor pp = new Supervisor();
            //pp.removeProduct("1111");
            System.out.println(pp.searchProduct("1111"));*/
            
            
            //HR y = new HR();
          //  Supervisor y = new Supervisor();
            //y.updateInventoryClerk("12336");
            //System.out.println( y.searchInventoryClerk("12336"));
            //y.removeInventoryClerk("12336");
            //x.ID = "12336";
            //x.Name = "zzzzzzzzzzzzz";
            //x.Phone = "8888888";
            //x.Email = "Hanya@gmail.com";
            //y.appendInventoryClerk(x);
            //InventoryClerk t = new InventoryClerk();
            /*t.Email="kkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
            t.Phone="00000000000000000";
            t.ID="14920114";
            t.write(t);
            y.updateInventoryClerk("4");
            //y.updateInventoryClerk("kkkkkkk");*/
            
            
            /*
		String ID;
                Scanner x=new Scanner(System.in);
                
                Manager m=new Manager();
                HR r=new HR();
                r.Name=x.next();
                r.ID=x.next();
                r.Email=x.next();
                r.Phone=x.next();
                m.appendHR(r);
                ID=x.next();
                */
                //m.removeHR(ID);
                
                

		/*String Password;
		String ID;
                String IDD;
		int i=0;
		int ch = 0;
		int find;
		Scanner loged=new Scanner(System.in);
		boolean c=false;
		boolean t=false;
                boolean e=false;
		String op=null;
                char z;
		char x;
                char h =0;
		Scanner entryType= new Scanner(System.in);
		Scanner type= new Scanner (System.in);
		while (!t==true)
		{
		System.out.print("A-Manager\n"+"B-HR\n"+"C-FR\n"+
				"D-Super Visor\n"+ "E-Inventory Clerk\n"
				+"Enter no. of Identity:");
		
		op=entryType.nextLine();
		
		if (op.equals("A") || op.equals("B")|| op.equals("C") || op.equals("D") || op.equals("E"))
		{
			t=true;
		}
		
		}
		x=op.charAt(0);
		switch(x){
		case'A': 
			while(c!=true)
			{
			String manager="Manager";
                        Manager m=new Manager();
			System.out.print("ID:");
			ID=loged.next();
			System.out.print("\nPassword:");
			Password=loged.next();
                        c=User.Login(ID, Password);
			int y;
			if (c==true)
			{
				System.out.println("Access Granted");
				
				System.out.println("________________\n\n\n\n\n");
				t=false;
				while(i==0)
				{
				while(!t==true)
				{
				System.out.println("A-Add User\n"+"B-RemoveUser\n"+"C-Search User\n"
						+"D-Get Statistics(under constraction)\n"+"Enter disired operation:");
				
                                
				op=entryType.next();
				if(op.equals("A") || op.equals("B")|| op.equals("C") || op.equals("D"))
				{
					t=true;
				}
                                }		
				t=false;
				z=op.charAt(0);
						
						switch (z){
						
						case'A':
							
							while(!e==true)
                                                        {
							System.out.println("\nA-HR\nB-FR\nC-Supervisor\nposition:");
							op=type.next();
                                                        h=op.charAt(0);
                                                        if(op.equals("A")||op.equals("B")||op.equals("C"))
                                                            e=true;
                                                        
                                                        }
                                                        e=false;
							switch (h){
							case 'A':
							HR addhr=new HR();
							System.out.println("Name:");
                       					addhr.Name=type.next();
							System.out.println("ID:");
							addhr.ID=type.next();
							System.out.println("Password:");
							//addhr.Password=type.next();
							System.out.println("Phone:");							
							addhr.Phone=type.next();
							System.out.println("Email:");
							addhr.Email=type.next();
                                                        Manager.appendHR(addhr);
								break;
							case 'B':
                                                       	/*FR addfr=new FR();
							System.out.println("Name:");
                       					addfr.Name=type.next();
							System.out.println("ID:");
							addfr.ID=type.next();
							System.out.println("Password:");
							addfr
							System.out.println("Phone:");							
							addfr.Phone=type.next();
							System.out.println("Email:");
							addfr.Email=type.next();
							Manager.appendFR(addfr);
								break;
							case 'C':
							Supervisor addsp=new Supervisor();
							System.out.print("Name:");
                       					addsp.Name=type.next();
							System.out.println("ID:");
							addsp.ID=type.next();
							System.out.println("Password:");
							
							System.out.println("Phone:");							
							addsp.Phone=type.nextLine();
							System.out.println("Email:");
							addsp.Email=type.next();	
                                                        Manager.appendSupervisor(addsp);
								break;
								
							}
							
							break;
							
						case'B':
							
							
							while(!t==true)
							{
							System.out.println("\nA-HR\nB-FR\nC-Supervisor\nposition:");
							op=type.next();
                                                        h=op.charAt(0);
							if(op.equals("A")||op.equals("B")||op.equals("C"))
								t=true;
							}
                                                        e=false;
							switch(h){
							case 'A':
                                                        HR hrremove=new HR();
							System.out.print("ID:");
							hrremove.ID=type.next();
                                                        
                                                        System.out.println("\ndeleted");
                                                        
								break;
							case 'B':
                                                           
							String frremove;
							System.out.print("ID:");
							frremove=type.next();
                                                        boolean ay7aga=m.removeFR(frremove);
                                                        System.out.println(ay7aga);
                                                        
                                                        
                                                        
								break;
							case 'C':
								Supervisor spremove=new Supervisor();
							System.out.println("ID:");
							spremove.ID=type.next();
                                                        System.out.println("deleted");
							break;
								
							}
							
							break;
							
						
						case'C':
                                                        
							System.out.println("ID:");
							IDD=type.nextLine();
							while(!t==true)
							{
							System.out.println("\nA-HR\nB-FR\nC-Supervisor\nposition:");
							op=type.next();
                                                        h=op.charAt(0);
							if(op.equals("A")||op.equals("B")||op.equals("C"))
								t=true;
							}
                                                        e=false;
							switch(h){
							case 'A':
								
                                                            m.searchHR(IDD);
                                                            System.out.print("done");
                                                            break;
							case 'B':
                                                            m.searchFR(IDD);
                                                            System.out.println("deleted");
                                                            break;
							case 'C':
                                                            System.out.println("deleted");
                                                            break;
							
							}
							break;
							
						case'D':
							System.out.println("this operation is not implemented yet !\n");
							
							break;
						
						default :
							
							break;

				
						}
				
						
						}
			}
			
			else
			{
				System.out.println("Access Denied");
				
			}
			}
		
			break;
			
		case'B':
			while(c!=true)
			{
                        HR Hr=new HR();
			String hr="HR";
			System.out.print("ID:");
			ID=loged.next();
			System.out.print("\nPassword:");
			Password=loged.next();
                        c=User.Login(ID, Password);
			int y;
			if (c==true)
			{
				System.out.println("Access Granted");
				
				System.out.println("________________\n\n\n\n\n");
				while(i==0)
                                {
                                    t=false;
                                    while(!t==true)
                                    {
				System.out.println("A-add Users\nB-test employee\nEnter desired operation:");
				op=entryType.nextLine();
                                if(op.equals("A") || op.equals("B")|| op.equals("C") || op.equals("D") || op.equals("E"))
				{
					t=true;
				}
                                }		
				t=false;
				z=op.charAt(0);
				
				switch(z)
				{
				case'A':
                                        while(i==0)
                                        {
					System.out.println("\nA-add Worker\nB-add Enventory Clerk\nposition:");
					op=type.next();
                                        h=op.charAt(0);
                                        if(op.equals("A")||op.equals("B"))
                                            t=true;
					}
                                        e=false;
                                        
					switch(h){
					case 'A':
						ArrayList<Worker>list=new ArrayList<Worker>(10);
						Worker w=new Worker();
						w.Name=type.nextLine();
						w.Phone=type.nextLine();
						list.add(w);
                                                
                                                
                                                
						System.out.println("Worker added");
						break;
					case 'B':
						
						InventoryClerk C=new InventoryClerk();
						C.Name=type.nextLine();
						C.ID=type.nextLine();
						C.Email=type.nextLine();
						C.Phone=type.nextLine();
						
						Hr.appendInventoryClerk(C);
						System.out.println("Clerk added");
						
						
						break;
					}
					break;
					
				
				case'B':
					System.out.print("This B!");
					break;
				}
				
				
				break;
				
			}
                        }
			
			else
			{
				System.out.println("Access Denied");
				
			}
			}
				break;
		case'C':
			while (c!=true)
			{
			String fr="FR";
			System.out.print("ID:");
			ID=loged.next();
			System.out.print("\nPassword:");
			Password=loged.next();
			c=User.Login(ID,Password);
			int y;
			if (c==true)
			{
				System.out.println("Access Granted");
				
				System.out.println("________________\n\n\n\n\n");
				while(i==0)
                                {
				    while(!t==true)
                                    {
				System.out.println("A-Employee payment\nB-Supplier payment\n"
                                        +"C-Daily profit"+"\nEnter desired operation:");
				op=entryType.nextLine();
                                if(op.equals("A") || op.equals("B")|| op.equals("C"))
				{
					t=true;
				}
                                }		
				t=false;
				z=op.charAt(0);
				
				switch(z)
				{
				case'A':
					System.out.print("This method isn't implemented yet!");
                                    break;
				case'B':
                                    System.out.print("This method isn't implemented yet!");
                                    break;
                                case'c':
                                    System.out.print("This method isn't implemented yet!");
                                    break;
			}
                        }
                        }
			else
			{
				System.out.println("Access Denied");
				
			}
			}
			break;
		case'D':
			while (c!=true)
			{
                        
                        Supervisor s=new Supervisor();
			String supervisor="superVisor";
			System.out.print("ID:");
			ID=loged.next();
			System.out.print("\nPassword:");
			Password=loged.next();
			c=User.Login(ID,Password);
			int y;
			if (c==true)
			{
				System.out.println("Access Granted");
                                String wo;
				System.out.println("________________\n\n\n\n\n");
				while(i==0)
				{
				System.out.println("A-Remove Worker/clerk\nB-modify Products\nC-add Products\nD-Make parchase order\n"
						+ "\nE-view Clerk's Complain\nF-search Worker/Clerk"
                                        + "\nEnter desired operation:");
				op=entryType.nextLine();
				z=op.charAt(0);
				
				switch(z){
				case 'A':
                                    while(i==0)
                                        {
					System.out.println("\nA-add Worker\nB-add Enventory Clerk\nposition:");
					op=type.next();
                                        h=op.charAt(0);
                                        if(op.equals("A")||op.equals("B"))
                                            t=true;
					}
                                        e=false;
                                        
					switch(h){
					case 'A':
                                            
                                            System.out.print("ID:");
                                            IDD=type.next();
                                            s.removeInventoryClerk(IDD);
                                            break;
                                        case 'B':
                                            
                                            System.out.print("ID:");
                                            wo=type.next();
                                            
                                            break;
                                        }
                                    
                                    break;
				case'B':
                                    System.out.print("This method isn't implemented yet!"); 
					
                                    break;
				case'C':
                                    System.out.print("This method isn't implemented yet!");
                                    break;
				case'D':
                                    System.out.print("This method isn't implemented yet!");
                                    break;
				case'E':
					
                                    break;
                                case'F':
                                    while(i==0)
                                        {
					System.out.println("\nA-add Worker\nB-add Enventory Clerk\nposition:");
					op=type.next();
                                        z=op.charAt(0);
                                        if(op.equals("A")||op.equals("B"))
                                            t=true;
					}
                                        e=false;
                                        
					switch(z){
					case 'A':
                                            
                                            System.out.print("ID:");
                                            IDD=type.next();
                                            s.searchInventoryClerk(IDD);
                                            break;
                                        case 'B':
                                            
                                            System.out.print("ID:");
                                            wo=type.next();
                                            
                                            break;
                                        }
                                    break;
				}
				
				
				break;
				
			}
                        }
			else
			{
				System.out.println("Access Denied");
				
			}
			}
			break;
		case'E':
			while (c!=true)
			{
			String clerk="InventoryClerk";
			System.out.print("ID:");
			ID=loged.next();
			System.out.print("\nPassword:");
			Password=loged.next();
			c=User.Login(ID,Password);
			int y;
			if (c==true)
			{
				System.out.println("Access Granted");
				
				System.out.println("________________\n\n\n\n\n");
				while(i==0)
				{
				System.out.println("A-Complain Worker\nB-ReciveProducts\nC-Send products\nEnter desired operation");
				op=entryType.nextLine();
				z=op.charAt(0);
				
				switch(z){
				case'A':
					
					break;
				
				case'B':
					
					break;
					
				case'C':
					
					break;
				}
				
				
				break;
				
			}
                        }
			else
			{
				System.out.println("Access Denied");
				
			}
			}
			break;
		
		
			
		}
		
		
		
	*/
	}
}
