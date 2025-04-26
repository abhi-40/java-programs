/*class Animal{        Example of super to invoke parent class variable
    String color="White";
}
class Dog extends Animal{
    String color="Black";
    public void color(){
        System.out.println(color);
        System.out.println(super.color);// it will call parent class color coz of super
    }
}
class super{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.color();
    }
} 

class Animal{                         //ex of super to invoke method 
    public void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    public void eat(){

        super.eat();// declaring eat as a super method
    }
    public void bark(){
        System.out.println("bark");
    }
}
class super{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
    }
}*/
class Animal{
    Animal(){
        System.out.println("Animal constructor created");
    }
class Dog extends Animal{
        Dog(){
            super();
            System.out.println("dog is created");
        }
    }
class super{
    public static void main(String[] args) {
        Dog obj=new Dog();
    }
}
}