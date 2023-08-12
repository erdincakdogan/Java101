import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        int [] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        int minClosed = 0;
        int maxClosed = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int value = sc.nextInt();
        
        for (int i : list) {
            if (i < value && i > minClosed) {
                minClosed = i;
            }
        }
        
        for (int i : list) {
            if (i > value) {
                maxClosed = i;
                break;
            }
        }
        
        System.out.println("The nearest minimum value: " + minClosed);
        System.out.println("The nearest maximum value: " + maxClosed);
    }
}
