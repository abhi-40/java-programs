package generic_class_demo;

@SuppressWarnings("unchecked")
class myArray<T extends Number>
{
    T A[]=(T[])new Object[10];
    int length=0;
    
    public void append(T v)
    {
        A[length]=v;
        length++;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
    
}
public class Generic_class_demo {

    public static void main(String[] args)
    {
        myArray <Integer> ma=new myArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.append(40);
        ma.append(89);
        ma.append(60);
        ma.display();
    }
    
}
