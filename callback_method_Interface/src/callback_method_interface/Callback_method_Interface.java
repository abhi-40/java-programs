
package callback_method_interface;

interface member
{
    void callback();
}
class store 
{
    member m[]=new member[100];
    int count=0;
    
    void register(member m)
    {
        this.m[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            m[i].callback();
        }
    }
}
class customer implements member
{
    String name;
    customer(String name)
    {
        this.name=name;
    }
    public void callback()
    {
        System.out.println("Okay ill visit: "+name);
    }
}
public class Callback_method_Interface {

   
    public static void main(String[] args) {
       store s=new store();
       customer c1=new customer("abhi");
       customer c2=new customer("aman");
       s.register(c1);
       s.register(c2);
       s.inviteSale();
    }
    
}
