import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (num % 2 == 0) 
            System.out.println("The number is even.");
		
        if (num % 2 != 0)
            System.out.println("The number is odd.");
        
    }
}
