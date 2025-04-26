class A{
    public void print(){
        System.out.println("A class");
    }
}
class B extends A{
    public void printB(){
        System.out.println("B class");
    }
}
class C extends A{
    C(){
        System.out.println("C class");
    
    }     
    }

class hierarchical{
    public static void main(String[] args) {
        C obj=new C();
        B obj1=new B();
        obj1.printB();
    }
}