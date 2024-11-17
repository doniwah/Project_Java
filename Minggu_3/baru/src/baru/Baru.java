/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baru;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author acer
 */
public class Baru {
private static final Map<String, Integer> menuMakanan = new HashMap<>();
    private static final Map<String, Integer> menuMinuman = new HashMap<>();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        // Inisialisasi menu makanan
        menuMakanan.put("bakso", 15000);
        menuMakanan.put("soto", 12000);
        menuMakanan.put("nasi campur", 18000);
        menuMakanan.put("nasi tahu tek", 10000);

        // Inisialisasi menu minuman
        menuMinuman.put("es teh", 3000);
        menuMinuman.put("es jeruk", 4000);
        menuMinuman.put("teh hangat", 3000);
        menuMinuman.put("jeruk hangat", 4000);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       int totalHarga = 0;

        System.out.println("Selamat datang di Kasir Kantin!");
        
        while (true) {
            System.out.println("\nMenu Makanan:");
            for (Map.Entry<String, Integer> entry : menuMakanan.entrySet()) {
                System.out.printf("- %s: Rp%d\n", entry.getKey(), entry.getValue());
            }

            System.out.println("\nMenu Minuman:");
            for (Map.Entry<String, Integer> entry : menuMinuman.entrySet()) {
                System.out.printf("- %s: Rp%d\n", entry.getKey(), entry.getValue());
            }

            System.out.print("\nMasukkan pesanan (atau ketik 'selesai' untuk mengakhiri): ");
            String pesanan = reader.readLine().toLowerCase();

            if (pesanan.equals("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = Integer.parseInt(reader.readLine());

            int harga = 0;
            if (menuMakanan.containsKey(pesanan)) {
                harga = menuMakanan.get(pesanan);
            } else if (menuMinuman.containsKey(pesanan)) {
                harga = menuMinuman.get(pesanan);
            } else {
                System.out.println("Menu tidak tersedia.");
                continue;
            }

            int subtotal = harga * jumlah;
            totalHarga += subtotal;

            System.out.printf("Subtotal: Rp%d\n", subtotal);
        }

        System.out.printf("\nTotal harga: Rp%d\n", totalHarga);
        System.out.print("Masukkan jumlah uang: Rp");
        int uangDibayar = Integer.parseInt(reader.readLine());

        if (uangDibayar < totalHarga) {
            System.out.println("Maaf, uang tidak cukup. Pembayaran dibatalkan.");
        } else {
            int kembalian = uangDibayar - totalHarga;
            System.out.printf("Kembalian: Rp%d\n", kembalian);
            System.out.println("Terima kasih atas pembelian Anda!");
        }
    }
    
}
