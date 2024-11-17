/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggutigatugaslima;

/**
 *
 * @author acer
 */
public class soaltiga {
    public static void main(String[] args) {
        int start = 20;
        int end = 50;
        
        System.out.println("Bilangan prima antara "+start+" sampai "+end);
        
        for(int i = start; i <= end; i++){
            
            boolean isPrime = true;
        
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Jika isPrime masih true, maka i adalah bilangan prima
            if (isPrime && i > 1) {
                System.out.println(i);
            }
        }
    }
}
