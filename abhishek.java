public class abhishek {
    public static void main(String[] args ){
        int a=args.length;
        int i,sum=0;
        for(i=0; i<a; i=i+1){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("add"+sum);
            
        }
    }