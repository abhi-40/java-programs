public class leftRotate_array 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5};
        int temp=a[0];
        for(int x:a)
        {
          System.out.print(x+",");
         
        }
        System.out.println(" ");
        for(int i=1;i<=a.length-1;i++)
        {
           a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+",");
        }
    }
}