package tugasketiga;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        int jeniskendaraan;
        int biayaperjam;
        int biaya;
        
        
        System.out.print("Tulis jenis roda kendaraan anda: ");
        jeniskendaraan = input.nextInt();
        
        System.out.print("Berapa jam anda parkir: ");
        biayaperjam = input.nextInt();
        
        if(jeniskendaraan == 2)
        {
            biaya = biayaperjam * 2000;
            System.out.println("Tarif parkir anda adalah: "+ df.format(biaya));
        } else if(jeniskendaraan == 4)
        {
            biaya = biayaperjam * 5000;
            System.out.println("Tarif parkir anda adalah: Rp "+ df.format(biaya));
        }else {
            System.out.println("Kendaraan anda tidak ditemukan");
        }
    }       
}
