
package user_defined_exception;

class lessAmtException extends Exception
{
    @Override
    public String toString()// this is overrided method of exception class
    {
        return "balance should not be less than 5000";
    }
}
public class User_Defined_exception {
    public static void fun1()
    {
        try
        {
            throw new lessAmtException();// object created
        }
        catch(lessAmtException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) 
    {
        fun1();
    }
    
}
