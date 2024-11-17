
package percobaankalender;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author acer
 */
public class PercobaanKalender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Day,Month,Year;
        int Second,Minute,Hour;
        
    //GregorianCalendar calendar = new GregorianCalendar();
    GregorianCalendar calendar = new GregorianCalendar(2024, Calendar.SEPTEMBER, 8);
    Year = calendar.get(Calendar.YEAR);
    Month = calendar.get(Calendar.MONTH); // Note: zero-based month
    Day = calendar.get(Calendar.DAY_OF_MONTH);
    Hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour clock
    Minute = calendar.get(Calendar.MINUTE);
    Second = calendar.get(Calendar.SECOND);
    
        System.out.println("Tanggal sekarang :" + Day +" "+ Month +" "+ Year);
        
        
     calendar.set(Calendar.YEAR, 2025);
     calendar.set(Calendar.MONTH, Calendar.OCTOBER);
     calendar.set(Calendar.DAY_OF_MONTH, 10);
     
     System.out.println("Tanggal sekarang :" + Day +" "+ Month +" "+ Year);
     
     
     if(Day == Month)
     {
         System.out.println("BERHASIL");
     }
    }
    
}
