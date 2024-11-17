package tigabelas;
 static int saldo = 0;

    String getSaldo() {
        //saldo = get;
        return null;
    }

    public int simpanUang(int simpan) {
        saldo = saldo += simpan;
        return saldo;
    }

    public boolean ambilUang(int ambil) {
        boolean status = false;
        if (saldo > ambil) {
            saldo = saldo - ambil;
            status = true;
        }
        return status;
    }

    public int getSaldo(int get) {
        saldo = get;
        return saldo;
    }

    public static void main(String[] args) {
        boolean status;
        TIGABELAS tabungan = new TIGABELAS();
        System.out.println("Saldo awal : " + tabungan.getSaldo(5000));
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = tabungan.ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status = tabungan.ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        status = tabungan.ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo sekarang = " + tabungan.getSaldo(saldo));
    }
public class TIGABELAS {

   
}
