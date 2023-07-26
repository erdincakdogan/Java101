import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number1 = inp.nextInt();

        int total = 0;
        int piece = 0;

        for (int i = 0; i <= number1; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                piece++;
            }
        }

        double ortalama = (double) total / piece;
        System.out.println("0'dan " + number1 + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
    }
}
