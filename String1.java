class String1{
    public static void main(String[] args) {
        String name="ABHISHEK";
        String name1=new String("Aman");

        System.out.println(name.length());
        

        String name2=name+ " and " +name1;
        System.out.println(name2);

        System.out.println(name.charAt(4));

        System.out.println(name.replace('A','s'));
    }
}