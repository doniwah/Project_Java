/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasketiga;
import java.text.DecimalFormat;

/**
 *
 * @author acer
 */
public class TugasKeduaPartDua {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        int kwh, TotalTagihan;
        
        kwh = 13;
        
        if(kwh <= 100)
        {
            TotalTagihan = kwh * 1500;
            System.out.println("Total tagihan adalah Rp"+df.format(TotalTagihan));
        } else if(kwh >= 101 && kwh <= 500)
        {
            TotalTagihan = kwh * 2000;
            System.out.println("Total tagihan adalah Rp"+df.format(TotalTagihan));
        }
        else {
            System.out.println("Anda Tidak Punya Listrik");
        }
    }
    
}
