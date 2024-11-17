package tugassembilan;
import java.util.Scanner;
import java.util.Arrays;

public class TugasSembilan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Masukkan angka ke-"+ (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        Arrays.sort(angka);
        System.out.println("\nArray setelah diurutkan: ");
        for (int i = 0; i < angka.length; i++)
        {
            System.out.println("\nAngka ke-" + (i + 1)+ " bernilai: " + angka[i]);
        }
    }
    
}
