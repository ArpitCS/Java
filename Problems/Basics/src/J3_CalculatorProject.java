import java.util.Scanner;
public class J3_CalculatorProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        while (true) {
            System.out.println("Enter Choice");
            System.out.println("1. Enter Calculator");
            System.out.println("2. Exit");
            int choice = sc.nextInt();

            if (choice != 1) break;

            System.out.print("Enter Operand 1: ");
            num1 = sc.nextFloat();
            System.out.print("Enter Operand 2: ");
            num2 = sc.nextFloat();
            System.out.print("Choose Operation [+, -, *, /, %]: ");
            char op = sc.next().charAt(0);
            if (op == '+') {
                System.out.println("Addition: " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Subtraction: " + (num1 - num2));
            } else if (op == '*') {
                System.out.println("Multiplication: " + (num1 * num2));
            } else if (op == '/') {
                if (num2 == 0) {
                    System.out.println("Division not allowed by 0!");
                } else {
                    System.out.println("Division: " + (num1 / num2));
                }
            } else if (op == '%') {
                if (num2 == 0) {
                    System.out.println("Division not allowed by 0!");
                } else {
                    System.out.println("Remainder: " + (num1 % num2));
                }
            } else {
                System.out.println("Invalid Operation!");
            }

            System.out.println("----------------------------------");
        }
    }
}
