/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_sepuluh;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class tes {
    private static String[][] mahasiswa = new String[100][3];
    private static int jumlahMahasiswa = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    lihatMahasiswa();
                    break;
                case 3:
                    cariMahasiswa();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }
    
       private static void tampilkanMenu() {
        System.out.println("\nMenu Manajemen Mahasiswa:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Lihat Mahasiswa");
        System.out.println("3. Cari Mahasiswa");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    private static void tambahMahasiswa() {
        if (jumlahMahasiswa < mahasiswa.length) {
            System.out.print("Masukkan Nama: ");
            mahasiswa[jumlahMahasiswa][0] = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            mahasiswa[jumlahMahasiswa][1] = scanner.nextLine();
            System.out.print("Masukkan Jurusan: ");
            mahasiswa[jumlahMahasiswa][2] = scanner.nextLine();

            jumlahMahasiswa++;
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas mahasiswa penuh.");
        }
    }

    private static void lihatMahasiswa() {
        if (jumlahMahasiswa > 0) {
            System.out.println("\nDaftar Mahasiswa:");
            System.out.println("No.\tNama\t\tNIM\t\tJurusan");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.printf("%d.\t%s\t\t%s\t\t%s\n", (i+1), mahasiswa[i][0], mahasiswa[i][1], mahasiswa[i][2]);
            }
        } else {
            System.out.println("Belum ada data mahasiswa.");
        }
    }

    private static void cariMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String nimCari = scanner.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (mahasiswa[i][1].equals(nimCari)) {
                System.out.println("\nData Mahasiswa ditemukan:");
                System.out.println("Nama: " + mahasiswa[i][0]);
                System.out.println("NIM: " + mahasiswa[i][1]);
                System.out.println("Jurusan: " + mahasiswa[i][2]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }
}
