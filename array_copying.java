public class array_copying
{
    public static void main(String[] args)
    {
        //copying an array
       /*int a[]={8,6,10,9,2,15,7,13,14,11};
        int b[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(int x:b)
        {
            System.out.print(x+",");
        }*/
        // reverse copy of array
        int a[]={8,6,10,9,2,15,7,13,14,11};
        int b[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];

        }
        for(int j=a.length-1;j>=0;j--)
        {
            System.out.print(b[j]+",");
        }
    }
}
