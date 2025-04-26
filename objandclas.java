class pen{
    String color;
    String type;
    public static void write(){
        System.out.println("write");
    }
    public void printg(){ // here static keyword is not used
        System.out.println(this.color);
       System.out.println(this.type);
    }
}
class objandclas{
public static void main(String[] args) {
    pen pen1=new pen();// object created
    pen1.color="Blue";// can assign values by using(.)
    pen1.type="Gel";
    pen1.write();
   // System.out.println(pen1.color+pen1.type);//alternative way for prining without this keyword
    pen pen2=new pen();
    pen2.color="Black";
    pen2.type="Ball";
    pen1.printg();
    pen2.printg();
}
}