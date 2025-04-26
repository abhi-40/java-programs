public class array
{
    public static void main(String[] args)
    {
        int c=0;
        int a[]=new int[5];
        a[0]=15;
        System.out.println(a[0]);
        System.out.println(a.length);

        int b[]={34,56,77,8,32,37};
        System.out.println(b[4]);
        System.out.println(b.length);
       // for(int i=0;i<=b.length;i++)
        //{
         //   System.out.print(b[i]+",");
        //}
        
        for(c=b.length-1;c>=0;c--)//reverse of array
        {
            System.out.print("Reverse: "+b[c]+",");
        }

       // for(int x:b)//for each loop
        //{
          //  System.out.print(x+",");
        //}

        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]++);
            System.out.print(" ");
        }
        for(int x:b)//for each loop
        {
           System.out.print(x+",");
    }}
}
