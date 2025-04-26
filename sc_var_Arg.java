public class sc_var_Arg 
{
    /*static int max(int ... a)   
    {// find max
        if(a.length==0) return Integer.MIN_VALUE;
        int m=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>=m)
            m=a[i];
        }
        return m;
        
    }
    public static void main(String... ars) 
    {
        System.out.println(max(10,2));
        System.out.println(max());
        System.out.println(max(70,45,90));
        System.out.println(max(223,4,57,975,53));
        System.out.println(max(10));
    }*/

    static int sum(int ... a)
    {// sum of all elements
        int sum=0;
        if (a.length==0)
        return Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;

    }
    public static void main(String[] args) 
    {
        System.out.println(sum(1,2,3));
        System.out.println(sum());
        System.out.println(sum(10,10,10,10,10));
        System.out.println(sum(5));
    }
}
