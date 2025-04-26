import java.util.Scanner;
class Grandfather{
    public void printName(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter name ");
        String name=sc.next();
        System.out.println(name);
    }
}
class Father extends Grandfather{
    int age;
}
class Abhi extends Father{
    char nameFirstchar;
}

class multilevel{
    public static void main(String[] args) {
        Abhi obj=new Abhi();
        obj.age=47;
        obj.nameFirstchar='A';
        obj.printName();
        System.out.println(obj.age);
    }
}