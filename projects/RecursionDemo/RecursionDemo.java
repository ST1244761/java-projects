import java.util.Scanner;

public class RecursionDemo {
    public static int sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 0;
        }
        return n + sumTo(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();
            System.out.println("Sum from 0 to " + n + " is " + sumTo(n));
        }
    }
}
