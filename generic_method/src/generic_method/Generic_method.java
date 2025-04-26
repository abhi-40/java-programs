package generic_method;
public class Generic_method 
{
    static <T> void show(T[] list)
    {
        for(T x:list)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        show(new String[]{"hi","go","bye"});
        show(new Integer[]{30,3,3,2});   
    }  
}
