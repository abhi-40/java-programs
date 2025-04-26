import java.util.Scanner;
class ATM{
    float balance;
    int pin=5674;

        ATM(){
        System.out.println("Enter Your Pin: ");
        Scanner sc=new Scanner (System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter Valid Pin: ");
        }

    }
    public void menu(){
        System.out.println("Enter Your Choice ");
        System.out.println("1. Check AC Balance: ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT ");
        Scanner sc=new Scanner (System.in);
        int option=sc.nextInt();
        if(option==1){
            checkBalance();
        }else if(option==2){
            withDrawMoney();
        }else if(option==3){
            depositMoney();
        }else if(option==4){
          return;
        }else{
            System.out.println("Enter A Valid Choice ");
        }

    }
    public void checkBalance(){
        System.out.println("Balance: "+balance);
        menu();
    }
    public void withDrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float money=sc.nextFloat();
       
        if(money>balance){
            System.out.println("Insufficient Money ");
        }else{
            balance=balance-money;
            System.out.println("Money Withdrawn Successfully ");
            menu();
        }
    } 
    public void depositMoney(){
        System.out.println("Enter The Amount ");
        Scanner sc=new Scanner(System.in);
        float money=sc.nextFloat();
        balance=balance+money;
        System.out.println("Money Deposited ");
        menu();

    }
}
class atmmachine{
    public static void main(String[] args){
        ATM obj=new ATM();
        
    }
}