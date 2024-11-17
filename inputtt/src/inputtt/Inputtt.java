/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputtt;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Inputtt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String nama, domisili;
        int umur;
        
        
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Domisili: ");
        domisili = input.nextLine();
        System.out.print("Umur: ");
        umur = input.nextInt();
        
        
        System.out.println("============");
        System.out.println(nama + " berasal dari " + domisili);
        System.out.println("berumur "+umur + " tahun");
    }
    
}
