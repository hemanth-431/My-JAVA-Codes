
package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Datetime {

    public static void main(String[] args) {
        LocalTime myo=LocalTime.now();
         LocalDate m = LocalDate.now();
         LocalDateTime myOj = LocalDateTime.now();
         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      //   System.out.println(myOj.format(myFormatObj));
         ArrayList a=new ArrayList();
         a.add("hdjjf");
         a.get(0);
    }
    
}
