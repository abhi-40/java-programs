
package try_catch_exception;
import java.util.Scanner;
public class Try_catch_Exception {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        a=sc.nextInt();
        System.out.print("Enter 2nd no: ");
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("Result is: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cant divide by 0 "+e);
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println("Operation completed");
        
    }
    
}
