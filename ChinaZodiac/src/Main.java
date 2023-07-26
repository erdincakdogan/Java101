import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int year = inp.nextInt();

        String[] zodiac = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare",
                "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan",
                "At", "Koyun"
        };

        int zodiacIndex = year % 12;
        String chineseZodiac = zodiac[zodiacIndex];

        System.out.println("Çin Zodyağı Burcunuz: " + chineseZodiac);
    }
}
