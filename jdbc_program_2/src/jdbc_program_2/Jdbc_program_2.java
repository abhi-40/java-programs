package jdbc_program_2;
import java.sql.*;

public class Jdbc_program_2 {
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite://C://sqllite//univ.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select * from dept");
        
        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
        stm.close();
        con.close();
       
        
    }
    
}
