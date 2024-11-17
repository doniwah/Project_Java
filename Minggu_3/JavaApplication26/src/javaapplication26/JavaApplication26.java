/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author acer
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Day,Month,Year;
        int Second,Minute,Hour;
        
    GregorianCalendar calendar = new GregorianCalendar();
    Year = calendar.get(Calendar.YEAR);
    Month = calendar.get(Calendar.MONTH); // Note: zero-based month
    Day = calendar.get(Calendar.DAY_OF_MONTH);
    Hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour clock
    Minute = calendar.get(Calendar.MINUTE);
    Second = calendar.get(Calendar.SECOND);
    
        System.out.println("Tanggal sekarang :" + Day + Month + Year);
        
    }
    
}
