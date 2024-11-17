
package mingguduatugasempat;

public class tiga {
    public static void main(String[] args) {

        int jumlahproyek = 19;
        int waktu = 6;
        String ulasan = "positif";
        
        if(jumlahproyek >= 20 && waktu <= 7 && ulasan.equals("positif"))
        {
            System.out.println("Sangat Memuaskan");
        }else if(jumlahproyek >= 10 && jumlahproyek <= 20  && waktu >= 7 && waktu <= 14 && ulasan.equals("positif"))
        {
            System.out.println("Memuaskan");
        } else {
            System.out.println("Proyek anda tidak ditemukan");
        }  
    }
}
