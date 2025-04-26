import java.util.Scanner;
public class GCD_Method 
{
    int GCD(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            {
                m=m;
                n=n-m;
            }
        }
        return m;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=sc.nextInt();
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        GCD_Method obj=new GCD_Method();
        System.out.println(obj.GCD(m,n));

    }
}
