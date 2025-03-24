import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num > 0) positive++;
            else if (num < 0) negative++;
            else zero++;
        }

        System.out.printf("Positive: %d, Negative: %d, Zeros: %d%n", positive, negative, zero);
    }
}
