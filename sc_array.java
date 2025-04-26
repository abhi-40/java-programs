import java.util.Scanner;
public class sc_array
{
    public static void main(String[] args)
    {
        // sum of all elements
        int a[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element for Searching: ");
        int b=sc.nextInt();
        int sum=0;
        {
         //for(int x=0;x<a.length;x++)
           // {
             //  sum=sum+a[x];
            //}
            //System.out.println("sum of all elements : "+sum);

            //searching an element in array
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==b)
                {
                    System.out.print("The element "+b+ " is on index : "+i);
                    System.exit(0);
                }
            }
            System.out.print("element: "+b+" not found");
        }
        
    }
}

