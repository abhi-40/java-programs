import java.util.Scanner;
public class primeNoUsingMethod 
{
    static boolean prime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
               return false;
            }
        }  
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No To Find: ");
        int n=sc.nextInt();
        if(prime(n))
        {
            System.out.print(n+" Prime");
        }
        else
        {
            System.out.print(n+" Not prime");
        }
    }
}
