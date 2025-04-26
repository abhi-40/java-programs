import java.util.*;
public class sumofnnaturalno {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int sum=0;
        int n=sc.nextInt();
        for(int i=0; i<=n; i=i+1){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}