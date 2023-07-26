import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        double math, music, chemistry, physics, turk, valid = 0, average, validNumber = 0;

        System.out.print("Enter your Math note: ");
        math = inp.nextDouble();
        if (math>=0 && math<=100) {
            valid +=math;
            ++validNumber;
        }

        System.out.print("Enter your Chemistry note: ");
        chemistry = inp.nextDouble();
        if (chemistry>=0 && chemistry<=100) {
            valid +=chemistry;
            ++validNumber;
        }

        System.out.print("Enter your Physics note: ");
        physics = inp.nextDouble();
        if (physics>=0 && physics<=100) {
            valid +=physics;
            ++validNumber;
        }

        System.out.print("Enter your Music note: ");
        music = inp.nextDouble();
        if (music>=0 && music<=100) {
            valid +=music;
            ++validNumber;
        }

        System.out.print("Enter your Turk note: ");
        turk = inp.nextDouble();
        if (turk>=0 && turk<=100) {
            valid +=turk;
            ++validNumber;
        }

        average = valid/validNumber;

        if (average>=55){
            System.out.println("Well done! You passed");
        }
        else {
            System.out.println("You failed");
        }
        System.out.println("Average: " + average);
    }
}