import java.util.Scanner;
class Relational
{
		public static void main(String[] args)
	{
			int a;
			float b;
			Double c;
			System.out.print("Enter Any Two Numbers...");
			Scanner obj=new Scanner(System.in);
			a=obj.nextInt();
			b=obj.nextFloat();
			c=obj.nextDouble();
		
			System.out.println(a<b & b>c);
			System.out.println("a<b"+(a<b));
			System.out.println("a==b"+(a==b));
			System.out.println("a!=b"+(a!=b));
			System.out.println("a<=b"+(a<=b));
			System.out.println("a>=b"+(a>=b));
	}
}
		