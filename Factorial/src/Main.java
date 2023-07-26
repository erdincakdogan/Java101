import java.util.Scanner;

public class Main {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }


    public static int combination(int n, int r) {
        int a = factorial(n);
        int b = factorial(r) * factorial(n - r);

        return a / b;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = inp.nextInt();

        System.out.print("Enter the value of r: ");
        int r = inp.nextInt();

        if (n >= r) {
            int result = combination(n, r);
            System.out.println("C(" + n + ", " + r + ") = " + result);
        } else {
            System.out.println("Invalid input: n must be greater than or equal to r.");
        }
    }
}
