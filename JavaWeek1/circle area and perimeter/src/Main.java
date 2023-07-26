import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int r;
    double pi = 3.14;

    Scanner inp = new Scanner(System.in);

    System.out.print("Input radius of circle: ");
    r= inp.nextInt();
    double area = pi*r*r;
    double perimeter = 2 * pi * r;

    System.out.println("Area of circle: " +area);
    System.out.println("Perimeter of circle: " +perimeter);
    }
}