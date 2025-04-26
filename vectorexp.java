import java.util.Vector;
class vectorexp {
    public static void main(String[] args) {
        Vector a=new Vector(2);//you can give size but it will expand itself when an element is added
        a.addElement("Hey");
        a.addElement("how");// used for adding elements or objects
        a.addElement("are");
        a.insertElementAt("You?",0);// adds the element at specified index
        System.out.println("list are"+a);
        a.lastElement();
        System.out.println("last element" +a.lastElement());// to retrieve the last element added
       System.out.println("the value of specifed inde is "+a.elementAt(0));// returns the value of specified index
       System.out.println(a.contains("are"));// returns bool value true if the specified object is there else false
       int capacity=a.size();// declaring capacity for size fun
       a.setSize(9);// explicitly define the vector size
       System.out.println(a.size());// returns the size of vectorl
        }
}
