class regularExpression
{
    public static void main(String[] args) {
        String str1="a";
        System.out.println("1"+str1.matches("."));

        String str2="a";
        System.out.println("2"+str2.matches("[abc]"));
        
        String str3="p";
        System.out.println("3"+str3.matches("[^abc]"));

        String str4="7";
        System.out.println("4"+str4.matches("[a-z 0-9]"));

        String str5="A";
        System.out.println("5"+str5.matches("[A-Z 0-9]"));

        String str6="A8";
        System.out.println("6"+str6.matches("[a-z A-Z][0-9]"));

        String str7="A";
        System.out.println("7"+str7.matches("A|N"));

        String str8="abcd";
        System.out.println("8"+str8.matches("abc"));

        String str9="p";
        System.out.println("9"+str9.matches("\\w"));//works for alphabet and no too

        String str9a="&";
        System.out.println("9a"+str9a.matches("\\W") );

        String str10="1";
        System.out.println("10"+str10.matches("\\d"));

        String str10a="a";
        System.out.println("10a"+str10a.matches("\\D"));

        // S for not a space N s for space;
    }
}