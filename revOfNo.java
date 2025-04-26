import java.util.Scanner;
class revOfNo 
{
public static void main(String[] args) 
{
    int r=0;
    int rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no: ");
    int n=sc.nextInt();     
    while(n>0)
    {
        r=n%10;
        n=n/10;
        rev=rev*10+r;
    }
    System.out.print(rev);
  }
}
