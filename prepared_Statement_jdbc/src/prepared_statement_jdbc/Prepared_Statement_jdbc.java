package prepared_statement_jdbc;
import java.sql.*;
import java.util.Scanner;
public class Prepared_Statement_jdbc {
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite://C://sqllite//univ.db");
        PreparedStatement stm=con.prepareStatement("select * from students where deptno=?");
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dptno: ");
        int a=sc.nextInt();
        stm.setInt(1, a);
        
        ResultSet rs=stm.executeQuery();
        
        while(rs.next())
        {
            System.out.println("deptno");
            System.out.println(rs.getString("d  name"));
        }
         stm.close();
         con.close();
    }
    
}
