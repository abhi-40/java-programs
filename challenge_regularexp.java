public class challenge_regularexp {
    public static void main(String[] args) {
        String str="a!B@c#1$2%3";
        String str2=(str.replaceAll("[\\W]*",""));
        String str3=(str.replaceAll("[^A-Za-z0-9]*",""));// another way for the same
        System.out.println(str2);
        System.out.println(str3);

        String e="                  abc  de   fgh    ijk";
        System.out.println(e.replaceAll("[\\s+]","").trim());
    }
}
