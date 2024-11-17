package mingguduatugasempat;
import java.util.Scanner;
public class MingguDuaTugasEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia, BeratBadan;
        String aktivitas_fisik;
        double BMI, TinggiBadan;

        
        System.out.print("Masukkan aktivitas fisik anda (rendah, sedang, tinggi): ");
        aktivitas_fisik = input.nextLine();
        System.out.print("Masukkan usia anda: ");
        usia = input.nextInt();
        System.out.print("Masukkan berat badan anda: ");
        BeratBadan = input.nextInt();
        System.out.print("Masukkan tinggi badan anda: ");
        TinggiBadan = input.nextDouble();
        
        BMI = BeratBadan / (TinggiBadan * TinggiBadan);
        if(usia <= 18 && aktivitas_fisik.equals("rendah"))
        {
            System.out.println("Tingkatkan aktivitas fisik dengan berolahraga minimal 30 menit setiap hari.");

        } else if(BMI >= 25 && BMI <= 29.9 && aktivitas_fisik.equals("rendah") || aktivitas_fisik.equals("sedang"))
        {
            System.out.println("Kurangi asupan kalori dan lakukan olahraga rutin untuk mencapai berat badan ideal.");

        } else if(usia >= 40 && BMI >= 30 && aktivitas_fisik.equals("rendah"))
        {
            System.out.println("Konsultasikan dengan dokter untuk program penurunan berat badan yang sesuai");

        } else{
            System.out.println("Lanjutkan gaya hidup sehat Anda");
  
        }
    }    
}
