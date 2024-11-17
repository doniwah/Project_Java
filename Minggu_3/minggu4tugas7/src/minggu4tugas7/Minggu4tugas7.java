package minggu4tugas7;
import java.util.Scanner;

public class Minggu4tugas7 {


    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       int usia, berat_badan;
       String tingkat_aktivitas_fisik;
       double bmi, tinggi_badan;
       
        System.out.print("Masukkan usia anda: ");
        usia = keyboard.nextInt();
        System.out.print("Masukkan berat badan anda (kg): ");
        berat_badan = keyboard.nextInt();
        System.out.print("Masukkan tinggi badan anda (cm): ");
        tinggi_badan = keyboard.nextInt();
        keyboard.nextLine(); //untuk mengonsumsi karakter newline
        
        System.out.print("Masukkan tingkat aktivitas fisik anda (rendah, sedang, tinggi): ");
        tingkat_aktivitas_fisik = keyboard.nextLine();
        // Konversi tinggi dari cm ke m
        tinggi_badan = tinggi_badan / 100;
        
        bmi = berat_badan / (tinggi_badan * tinggi_badan);
        //System.out.println(bmi);
        if(usia <= 18 && tingkat_aktivitas_fisik.equals("rendah")){
            System.out.println("Tingkatkan aktivitas fisik dengan berolahraga minimal 30 menit setiap hari.");
        }
        else if(bmi >=  25 && bmi <=  29.9 && (tingkat_aktivitas_fisik.equals("rendah") || tingkat_aktivitas_fisik.equals("sedang"))){
            System.out.println("Kurangi asupan kalori dan lakukan olahraga rutin untuk mencapai berat badan ideal.");
        }
        else if(usia >= 40 && bmi >= 30 && tingkat_aktivitas_fisik.equals("rendah")){
            System.out.println("Konsultasikan dengan dokter untuk program penurunan berat badan yang sesuai.");
        }
        else {
            System.out.println("Lanjutkan gaya hidup sehat Anda.");
        }
    }
    
}
