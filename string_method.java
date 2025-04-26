class string_method 
{
    public static void main(String[] args)
        {
           String str=new String("netbeans");
           int len=str.length();
           System.out.println(len); 
           System.out.println(str.toLowerCase());
           System.out.println(str.toUpperCase());
           System.out.println(str.trim());
           str=str.substring(3,7);
           System.out.println(str);
           str=str.replace('e','M');
           System.out.println(str);
          

           String k="Mr.Shahrukh Khan";
           System.out.println(k.startsWith("Mr"));
           System.out.println(k.startsWith("Shah",3));
           System.out.println(k.endsWith("Khan"));
           System.out.println(k.charAt(4));
           System.out.println(k.indexOf('.'));
           System.out.println(k.lastIndexOf("a"));

           String j="java",s="java",p="JAVA";
           System.out.println( j.equals(s));
           System.out.println(s.equalsIgnoreCase(p));     
           
           System.out.println(j.compareTo(s));
           System.out.println(j.contains("va"));

        }
    
}