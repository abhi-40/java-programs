
package param_in_lambda_ex;
    
    @FunctionalInterface
    interface lambda
    {
        public int add(int x,int y);
    }
public class Param_in_lambda_Ex 
{

    public static void main(String[] args)
    {
        lambda l=(a,b)->
        {
            return a+b;
        };
        System.out.print(l.add(9, 8));
    }
    
}
