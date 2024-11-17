package tigabelas;


public class Truk {
    
    double muatan;
    double maksmuatan;
    public Truk(int muatanAwal) {
        maksmuatan = muatanAwal;
    }
    public double getMuatanMaks() {
        return maksmuatan;
    }
    public double getMuatan() {
        return muatan;
    }
    public boolean tambahMuatan(double tambah) {
        boolean status = false;
        if (muatan + tambah <= maksmuatan) {
            muatan = muatan + tambah;
            status = true;
        }
        return status;
}
public static void main(String[] args) {
        Truk truk = new Truk(900);
        boolean status;
        System.out.println("Muatan maksaimal : " + truk.getMuatanMaks());
        status = truk.tambahMuatan(499.9999999);
        System.out.print("Tambah muatan : 500");
        if (status) {
            System.out.println("  ok");
        } else {
            System.out.println(" gagal");
        }
        status = truk.tambahMuatan(300.0);
        System.out.print("Tambah muatan : 300");
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        status = truk.tambahMuatan(150.0);
        System.out.print("Tambah muatan : 150");
        if (status) {
            System.out.println("  ok");
        } else {
            System.out.println(" gagal");
        }
        status = truk.tambahMuatan(50.0);
        System.out.print("Tambah muatan : 50");
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}
