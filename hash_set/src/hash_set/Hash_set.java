package hash_set;
import java.util.*;
public class Hash_set 
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>(20,0.25f);// capacity & Loading factor
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(30);// duplicates not allowed
        hs.add(40);
        
        hs.forEach((z)->System.out.println(z));
        System.out.print(hs.contains(45));
    }
    
}
