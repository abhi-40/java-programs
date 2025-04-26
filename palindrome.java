import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
    {
        String r=0;
        String sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        String n=sc.nextLine();
        String m=n;
        for(int i=1;i<=n;)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(sum==m)
        {
            System.out.println("y");
        }
        else
        {
            System.out.println("n");
        }
    }
}