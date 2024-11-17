package tugassembilan;

import java.util.Arrays;
import java.util.Scanner;


public class soalTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[8];
        int total = 0;
        
        for(int i = 0; i < 8; i++)
        {
            System.out.print("Masukkan angka ke-"+ (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        
        

        Arrays.sort(angka);
        System.out.println("\nArray setelah diurutkan: ");
        for (int i = 0; i < angka.length; i++)
        {
            System.out.println("Angka ke-" + (i + 1)+ " bernilai: " + angka[i]);

        }
        
        System.out.println("\nTotal nilai dengan index ganjil: ");
        for (int i = 0; i < angka.length; i += 2)
        {
              total += angka[i];
        }
        System.out.println("ganjil: "+total);
    }
  
}
