import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        scanner.close();
    }
}