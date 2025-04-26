import java.util.Scanner;
class ScLoop
{
   public static void main(String[] args)
   {
        int r=0,rev=0;
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No: ");
        int n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
            str=str+r;//converting r to String
        }
            for(int i=str.length()-1;i>=0;i--)
        {
            char c=str.charAt(i);
            switch(c)
            {
                case '0':System.out.println("zero ");
                break;
                case '1':System.out.println("one");
                break;
                case '2':System.out.println("two ");
                break;
                case '3':System.out.println("three ");
                break;
                case '4':System.out.println("four ");
                break;
                case '5':System.out.println("five ");
                break;
                case '6':System.out.println("six ");
                break;
                case '7':System.out.println("seven ");
                break;
                case '8':System.out.println("eight");
                break;
                case'9':System.out.println("nine ");
                break;
                default:System.out.println("invalid");
                break;
            }
        }
    }
}