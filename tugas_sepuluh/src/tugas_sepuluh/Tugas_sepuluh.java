package tugas_sepuluh;
import java.util.Scanner;
import java.util.Arrays;

public class Tugas_sepuluh {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        int jumlah_mahasiswa = 0;
        String[][] data_mhs = new String[10][3];
    
        do {
           System.out.println("\nMenu: " + "\n1.Tambah data" + "\n2.Lihat Data" + "\n3.Cari Data" + "\n4.Keluar");
        
           System.out.print("\nPilih menu: ");
           pilih_menu = input.nextInt();
           
            switch (pilih_menu) {
                case 1:
                      if (jumlah_mahasiswa < data_mhs.length) {
                      input.nextLine();
                      System.out.print("Masukkan Nama: ");
                      data_mhs[jumlah_mahasiswa][0] = input.nextLine();
                      System.out.print("Masukkan NIM: ");
                      data_mhs[jumlah_mahasiswa][1] = input.nextLine();
                      System.out.print("Masukkan Jurusan: ");
                      data_mhs[jumlah_mahasiswa][2] = input.nextLine();

                      jumlah_mahasiswa++;
                      System.out.println("Data mahasiswa berhasil ditambahkan.");
                      } else {
                            System.out.println("Kapasitas mahasiswa penuh.");
                      }
                    break;
                case 2:
                    System.out.println(jumlah_mahasiswa);
                      if (jumlah_mahasiswa > 0) {
                      System.out.println("\nDaftar Mahasiswa:");
                      for (int i = 0; i < jumlah_mahasiswa; i++) {
                      System.out.println((i+1)+"."+ "Nama: " + data_mhs[i][0] +"\t"+ "NIM: "+ data_mhs[i][1] +"\t"+ "Jurusan: " + data_mhs[i][2]);
                      }
                      } else {
                            System.out.println("Belum ada data mahasiswa.");
                      } 
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String nim = input.nextLine();
                    boolean ditemukan = false;

                   for (int i = 0; i < jumlah_mahasiswa; i++) {
                    if (data_mhs[i][1].equals(nim)) {
                    System.out.println("\nData Mahasiswa ditemukan:");
                    System.out.println("Nama: " + data_mhs[i][0]);
                    System.out.println("NIM: " + data_mhs[i][1]);
                    System.out.println("Jurusan: " + data_mhs[i][2]);
                    ditemukan = true;
                break;
            }
        }

                if (!ditemukan) {
                System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }
                    break;
                case 4:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    
                    break;
                    
            }

        } while (pilih_menu  != 4);
    }
}
