/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassembilan;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class percobaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[10];
        int[] frekuensi = new int[101]; // Asumsi angka input 0-100

        System.out.println("Masukkan 10 angka (0-100):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Angka ke-" + (i+1) + ": ");
            angka[i] = scanner.nextInt();
            
            frekuensi[angka[i]]++;
        }
        System.out.println("\nFrekuensi kemunculan angka:");
        for (int i = 0; i < 101; i++) {
            if (frekuensi[i] > 0) {
                System.out.println("Angka " + i + " muncul " + frekuensi[i] + " kali");
            }
        }
        scanner.close();
    }
}
