package tugassembilan;
import java.util.Arrays;
import java.util.Scanner;


public class soalDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[7];
        
        for(int i = 0; i < 7; i++)
        {
            System.out.print("Masukkan angka ke-"+ (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        Arrays.sort(angka);
        System.out.println("\nArray diurutkan dengan kebalikan: ");
        for (int i = angka.length - 1; i >= 0; i--)
        {
            System.out.println("bernilai: " + angka[i]);
        }
    }
}
