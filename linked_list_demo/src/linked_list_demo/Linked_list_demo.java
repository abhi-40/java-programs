package linked_list_demo;
import java.util.*;
public class Linked_list_demo
{
    
    public static void main(String[] args)
    {
        LinkedList<Integer> l1=new LinkedList(List.of(20,30,40,50,60,60));
        l1.addFirst(10);
        l1.addLast(70);
        System.out.println("first: "+l1.getFirst());
        System.out.println("last: "+l1.getLast());
        System.out.println("Peek: "+l1.peek());
        System.out.println("Peek first: "+l1.peekFirst());
        System.out.println("rem0ve first: "+l1.removeFirst());
        System.out.println("remove last: "+l1.removeLast());
        System.out.println("poll: "+l1.poll());
        System.out.println("pop: "+l1.pop());
       
        l1.forEach(n->System.out.print(n+","));
       // l1.forEach(System.out::println);    
    }
    
}
