import java.util.Scanner;
public class quantifiers_Regular_Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Gmail : ");
        String gmail=sc.nextLine();
        System.out.println(gmail.matches("\\w*@gmail(.*)"+("com")));
    }
}
