class Bank{
    public void rateOfInterest(){
        System.out.println("General Interest is 8%");
    }
}
class SBI extends Bank{
    @Override public void rateOfInterest(){
        System.out.println("Interest for SBI Is 8.9%");
    }
}
class PNB extends Bank{
    public void rateOfInterest(){
        System.out.println("Interest for PNB is 9%");
    }
}
class overrideex{
    public static void main(String[] args) {
        Bank obj1=new Bank();
        Bank obj2=new SBI();// can be also called in this way
        PNB obj3=new PNB();
        obj1.rateOfInterest();
        obj2.rateOfInterest();
    }
}
















