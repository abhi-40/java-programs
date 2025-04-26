import java.util.Scanner;
public class elseif
{
    public static void main(String[] args) 
    {
        System.out.print("Enter url: ");
        Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();

        if(url.startsWith("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(url.startsWith("https"))
        {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        else if(url.startsWith("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else if(url.startsWith("www"))
        {
            System.out.println("World Wide Web");
        }
        
        if(url.endsWith("com"))
        {
            System.out.print("commercial");
        }
        else if(url.endsWith("org"))
        {
            System.out.println("Organisation");
        }
        else if(url.endsWith("net"))
        {
            System.out.println("Network");
        }
    }
}
