
package checked_unchecked_exception;

public class Checked_Unchecked_exception {

    public static void fun1()
    {
        try{
        System.out.print(10/0);
      
        }
        catch(Exception e)
        {
            System.out.println(e);// tostring() is called
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void fun2()
    {
        fun1();
    }
    public static void fun3()
    {
        fun2();
    }
    public static void main(String[] args) 
    {
        fun3();
    }
    
}
