package tugassembilan;
import java.util.Scanner;

public class contoh2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1)+ ": ");
            nilai[i] = input.nextInt();
        }
        
        int max = nilai[0];
        int min = nilai[0];
        
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] > max)
            {
                max = nilai[i];
            }
            if(nilai[i] < min)
            {
                min = nilai[i];
            }
        }
        
        System.out.println("Nilai maksimum adalah: "+ max);
        System.out.println("Nilai minimum adalah: "+ min);
    }
}
