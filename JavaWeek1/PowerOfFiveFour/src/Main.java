import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inp.nextInt();

        System.out.println("Powers of 4 and 5:");

        for (int i = 0; i <= number; i++) {
            System.out.println("4^" + i + " = " + Math.pow(4, i));
            System.out.println("5^" + i + " = " + Math.pow(5, i));
        }
    }
}
