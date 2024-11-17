/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mingguduatugasempat;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class perobaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angka dengan titik
        System.out.print("Masukkan angka dengan titik: ");
        String input = scanner.nextLine();

        // Hapus semua titik
        input = input.replace(".", "");

        // Konversi ke integer
        int angka = Integer.parseInt(input);

        // Tampilkan hasil
        System.out.println("Angka setelah konversi: " + angka);
    }
}
