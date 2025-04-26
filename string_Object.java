public class string_Object {
    public static void main(String[] args) {
        String str1="Java Program";
        String str2=new String("JAVA");
        System.out.println(str2);

        char c[]={'H','E','L','L','O'};
        String str3 = new String(c,1,3);
        System.out.println(str3);

        byte d[]={65,66,67,68};
        String str4=new String(d,1,2);// 2=start,2=end
        System.out.println(str4);
    }
}
