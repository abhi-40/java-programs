package array_deque;
import java.util.ArrayDeque;
public class Array_deque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        
        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);
        ad.offerLast(40);
        ad.offerLast(50);
        ad.offerLast(50);
        
        ad.offerFirst(1);
        ad.offerFirst(2);
        ad.offerFirst(3);
        ad.offerFirst(4);
        
        ad.forEach(x->System.out.println(x));

        
    }
    
}
