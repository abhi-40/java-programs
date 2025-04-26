import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        int r=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=sc.nextInt();
        int m=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==m)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("not a armstrong");
        }
    }
}

