public class sc2_array
{
    public static void main(String[] args)
    {
        //max elemnt in array
        int a[]={4,5,98,62,99,24};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
        }
        System.out.print(max);
        
    }
}
