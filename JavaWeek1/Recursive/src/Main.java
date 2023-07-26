import java.util.Scanner;

public class Main {
    public static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int a = inp.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int b = inp.nextInt();

        int sonuc = usHesapla(a, b);
        System.out.println("Sonuç: " + sonuc);
    }
}
