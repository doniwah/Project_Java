import java.util.Scanner;


public class soaltiga {


    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
        int jumlahMahasiswa = 5;
        String nama;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nPenilaian untuk Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama mahasiswa: ");
            nama = keyboard.nextLine();

            System.out.print("Masukkan nilai a (pembuatan flowchart): ");
            double nilai_a = keyboard.nextDouble();
            System.out.print("Masukkan nilai b (penilaian ketepatan penentuan jenis variable dan penamaan variable): ");
            double nilai_b = keyboard.nextDouble();
            System.out.print("Masukkan nilai c (penilaian ketepatan penggunaan percabangan dan perulangan): ");
            double nilai_c = keyboard.nextDouble();
            System.out.print("Masukkan nilai d (penilaian tampilan program): ");
            double nilai_d = keyboard.nextDouble();
            System.out.print("Masukkan nilai e (laporan proses jalannya program): ");
            double nilai_e = keyboard.nextDouble();

            double nilaiTotal = (nilai_a + nilai_b + nilai_c + nilai_d + nilai_e) / 5;
            String status = (nilaiTotal >= 70) ? "Lulus" : "Tidak Lulus";
            
            System.out.println("\nHasil Penilaian:");
            System.out.println("Nama: " + nama);
            System.out.printf("Nilai Total: %.2f\n", nilaiTotal);
            System.out.println("Status: " + status);
            System.out.println();

            keyboard.nextLine();
        }
    }

}