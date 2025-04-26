import java.util.Scanner;
class miniproject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess My Number form 1 to 100");
        int myNumber=(int)(Math.random()*100);
        int usernumber=sc.nextInt();

        do{
            if(usernumber == myNumber){
                
                System.out.println("Wohoo...Correct Number");
                break;
            }
            else if(usernumber > myNumber){
                System.out.println("Your Number Is Bigger");
                break;
            }
            else {
                System.out.println("Your Number Is Small");
                break;
            }

        } while(usernumber >= 0);

        System.out.print("My number was : ");
        System.out.println(myNumber);
    }
    
}
