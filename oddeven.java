import java.util.*;
public class oddeven{
    public static void main(String[]args){
        System.out.println("Enter A Number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}