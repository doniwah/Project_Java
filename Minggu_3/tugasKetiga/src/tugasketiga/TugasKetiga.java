package tugasketiga;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TugasKetiga {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        int kwh, tagihanPerBulan;
        
        
        System.out.print("Masukkan Kwh: ");
        kwh = input.nextInt();
        
        if(kwh <= 100 )
        {
            tagihanPerBulan = kwh * 1500;
            System.out.println("Total Tagian Rp "+df.format(tagihanPerBulan));
        } else if(kwh >= 101 && kwh <= 500)
        {
            tagihanPerBulan = kwh * 2000;
            System.out.println("Total Tagian Rp "+df.format(tagihanPerBulan));
        } else {
            System.out.println("Tagihan Listrik Tidak Dapat Dihitung");
        }
        
        
        

        
        
       
    }
    
}
