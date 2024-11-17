
package minggutigatugaslima;

public class MinggutigaTugasLima {

   
    public static void main(String[] args) {
        
        int angka1 = 20; 
        int angka2 = 10;
        String operator = "-";
        int hasil;
        

        switch(operator) {
        case "+":
    // code block
        hasil = angka1 + angka2;
        System.out.println("Hasil dari: "+angka1+" "+operator +" "+angka2 +" = "+ hasil);
        break;
        case "-":
        hasil = angka1 - angka2;
        System.out.println("Hasil dari: "+angka1+" "+operator +" "+angka2 +" = "+ hasil);
    // code block
        break;
        case "/":
        hasil = angka1 / angka2;
        System.out.println("Hasil dari: "+angka1+" "+operator +" "+angka2 +" = "+ hasil);
    // code block
        break;
        case "*":
    // code block
        hasil = angka1 * angka2;
        System.out.println("Hasil dari: "+angka1+" "+operator +" "+angka2 +" = "+ hasil);
        break;
        default:
            System.out.println("Perhitungan tidak valid");
    // code block
}
    }
    
}
