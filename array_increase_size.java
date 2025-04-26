public class array_increase_size
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5};
        int b[]=new int[2*a.length];
       
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
            
        }
        a=b;
        b=null;
         System.out.print(a.length);

        //will give error coz we made b[] null
        //System.out.print(b.length);
    }
}
