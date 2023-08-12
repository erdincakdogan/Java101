import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Enter your number : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please 0-100 ");
                if (isWrong) {
                    right++;
                    System.out.println("Lot of wrong naswer. Last : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from you..");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Well done, True ! Your number : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong Number !");
                if (selected > number) {
                    System.out.println(selected + " number, bigger than your number.");
                } else {
                    System.out.println(selected + " number, smaller than your number.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
