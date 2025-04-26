public class var_arg_method
{
    
    static void show(int ... a)
    {
        for(int x:a)
        {
            System.out.print(x);
        }
    }
    public static void main(String... ar) //even this will work
    {
        show();
        show(1,2,3,4,5);
        System.out.println(" ");
        show(new int[]{1,2,3});
    }
}
