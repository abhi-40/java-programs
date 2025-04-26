package static_practice;
class hondacity
{
    int a,b;
    static long price=10;
    
    static double onroad(String name)
    {
        switch(name)
        {
            case "mumbai":return price+price*43;
            
             case "delhi":return price+price*4;
             
            default:return 0.00;
        }
    }
}
public class Static_Practice {

    public static void main(String[] args)
    {
        
        hondacity t=new hondacity();
        hondacity t1=new hondacity();
        
        t1.price=90;
        System.out.println(t.price);
        System.out.print(t1.price);
    }
    
}
