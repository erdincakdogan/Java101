import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        double pearkg, applekg, tomatoeskg, bananakg, eggplantkg;
        double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.0;
        double totalPrice;

        System.out.print("Enter grape kg pear: ");
        pearkg = k.nextInt();

        System.out.print("Enter apple kg pear: ");
        applekg = k.nextInt();

        System.out.print("Enter tomatoes kg pear: ");
        tomatoeskg = k.nextInt();

        System.out.print("Enter banana kg pear: ");
        bananakg = k.nextInt();

        System.out.print("Enter eggplant kg pear: ");
        eggplantkg = k.nextInt();

        totalPrice = (pearkg * pearPrice) + (applekg * applePrice) + (tomatoeskg * tomatoesPrice) + (bananakg * bananaPrice) + (eggplantkg * eggplantPrice);

        System.out.println("Total Price = " + totalPrice);
    }
}