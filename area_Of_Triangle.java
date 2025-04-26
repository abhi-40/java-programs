import java.util.Scanner;
class area_Of_Triangle
{
    public static void main(String[]args) 
       /* {
            // formula=area=1/2*base*height
          System.out.print("enter base of triangle: "); 
           Scanner sc=new Scanner(System.in);
           float base=sc.nextFloat();
           System.out.print("Enter Height of triangle: ");
           float height=sc.nextFloat();
          // float area =0.5f*base*height;
           float area =1f/2f*base*height;
           System.out.println("Area of triangle is: "+area);
        }*/
    {
        // area of triangle using 3 sides
        // formula=s=1/2(a+b+c) area=s(s-a)(s-b)(s-c)^ (whole square)
        System.out.println("Enter A");
        Scanner sc=new Scanner (System.in);
        float a=sc.nextFloat();
        System.out.println("Enter b");
        float b=sc.nextFloat();
        System.out.println("enter c");
        float c=sc.nextFloat();
        float s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
