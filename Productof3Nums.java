import java.util.Scanner;

public class Productof3Nums {
	
	public static void main (String[] args) {
	
		Scanner input = new Scanner (System.in);
	
		int num1;
		int num2;
		int num3;
		int product;
		
		System.out.print (" Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print (" Enter Second Number:");
		num2 = input.nextInt();
		
		System.out.print (" Enter Third Number: ");
		num3 = input.nextInt();
		
		product = num1 * num2 * num3;
		
		System.out.printf (" The product is %d", product );
	
	
	
	
	}
}