package menu_driven_account;
import java.util.*;
import java.io.*;


class account implements Serializable 
{
    String acc_no;
    String name;
    double balance;
    
    account(){} // its imp to have non para constructor for using serializable interface
    
    account(String a,String name,double bal)
    {
        acc_no=a;
        this.name=name;
        balance=bal;
    }
    @Override
    public String toString() // using toString to display account details
    {
        return "Account No: "+acc_no+"\nName: "+name+"\nBalance: "+balance+"\n";
    }
}
    
public class Menu_driven_account 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        account acc=null; // just a refernce
        HashMap<String,account> hm=new HashMap<>();
        
        try // the below code will display acc when the application is closed and opened 
        {
            FileInputStream fis=new FileInputStream("Accounts.txt");  // for reading from the file
            ObjectInputStream ois=new ObjectInputStream(fis); // serialization... basically it will help in saving the state of an object
            
            int count=ois.readInt(); // will check the no of accounts
            for(int i=0;i<count;i++)
            {
                acc=(account)ois.readObject(); // typcasting into account and reading the whole object at once
                System.out.print(acc);
                hm.put(acc.acc_no, acc); // adding the details in hashmap
            }
            // closing of the resources
            fis.close();
            ois.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        
        FileOutputStream fos=new FileOutputStream("Accounts.txt"); // it will create the file & write the contents
        ObjectOutputStream oos=new ObjectOutputStream(fos); // for write the object
        
        System.out.println("MENU: ");
        
        int choice;
        String accno;
        String name;
        double balance;
        
        do
        {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice: ");
            choice=sc.nextInt();
            
            sc.skip("(\r\n | [\n\r\u2028\u2029\u0085])?"); // for skiping any keyboard buffer like new line characters & etc.. unicode is also for the same
            
            switch(choice)
            {
                case 1:  System.out.println("Enter details account number,name,balance");
                    sc.nextLine(); // Consume the leftover newline after nextInt()
                    System.out.println("Enter account number: ");
                    accno = sc.nextLine();
                    System.out.println("Enter name: ");
                    name = sc.nextLine();
                    System.out.println("Enter balance: ");
                    balance = sc.nextDouble();

                    acc=new account(accno,name,balance);
                    hm.put(accno,acc);
                    System.out.println("Account created for: "+name);
                    break;
                
                case 2:  System.out.println("Enter account number");
                         sc.nextLine();
                         accno=sc.nextLine();
                         hm.remove(accno);
                         System.out.print("Deleted successfully");
                         break;
                         
               case 3:  System.out.println("Enter account number");
                        sc.nextLine();
                         accno=sc.nextLine();
                         hm.get(accno);
                         System.out.println(acc);
                         break;
                         
                case 4:  for(account a:hm.values())
                             System.out.println(a);
                        break;
                        
                case 5:
                case 6: oos.writeInt(hm.size());
                
                        for(account b:hm.values())
                        oos.writeObject(b); // writing the whole object
            }
        } 
        while(choice!=6);
            oos.flush();
            oos.close();
            fos.close();  
    }
    
}
