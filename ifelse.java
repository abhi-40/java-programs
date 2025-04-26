import java.util.*;

public class ifelse {
  public static void main(String args[]){
    System.out.println("ENTER AGE:");
    Scanner sc =new Scanner(System.in);
    int age=sc.nextInt();

    if(age>18){
      System.out.println("ADULT");
  }
    else {
      System.out.println("NOT ADULT");
  }
  }
}