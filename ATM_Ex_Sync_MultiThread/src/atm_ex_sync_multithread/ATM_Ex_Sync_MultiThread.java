
package atm_ex_sync_multithread;

class ATM
{
   synchronized public void checkBal(String name)
    {
       System.out.print("Mr"+name);
       try
       {
           Thread.sleep(1000);
       } 
       catch(Exception e){}
       
       System.out.println("Balance");
    }
   synchronized public void widthdraw(String name,int amt)
    {
        System.out.print("Mr"+name+"Widhtdrawing");
        try{
            Thread.sleep(1000);
        } 
        catch(Exception e){}
        
        System.out.println(amt);
    }
}
class customer extends Thread
{
    String name;
    int amt;
    ATM atm;
    public customer(String name,int amt,ATM atm)
    {
        this.name=name;
        this.amt=amt;
        this.atm=atm;
    }
    public void useATM()
    {
        atm.checkBal(name);
        atm.widthdraw(name,amt);
    }
    @Override
    public void run()
    {
        useATM();
    }
}
public class ATM_Ex_Sync_MultiThread
{
    public static void main(String[] args)
    {
        ATM a=new ATM();
        customer c=new customer("Abhishek",100,a);
        c.setPriority(10);
        customer f=new customer("aman",181,a);
        f.setPriority(Thread.NORM_PRIORITY);
        customer x=new customer("yash",101,a);
        c.start();
        f.start();
        x.start();
    }
    
}
