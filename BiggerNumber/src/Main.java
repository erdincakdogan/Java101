import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = inp.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = inp.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = inp.nextInt();

        int smallest, middle, largest;

        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
            middle = (number2 <= number3) ? number2 : number3;
            largest = (number2 > number3) ? number2 : number3;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
            middle = (number1 <= number3) ? number1 : number3;
            largest = (number1 > number3) ? number1 : number3;
        } else {
            smallest = number3;
            middle = (number1 <= number2) ? number1 : number2;
            largest = (number1 > number2) ? number1 : number2;
        }

        System.out.println("Ascending order: " + smallest + " < " + middle + " < " + largest);
    }
}
