public class recursion 
{
     static void fun (int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fun(n-1);//recursion
        }
    }
    public static void main(String[] args) 
    {
        fun(3);
    }
}