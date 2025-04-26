package arrays.comparators;
import java.util.*;
public class ArraysComparators
{
    public static void main(String[] args)
    {
        int a[]={1,9,8,2,2,3,4,5};
        int b[]={1,2,3,4,5,6};
        
        System.out.print("Compare: "+Arrays.compare(a, b)); // will compare elements of 2 arrays if the 1st is big ill return -1 else 1 and if equal tham 0
        System.out.println("\ncopyOf: ");
        
        int c[];
        c=Arrays.copyOf(a, 4); // it will copy the elements of array to the defined array
        for(int x:c)
        {
            System.out.print(x);
        }
        System.out.println("\nsort: ");
        
        Arrays.sort(c);// it will sort the elements note: before using binary search we have to perform sort
        for(int d:c)
        {
            System.out.print(d);
        }
         System.out.println();
         
        System.out.print("Binary search : "+Arrays.binarySearch(c, 9));// it will return the index of the given element
         System.out.println("");
        
        Arrays.fill(c, 0);// it will fill all the elemnts of array with the given elemnt...useful for array initialization
        for(int t:c)
        {
            System.out.print(t);
        }
        
        
    }
    
}
