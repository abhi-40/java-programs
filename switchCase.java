import java.util.Scanner;
public class switchCase
{
    public static void main(String [] args)
    {
        System.out.print("Enter: ");
        Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();

        String ext=url.substring(url.lastIndexOf(".")+1);
        switch(ext)
        {
            case "com": System.out.println("commercial" + ext);
            break;
            case "gov": System.out.println("Government");
            break;
            case "net":System.out.println("Network");
            break;
            default:System.out.println("Invalid");
            break;
        }
    }
}