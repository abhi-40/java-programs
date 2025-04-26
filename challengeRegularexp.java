import java.util.Scanner;
public class challengeRegularexp {
    public static void main(String[] args) {
        //no is binary or not
        int a=1010110;
        String str=String.valueOf(a);
        System.out.println(str.matches("[01]+"));

        //no is hexa or not
        System.out.print("Enter no: ");
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        System.out.println(b.matches("[0-9A-F]+"));

        // find if date is in this format : dd/mm/yyyy
        String Date="01/12/2000";
        System.out.println(Date.matches("[0-3][0-9]/[0-1[0-9][0-9]{4}"));
    }
}
