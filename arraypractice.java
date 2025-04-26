    import java.util.Arrays;
    public class arraypractice {
    public static void main(String[] args) {
       int [] name=new int[4];
       name[0]=49;
       name[1]=43;
       name[2]=450;
       name[3]=47;
       System.out.println(name.length);//array property

       System.out.println(name[3]);//before sorting

       Arrays.sort(name);//for sorting array its an array property
       
       System.out.println(name[3]);//after sorting
       
    }
}

