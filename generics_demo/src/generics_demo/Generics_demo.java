package generics_demo;
public class Generics_demo<T> {
   T data[]=(T[]) new String[3]; 
    public static void main(String[] args) 
    {
        Generics_demo<String> gd=new Generics_demo();
        System.out.print(gd.data[0]="fg");
        gd.data[1]="fg";
        gd.data[2]="fg";
        
        String str=gd.data[1];
    }
}
 