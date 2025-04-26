interface car{
    public void start();
}
class electricCar implements car{
    public void start(){
        System.out.println("electric car starts ");
    }
}
class dieselCar implements car{
    public void start(){
        System.out.println("Diesel car starts ");
    }
}
class interfaceex{
    public static void main(String[] args) {
        car vehicle=new electricCar();
        car teslr=new dieselCar();
        vehicle.start();
        teslr.start();
        
    }
}