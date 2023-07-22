import java.util.Scanner;

public class Taxcalculator {
    public static void main(String[] args) {
        double fiyat, kdv = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen KDV hesaplanacak tutarı giriniz:");

        fiyat = inp.nextDouble();
        double kdvTutari = kdv * fiyat;
        double kdvliTutar = fiyat + kdvTutari;

        System.out.println("KDV'siz fiyat =" + fiyat);
        System.out.println("KDV oranı =" + kdv);
        System.out.println("KDV'li fiyat =" + kdvliTutar);
        System.out.println("KDV tutarı =" + kdvTutari);
    }
}
