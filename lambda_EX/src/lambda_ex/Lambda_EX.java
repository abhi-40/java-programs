
package lambda_ex;

@FunctionalInterface
interface lambda
{
    public void display();
}


public class Lambda_EX
{

    public static void main(String[] args)
    {
            lambda l=()->
            {
                System.out.print("hellO");
            };
            l.display();
    }
}
