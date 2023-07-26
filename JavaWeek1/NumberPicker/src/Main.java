import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (or 0 to stop): ");
            number = inp.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Sum of even numbers and multiples of 4: " + sum);
    }
}
