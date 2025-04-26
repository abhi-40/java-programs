package joda_date_time_api;
import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Joda_date_time_api 
{
    public static void main(String[] args)
    {
         LocalDate ld=LocalDate.now();
         System.out.println("now method: "+ld);
         
         LocalDate d=LocalDate.of(2020, Month.MARCH, 10); // set custom date 
         System.out.println("of method: "+d);
         
         LocalDate d1=d.minusMonths(1);// minus 1 month from d's month but we have to store it in another refernce
         System.out.println("minus month method: "+d1);
        
         LocalTime t=LocalTime.now();
         System.out.println("Time now method: "+t);
         LocalTime t1=t.minusHours(2);
         System.out.println("minusHours method: "+t1);
         
         LocalDateTime ldt=LocalDateTime.now();
         System.out.println("local date time now method: "+ldt);
         
    }
    
}
