package local_inner_class;

class outer
{
    void display()
    {
        class inner
        {
            void show()
            {
                System.out.println("Hello");
            }
        }
    new inner().show();//anonymous obj created & show() is called
    inner i=new inner();
    i.show();
    
    }
}
public class Local_Inner_Class {

    public static void main(String[] args) 
    {
       outer o=new outer();
       o.display();
    }
    
}
