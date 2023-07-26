import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Eleman sayisi giriniz: ");
        int elemanSayisi = inp.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(fib1 + " ");

            int yeniFibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = yeniFibonacci;
        }
    }
}
