import java.util.Scanner;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner inputa = new Scanner(System.in);
        System.out.print("First length: ");
        a= inputa.nextInt();
        System.out.print("Second length: ");
        b= inputa.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenus :" + c);

    }
}