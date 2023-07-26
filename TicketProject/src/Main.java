import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi girin: ");
        int distance = inp.nextInt();

        System.out.print("Yaşınızı girin: ");
        int age = inp.nextInt();

        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int tripType = inp.nextInt();

        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double birimFiyat = 0.10;
        double totalPrice = distance * birimFiyat;

        if (age < 12) {
            totalPrice *= 0.5;
        } else if (age >= 12 && age <= 24) {
            totalPrice *= 0.9;
        } else if (age >= 65) {
            totalPrice *= 0.7;
        }

        if (tripType == 2) {
            totalPrice *= 0.8;
        }

        System.out.println("Toplam Bilet Fiyatı: " + totalPrice + " TL");
    }
}
