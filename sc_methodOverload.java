public class sc_methodOverload 
{
    static int rev(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;    
            n=n/10;
        }
        return rev;
    }
    static int[] rev(int a[])
    {
        
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+",");
        }
        return a;
    }
    public static void main(String[] args) 
    {
        System.out.println(rev(255));
        System.out.print(rev(new int[]{1,2,3}));
    }
}
