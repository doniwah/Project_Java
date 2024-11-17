/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugassebelas;
import java.util.Scanner;

public class Tugassebelas {
    public static int menghitungRataRata(int nilaiTugas, int nilaiKuis, int nilaiUts, int nilaiUas){
        return (nilaiTugas + nilaiKuis + nilaiUts + nilaiUas) / 4;
    }
    
    public static void grade(double rata_rata, String grading){
        
        if(rata_rata >= 85){
            grading = "A";
        }
        else if(rata_rata >= 70 && rata_rata <= 84){
            grading = "B";
        }
        else if(rata_rata >= 50 && rata_rata <= 69){
            grading = "C";
        }
        else if(rata_rata < 50){
            grading = "D";
        }
        
        if(grading.equals("A") || grading.equals("B"))
        {
            System.out.println("Keterangan: Mahasiswa dinyatakan LULUS dengan grading: " + grading);
        }
        else if(grading.equals("C") || grading.equals("D"))
        {
            System.out.println("Keterangan: Mahasiswa dinyatakan TIDAK LULUS dengan grading: " + grading);
            System.out.println("minimal mendapatkan grade B untuk dapat dinyatakan lulus.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grading = "";
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama_mhs = input.nextLine();
        
        System.out.print("Masukkan nilai tugas mahasiswa: ");
        int nilaiTugas = input.nextInt();
        
        System.out.print("Masukkan nilai kuis mahasiswa: ");
        int nilaiKuis = input.nextInt();
        
        System.out.print("Masukkan nilai UTS mahasiswa: ");
        int nilaiUts = input.nextInt();
        
        System.out.print("Masukkan nilai UAS mahasiswa: ");
        int nilaiUas = input.nextInt();
        
        double rata_rata = menghitungRataRata(nilaiTugas, nilaiKuis, nilaiUts, nilaiUas);
        System.out.println("\n=========================");
        System.out.println("\n\nNama mahasiswa: "+ nama_mhs);
        System.out.println("Nilai Tugas: " + nilaiTugas);       
        System.out.println("Nilai Kuis: " + nilaiKuis);      
        System.out.println("Nilai UTS: " + nilaiUts);   
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("\nDengan rata-rata: "+ rata_rata);

        grade(rata_rata, grading);
    }
}
