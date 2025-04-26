import java.util.Scanner;
class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No To convert");
        int x=sc.nextInt();
        System.out.println(Integer.toBinaryString(x));
        //System.out.println(Integer.toHexString(x));
        //System.out.println(Integer.toOctalString(x));
        }
    
}
