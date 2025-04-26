public class method
{
    int max(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else return y;
    }
    public static void main(String[] args)
    {
        int a=15,b=10;
        method obj=new method();
        System.out.print(obj.max(a,b));
    }
}
