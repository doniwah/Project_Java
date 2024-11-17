/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tigabelas;

/**
 *
 * @author acer
 */
public class Tabungan {

    private int saldo;
    public Tabungan(int saldoAwal) {
        saldo = saldoAwal;
    }
    public int Tabungan(int saldo) {
        return saldo;
    }
    public int simpanUang(int simpan) {
        saldo = saldo += simpan;
        return saldo;
    }
    public int getSaldo() {
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
    public static void main(String[] args) {
        boolean status;
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.getSaldo());
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
        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
    }

}
