import java.util.Scanner;
    class cuboid
{
         public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Length:");
            float length=sc.nextFloat();
            System.out.print("Enter Bredth: ");
            float bredth=sc.nextFloat();
            System.out.print("Enter Heigth: ");
            float heigth=sc.nextFloat();
            float volume=length*bredth*heigth;
            System.out.println("volume: "+volume);
            float total_Area=2*(length*heigth+bredth*heigth+length*bredth);
            System.out.println("area: "+total_Area);
        }
    }
}