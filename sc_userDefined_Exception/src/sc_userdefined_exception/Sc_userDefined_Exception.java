
package sc_userdefined_exception;

class stackOverflowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack overflowed new data can't be inserted";
    }
}
class stackUnderflowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack underflowed no data to perform delete operation";
    }
}
class stack 
{
   private int size;
   private int top=-1;
   private int S[];
   
   public stack(int sz)
   {
       size=sz;
       S=new int[sz];
   }
    public void push(int x) throws stackOverflowException
    {
        if(top==size-1)
        {
            throw new stackOverflowException();
        }
        top++;
        S[top]=x;
    }
    public int pop() throws stackUnderflowException
    {
         int x=-1;
        if(top==-1)
        {
            throw new stackUnderflowException();
        }
        x=S[top];
        top--;
        return x;
    }
}
public class Sc_userDefined_Exception {

    public static void main(String[] args) 
    {
        stack st=new stack(5);
        try
        {
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        }
        catch(stackOverflowException s){
        System.out.println(s);
        }
        
        try{
            st.pop();
           }
        catch(stackUnderflowException e)
        {
            System.out.println(e);
        }
    }
}

