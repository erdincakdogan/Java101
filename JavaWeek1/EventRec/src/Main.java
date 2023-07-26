import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = inp.nextInt();

        if (temperature < 5) {
            System.out.println("Recommended activity: Go skiing.");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("Recommended activity: Go to the cinema.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("Recommended activity: Go for a picnic.");
        } else {
            System.out.println("Recommended activity: Go swimming.");
        }
    }
}
