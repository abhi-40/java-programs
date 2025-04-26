package sc2_serialisation;
import java.io.*;
import java.util.Scanner;
class customer implements Serializable
{
    String cust_Id;
    String name;
    String p_no;
    
    static int count =1;
    public customer(){}
    public customer(String name,String p_no)
    {
        cust_Id="C"+count;
        count++;
        this.name=name;
        this.p_no=p_no;
    }
    public String toString()
    {
        return "\nCustomer Id: "+cust_Id+
                "\nName: "+name+
                "\nPhone Number: "+p_no+"\n";
    }
            
}
public class Sc2_serialisation {

   /* public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("Sc2_serialisation_test.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        customer list []={new customer("Abhishek","9876543219"),new customer("Aaman","9875674219")};
        
        oos.writeInt(list.length);
        for(customer c:list)
        {
            oos.writeObject(c);
        }
        oos.close();
        fos.close();
        */
      
    public static void main(String[] args) throws Exception
    {
        // reading
        Scanner sc=new Scanner(System.in);
        FileInputStream fis=new FileInputStream("Sc2_serialisation_test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
       
        int length=ois.readInt();
        customer list[]=new customer[length];
        for(int i=0;i<length;i++)
        {
            list[i]=(customer)ois.readObject();
        }
        System.out.println("Enter the name of the Customer: ");
        String name=sc.nextLine();
        for(int i=0;i<length;i++)
        {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }
        ois.close();
        fis.close();
    }
}
