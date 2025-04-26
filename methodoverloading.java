class methodoverloading{  // Method or Function Overloading
    public static int sum(int a,int b)
    {
            return a+b;
    }
    public static int sum(int a,int b, int c) // rules for 1.overloading same name of function
    {                                          // 2.Diff no of arguments
        return a*b*c;                          //2.Same no of arguments but different datatypes
    }
    public static String sum(String A,String B)
    {
        return A+B;
    }
        public static void main(String[] args) {
            System.out.println(sum(5,5));
            System.out.println(sum(5,5,5));
            System.out.println(sum("Abhi","Yadav"));
            }
    
    }
    