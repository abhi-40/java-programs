
/**
 *
 * @author abhiy
 * @version 2.0
 * @since 2015
 */
package javadoc_ex;
/**
 * @author abhiy
 * Class for library books
 * 
 */
public class book
{
    /**
     * @value 10  default value is 10
     */
    static int val=10;
    
    /**
     * Parameterized Constructor
     * @param s Book name
     */
    public book(String s)
    { 
    }
    /**
     * issue a book to a student
     * @param roll roll no of the student
     * @throws Exception if book not available throws exception
     */
    public void issue(int roll) throws Exception{
    }
    /**
     * check if book is available
     * @param str book name
     * @return if book available returns true else false
     */
    
    public boolean available(String str){return true;}
    /**
     * get the book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){return "";}
}
