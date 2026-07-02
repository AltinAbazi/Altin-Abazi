import java.util.Scanner;

public class Klasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = scanner.nextInt();

        // Upper half, including the middle row
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j =2 ; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        scanner.close();
    }
}