
package anonymous_inner_class;
abstract class my
{
    abstract  void show();
}
class test
{
    void display()
    {
        my m=new my()
        {
            @Override
            void show()
            {
                System.out.println("Hello");
            }
        };
            m.show();
        }
    }
public class Anonymous_Inner_Class {

    public static void main(String[] args) {
        test t=new test();
        t.display();
    }
    
}
