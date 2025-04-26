package pkgthrow.throws_exception;
 class NegativeDimensionException extends Exception
 {
     @Override
     public String toString()
     {
         return "numbers can't be negative";
     }
 }
public class ThrowThrows_exception
{
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0) throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println(area(10,-5));
        
    }
    static void meth2() throws NegativeDimensionException
    {
        meth1();
    }
    public static void main(String[] args) throws NegativeDimensionException
    {
     try
     {
         meth2();
     }
     catch(NegativeDimensionException e)
     {
         System.out.println(e);
     }
    }
    
}
