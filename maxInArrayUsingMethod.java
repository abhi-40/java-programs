public class maxInArrayUsingMethod 
{
    public static void main(String[] args)
    {
        int a[]={1,2,5,8,0,4};
        System.out.print(max());
    }
    static void max(int a[],int max)
    {
        max=a[0];
        for(int i=0;i<a.length-;i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}