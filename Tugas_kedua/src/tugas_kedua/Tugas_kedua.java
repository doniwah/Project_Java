package tugas_kedua;
import java.text.DecimalFormat;

public class Tugas_kedua {


    public static void main(String[] args) {    
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        
         //Total Warisan
         var TotalWarisan = 236_800_000_000L;
         
         //Hitung Bagian Istri yaitu dibagi 8 karena menurut agama islam istri mendapatkan 1/8 jika ada anak yang ditinggalkan
         var BagianIstri = TotalWarisan / 8;
        
         //Hitung sisa warisan yaitu dengan totalwarisan - bagian istri
         var SisaWarisan = TotalWarisan - BagianIstri;
         
         //Hitung bagian anak, kenapa bisa lima karena anak laki laki mendapatkan 2 kali lebih besar dari pada anak perempuan jadi hitungannya 2+1+2 = 5
         var TotalBagianAnak = 5;
         
         //Hitung Bagian Per Anak yaitu SisaWarisan dibagi dengan TotalBagian Anak yiatu 5
         var BagianPerAnak = SisaWarisan / TotalBagianAnak;
         
         //Hitung bagian anak laki-laki yaitu bagian per anak dikali 2 karena bagian anak laki-laki 2 kali lipat dari anak perempuan
         var BagianAnakLakiLaki = BagianPerAnak * 2;
         
         //Hitung bagian anak perempuan yaitu sama dengan bagian per anak
         var BagianAnakPerempuan = BagianPerAnak;  
         
         System.out.println("Total Warisan : Rp " + df.format(TotalWarisan));
         System.out.println("Bagian Istri: Rp " + df.format(BagianIstri));
         System.out.println("Bagian Anak Pertama:  Rp " + df.format(BagianAnakLakiLaki));
         System.out.println("Bagian Anak kedua: Rp " + df.format(BagianAnakPerempuan));
         System.out.println("Bagian Anak ketiga: Rp " + df.format(BagianAnakLakiLaki));
    }
    
}
