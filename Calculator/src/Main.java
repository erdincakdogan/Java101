import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int number1, number2, select;

      Scanner inp = new Scanner(System.in);

      System.out.print("Enter your first number: ");
      number1 = inp.nextInt();


        System.out.print("Enter your second number: ");
        number2 = inp.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division ");
        System.out.print("Selection:");
        select=inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Addition: " + (number1+ number2));
                break;
            case 2:
                System.out.print("Substraction: " + (number1- number2));
                break;
            case 3:
                System.out.print("Multiplication: " + (number1 * number2));
                break;
            case 4:
               if (number2 == 0) {
                   System.out.println("Number cannot be divided by 0");
                   break;
               }
               System.out.println("Division: " + (number1 / number2));
               break;
            default:
                System.out.println("Wrong selection");
        }
    }
}