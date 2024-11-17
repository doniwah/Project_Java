package tugassebelas;

import java.util.Scanner;

public class tugasduabelas {
    static Scanner input = new Scanner(System.in);
    static int[] harga_makanan = {8000, 10000, 11000, 12000};
    static int[] harga_minuman = {3000, 4000, 4000, 5000};
    static boolean bayar_lunas = false;
    
     public static void menu_list() {
        String[] makanan = {"bakso", "soto", "tahu tek", "nasi campur"};
        String[] minuman = {"es teh", "es jeruk", "teh hangat", "jeruk hangat"};
        System.out.println("Hallo sobat selamat datang di kantin doni\n");
        System.out.println("Menu makanan");
        int i = 0;
        for (int j = 0; j < makanan.length; j++) {
            i++;
            System.out.print(i + "." + makanan[j] + ": Rp " + harga_makanan[j] + "\n");
        }
        System.out.println("\nMenu Minuman");
        int k = 0;
        for (int o = 0; o < minuman.length; o++) {
            k++;
            System.out.print(k + "." + minuman[o] + ": Rp " + harga_minuman[o] + "\n");
        }
    }
     
    public static void main(String[] args) {

    
        int total_harga = 0;
        int harga = 0;
        int jumlah = 0;
        int subtotal = 0;
        
        do {
            menu_list();
            System.out.print("\nMasukkan pesanan (atau ketik 'selesai' untuk mengakhiri): ");
            String pesanan = input.nextLine();
            
            if (pesanan.equals("selesai")) {
                if (total_harga > 0) {
                    perhitungan(harga, jumlah, subtotal, total_harga);
                }
                break;
            }
            
            System.out.print("\nMasukkan jumlah: ");
            jumlah = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            
            switch (pesanan.toLowerCase()) {
                case "bakso":
                    harga = harga_makanan[0];
                    break;
                case "soto":
                    harga = harga_makanan[1];
                    break;
                case "tahu tek":
                    harga = harga_makanan[2];
                    break;
                case "nasi campur":
                    harga = harga_makanan[3];
                    break;
                case "es teh":
                    harga = harga_minuman[0];
                    break;
                case "es jeruk":
                    harga = harga_minuman[1];
                    break;
                case "teh hangat":
                    harga = harga_minuman[2];
                    break;
                case "jeruk hangat":
                    harga = harga_minuman[3];
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
                    continue;
            }
            
            subtotal = harga * jumlah;
            total_harga += subtotal;
            System.out.println("Subtotal: Rp" + subtotal);
            
        } while (true);
    }
    public static int perhitungan(int harga, int jumlah, int subtotal, int total_harga) {

        System.out.printf("\nTotal harga: Rp%d\n", total_harga);
        System.out.print("\nMasukkan jumlah uang: Rp");
        int uangDibayar = input.nextInt();
        input.nextLine();
        if (uangDibayar < total_harga) {
            System.out.println("Maaf, uang tidak cukup. Subtotal anda sebesar: Rp" + total_harga);
            bayar_lunas = false;
        } else {
            bayar_lunas = true;
            int kembalian = uangDibayar - total_harga;
            System.out.printf("Kembalian: Rp%d\n", kembalian);
            System.out.println("Terima kasih atas pembelian Anda!");

        }
        return total_harga;

    }
}
