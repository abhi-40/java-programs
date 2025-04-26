import java.util.Scanner;
public class sumOfNno 
{
    public static void main(String[] args) 
    {
       int i;
       int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter no : ");
       int n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
            sum=sum+i;
            System.out.println("Sum of "+i+"is: "+sum);
       }
       
    }
}

