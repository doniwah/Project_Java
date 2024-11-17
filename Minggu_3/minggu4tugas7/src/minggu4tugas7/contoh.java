
package minggu4tugas7;
import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
        int time;
        String nama;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda ");
        nama = keyboard.nextLine();
        System.out.print("Sekarang jam: ");
        time = keyboard.nextInt();
        
        if(time < 10){
            System.out.println("Hai, "+nama+" Selamat pagi");
        }else if(time < 18){
            System.out.println("Hai, "+nama+" Selamat siang");
        }else{
             System.out.println("Hai, "+nama+" Selamat petang");
        }
    }
}
