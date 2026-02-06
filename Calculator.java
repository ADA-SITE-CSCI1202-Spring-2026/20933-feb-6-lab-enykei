import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (secondNumber != 0) ? (double) firstNumber / secondNumber : Double.NaN;
        int remainder = (secondNumber != 0) ? firstNumber % secondNumber : 0;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is: " + difference);
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is: " + product);
        if (secondNumber != 0) {
            System.out.println("The quotient of " + firstNumber + " and " + secondNumber + " is: " + quotient);
            System.out.println("The remainder of " + firstNumber + " and " + secondNumber + " is: " + remainder);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}
