package mingguduatugasempat;
import java.text.DecimalFormat;
public class dua {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        int penghasilanTahunan = 600000000;
        String statusPerkawinan = "menikah";
        double pajak;
                
        System.out.println("Tulis status perkawinan anda: "+penghasilanTahunan);
        System.out.println("Masukkan penghasilan anda dalam setahun: "+statusPerkawinan);

        if(penghasilanTahunan >=  500000000 && statusPerkawinan.equals("menikah"))
        {
            pajak = penghasilanTahunan * 0.30;
            System.out.println("Pajak anda berjumlah: Rp "+ df.format(pajak));
        }else if(penghasilanTahunan >= 250000000 && penghasilanTahunan <= 500000000 && statusPerkawinan.equals("belum menikah"))
        {
            pajak = penghasilanTahunan * 0.20;
            System.out.println("Pajak anda berjumlah: Rp "+ df.format(pajak));
        }else if(penghasilanTahunan <= 250000000)
        {
            pajak = penghasilanTahunan * 0.10;
            System.out.println("Pajak anda berjumlah: Rp "+ df.format(pajak));
        }
    } 
}
