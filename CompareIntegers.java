import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.print (" Enter First Integer: ");
		num1 = input.nextInt();
		
		System.out.print (" Enter Second Number: ");
		num2 = input.nextInt();
		
		if (num1 > num2)
			System.out.printf ("%d is larger", num1);

		if (num2 > num1)
			System.out.printf ("%d is larger", num2);
		
		
		if (num1 == num2)
			System.out.printf(" The numbers are equal %d", num1, num2);
    }
}
