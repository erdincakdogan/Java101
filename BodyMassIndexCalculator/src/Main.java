import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double index;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your weight");
    double kg =sc.nextDouble();

    System.out.println("Enter your height (m): ");

    double h= sc.nextDouble();

    index = kg /(h*h);
    System.out.println("Body mass = " +index);
    }
}