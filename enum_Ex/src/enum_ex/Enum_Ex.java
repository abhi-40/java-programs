
package enum_ex;

enum dept
{
    CS("john"),IT("AMAN"),CIVIL("YASH"),ECE("SUNNY");
    private dept(String head)// constructor can be made of enum but it should be only private or default
    {
        System.out.println(this.name()+" "+head);   
    }
    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }
}
public class Enum_Ex {

    public static void main(String[] args) 
    {
        dept d=dept.ECE;
        d.display();
        /*System.out.println(d);
        System.out.println(d.name());// will return name that is ECE
        System.out.println(d.ordinal());// will return the index of constant
        System.out.println(dept.valueOf("IT"));
         
        dept list[]=dept.values();
        for(dept x:list)
        {
             System.out.println(x);
        }*/
    }
    
}
