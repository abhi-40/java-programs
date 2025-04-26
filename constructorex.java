class abhi{
    int id;
    int age;
    abhi(int id,int age){// constructor made
        this.id=id;
        this.age=age;
        System.out.println("Hello");
        System.out.println("age : "+ age + "id :" + id);// can print the vriables like this
    }
}
class constructorex{
    public static void main(String[] args) {
        abhi obj=new abhi(56,19);// not calling methods by(.)
       // int id=87;    THIS  CANNOT BE DONE IT WILL THROW ERROR FOR ALL 3 LINES
       // int age=89;
        //System.out.println(id);
    }
}
