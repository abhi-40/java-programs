interface A{
    public void show();
}
interface B{
    public void show();
}
class C implements A,B{
    public void show(){
        System.out.println("Method of c");
    }
}
class multipleinheritance{
public static void main(String[] args) {
    C obj=new C();
    obj.show();
}
}
