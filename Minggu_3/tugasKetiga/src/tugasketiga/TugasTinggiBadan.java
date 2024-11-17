package tugasketiga;
import java.util.Scanner;
public class TugasTinggiBadan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int beratBadan;
        double TinggiBadan;
        double BMI;
        
        System.out.print("Masukkan berat bedan: " );
        beratBadan = input.nextInt();
        
        System.out.print("Masukkan tinggi badan: ");
        TinggiBadan = input.nextDouble();
        
        BMI = beratBadan / (TinggiBadan * TinggiBadan);
        if(BMI <= 18.5)
        {
            System.out.println("Kurus");
        }else if(BMI >= 18.5 && BMI <= 24.9)
        {
            System.out.println("Normal");
        }else {
            System.out.println("Anda tidak masuk kategori");
        }
        }
}
