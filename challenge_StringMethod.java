public class challenge_StringMethod {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
        int i=str.indexOf("@");
        String userName=str.substring(0,i);
        System.out.println("Username is :"+userName);
        String domainName=str.substring(i+1,str.length());
        System.out.println("domain name is: "+domainName);
        int j=str.indexOf(".");
        String name=str.substring(i+1,j);
        System.out.println(name.equals("gmail"));
    }
}
