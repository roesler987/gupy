import java.util.Scanner;

public class FibonacciCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;
        if (number == a || number == b) return true;
        int c = a + b;
        while (c <= number) {
            if (c == number) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}
