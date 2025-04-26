package date_time_formatter;
import java.time.format.*;
//import java.time.LocalDateTime;
import java.time.ZonedDateTime;
public class Date_time_formatter
{
    public static void main(String[] args)
    {
        ZonedDateTime lt=ZonedDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss  z Z");
        System.out.println(df.format(lt));
    }
    
}
