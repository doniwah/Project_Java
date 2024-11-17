package baru;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugasDelapan {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Total harga
        int toal_harga = 0;
        
        //Harga makanan
        int bakso = 8000;
        int soto = 10000;
        int nasi_campur = 11000;
        int nasi_tahu_tek = 13000;
        
        //Harga minuman
        int es_teh = 3000;
        int es_jeruk = 4000;
        int teh_hangat = 4000;
        int jeruk_hangat = 5000;
       
        
        while(true){   
        System.out.println("\nSelamat datang di Kasir Kantin DONI!");
        //Menampilkan menu makanan
        System.out.println("\nMenu Makanan:");
        System.out.println("- bakso: Rp"+bakso);
        System.out.println("- soto: Rp"+soto);
        System.out.println("- nasi campur: Rp"+nasi_campur);
        System.out.println("- nasi tahu tek: Rp"+nasi_tahu_tek);
        
        //Menampilkan menu minuman
        System.out.println("\nMenu Minuman:");
        System.out.println("- es teh: Rp"+es_teh);
        System.out.println("- es jeruk: Rp"+es_jeruk);
        System.out.println("- teh hangat: Rp"+teh_hangat);
        System.out.println("- jeruk hangat: Rp"+jeruk_hangat);    
        
        System.out.print("\nMasukkan pesanan (atau ketik 'selesai' untuk mengakhiri): ");
        String pesanan = reader.readLine().toLowerCase();
        
        if (pesanan.equals("selesai")){
            break;
         }
          System.out.print("Masukkan jumlah: ");
          int jumlah = Integer.parseInt(reader.readLine());
          
          int harga = 0;
          switch (pesanan){
              case "bakso":
                   harga = bakso;   
                      break;
              case "soto":
                  harga = soto;
                  break;
              case "nasi campur":
                  harga = nasi_campur;
                  break;
              case "nasi tahu tek":
                  harga = nasi_tahu_tek;
                  break;
              case "es teh":
                      harga = es_teh;
                      break;
              case "es jeruk":
                  harga = es_jeruk;
                  break;
              case "teh hangat":
                  harga = teh_hangat;
                  break;
              case "jeruk hangat":
                  harga = jeruk_hangat;
                  break;
              default:
                  System.out.println("Menu tidak tersedia.");
                  break;
          }
          
            int subtotal = harga * jumlah;
            toal_harga += subtotal;
            System.out.printf("Subtotal: Rp%d\n", subtotal);
        }
        
        System.out.printf("\nTotal harga: Rp%d\n", toal_harga);
        System.out.print("Masukkan jumlah uang: Rp");
        int uangDibayar = Integer.parseInt(reader.readLine());
        
        if (uangDibayar < toal_harga) {
            System.out.println("Maaf, uang tidak cukup. Pembayaran dibatalkan.");
        } else {
            int kembalian = uangDibayar - toal_harga;
            System.out.printf("Kembalian: Rp%d\n", kembalian);
            System.out.println("Terima kasih atas pembelian Anda!");
        }
    }
}
