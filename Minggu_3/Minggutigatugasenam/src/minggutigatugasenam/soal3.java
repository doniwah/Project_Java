package minggutigatugasenam;

public class soal3 {
    public static void main(String[] args) {
        int angka = 5; // Inisialisasi variabel mulai dari 5
        
        // Loop do-while untuk mencetak angka yang merupakan kelipatan 2 dan 3
        do {
            angka++;
            if (angka % 2 == 0 && angka % 3 == 0) {
                System.out.println("Angka: "+angka);
            }

        } while (angka <= 20); // Berhenti jika angka melebihi 20
    
    }
    
}
