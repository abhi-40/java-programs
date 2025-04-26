package java_time_classes;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class Java_time_classes 
{
    public static void main(String[] args)
    {
        ZonedDateTime zdt=ZonedDateTime.now(); // it will give info about the offset i.e 5.30 hours of india ad also zoneid i.e Asia/Kolkata
        System.out.println("zoned date time class: "+zdt);
        
        OffsetDateTime osd=OffsetDateTime.now(); // it will only provide info about offset i.e 5.30 hours and not zoneID
        System.out.println("offset date time class: "+osd); 
        
        Period p=Period.of(2, 2, 10);
        System.out.println("add to: "+p.addTo(LocalDate.now()));
        
        Instant i=Instant.now();
        System.out.println("Instant : "+i);
        
        
    }
    
}
