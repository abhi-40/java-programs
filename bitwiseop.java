class bitwiseop
{
     public static void main(String[] args) 

       { int a=0b1010;//10
        int b=0b0110;//6
        int c;
        c=a&b;// and
        System.out.println(c+"H");

        int x=10,y=6,z;
        z=x|y;//or
        System.out.println(z);

        int m=10,v=6,j;
        j=m^v;// xor operation
        System.out.println(j);

        int d=10,f;
        f=d<<1;//leftshift
        System.out.println(f);

        f=d>>1;//rightshift
        System.out.println(f);

        int l=-0b1010,o;
        o=l>>>1;// signed right shift
        System.out.println(o);

        int r=10;
        System.out.println(~r);//not operation

       }
    }

