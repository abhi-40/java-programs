package list_demo;
import java.util.*;

public class List_demo 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a1 =new ArrayList<>(20);
        ArrayList<Integer> a2 = new ArrayList<>(List.of(20,30,40,50,20,60));
        
        a1.add(10);
        
        a1.add(0, 100);
        a1.addAll(2,a2);
        
        System.out.println(a1.contains(20));
        System.out.println("20 is at index: "+a1.indexOf(20));
        System.out.println("last 20 is at index: "+a1.lastIndexOf(20));
        System.out.println("the value at index 0 is : "+a1.get(0));
        System.out.println("size of list: "+a1.size());
        System.out.println("is list empty?: "+a1.isEmpty());
        //System.out.println("removed"+a1.remove(0));
        //a1.removeAll(a2);  
        //a1.removeLast();
        //a1.retainAll(a2);
        a1.set(0, 1);// it replaces the value at specific index
        //System.out.print(a1);
        //System.out.println(" ");
        
        //methods for accesing arraylist
        /**
        for(int i=0;i<a1.size();i++)
        {
            System.out.print(a1.get(i)+",");
        }
        System.out.println(" ");
        
        for(int x:a1)
        {
            System.out.print(x+",");
        }**/
        
        for(Iterator<Integer> it=a1.iterator();it.hasNext();)
        {
            System.out.print(it.next()+",");
        }
        System.out.println("  ");
        
        
        a1.forEach(n-> System.out.print(n+","));
        
         System.out.println("\n last method: ");
        
        
        a1.forEach(System.out::println);
        
    }
    
}
