package tugassembilan;
import java.util.Scanner;
import java.util.Arrays;

public class contoh1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        
        int total = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1)+ ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        
        double rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
    }
}
