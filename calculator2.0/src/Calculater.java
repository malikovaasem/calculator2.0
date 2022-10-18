import java.util.Scanner;

public class Calculater
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        char operation1, operation2;

        // The result of the operation
        int result = 0;

        // read in operands and operation from user
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        if (num1 > 10) {
            System.out.println("The number will be less than 10");
            scanner.close();
        }

        System.out.print("Enter an operation (+, -, /, *): ");
        operation1 = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        if (num2 > 10) {
            System.out.println("The number will be less than 10");
            scanner.close();
        }

        System.out.print("Enter an operation (+, -, /, *): ");
        operation2 = scanner.next().charAt(0);

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
        if (num3 > 10) {
            System.out.println("The number will be less than 10");
            scanner.close();
        }

        //Close an input
        scanner.close();

        // Determine the operator
        switch (operation1) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        switch (operation2) {
            case '+':
                result = result + num3;
                break;
            case '-':
                result = result - num3;
                break;
            case '*':
                result = result * num3;
                break;
            case '/':
                result = result / num3;
                break;
        }
        // Display result
        System.out.println(num1 + " " + operation1 + " " + num2
                + " " + operation2 + " " + num3 + " = " + result);

    }
}