import java.util.*;
public class elif{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF A:");
        
        int a=sc.nextInt();

        System.out.println("ENTER THE NUMBER OF B:");

        int b=sc.nextInt();

        if(a==b){
            System.out.println("EQUAL");
    }
        else if(a>b){
            System.out.println("A IS GREATER");
        }
        else{
            System.out.println("A IS LESSER");

        }
    }  
    
}