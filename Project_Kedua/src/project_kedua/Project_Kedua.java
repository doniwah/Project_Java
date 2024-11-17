package project_kedua;
public class Project_Kedua {
    public static void main(String[] args) {
        // TODO code application logic here
        
        long TotalWarisan = 236_800_000_000L;
        
        
        long BagianIstri = TotalWarisan / 8;
        
        
        long SisaBagianIstri = TotalWarisan - BagianIstri;
        
        int TotalBagianAnak = 5;
        
        long BagianPerAnak = SisaBagianIstri / TotalBagianAnak;
        
        
        long BagianAnakLakiLaki = BagianPerAnak * 2;
        
        long BagianAnakPerempuan = BagianPerAnak;
        
        
        
        System.out.println("Total Warisan: Rp " +TotalWarisan);
        System.out.println("Bagian Istri: Rp " +BagianIstri);
        System.out.println("Bagian Anak Pertama: Rp " +BagianAnakLakiLaki);
        System.out.println("Bagian Anak Kedua: Rp " +BagianAnakPerempuan);
        System.out.println("Bagian Anak Ketiga: Rp " +BagianAnakLakiLaki);

    }
    
}
