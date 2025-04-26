class swapping
{
    public static void main(String[] args) {
        {
            //int a=0b1001;//9
            //int b=0b1100;//12
            int a=10;
            int b=20;
            
            a=a^b;
            
            b=a^b;
            
            a=a^b;
           
            System.out.println("a= "+a+" "+"b= "+b);


        }
    }
}