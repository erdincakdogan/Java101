import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String userName, password, newPass;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your username: ");
        userName = inp.nextLine();

        System.out.print("Enter your password: ");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.print("Signed in ");
        } else {
            System.out.print("Wrong Information!");

            System.out.print("Do you wanna reset your password? (Yes/No): ");
            String answer = inp.nextLine();
            switch (answer) {
                case "Yes":
                    System.out.print("Enter your new password:");
                    newPass = inp.nextLine();
                    if (newPass.equals("java123")) {
                        System.out.println("Your Password Cannot Be the Same as Your Old Password");
                    } else {
                        System.out.println("Your New Password Has Been Set Login Again");
                        break;
                    }
                case "No":
                    System.out.println("Try again.");
                    break;
            }
        }

    }
}