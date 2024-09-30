import java.util.Scanner;

public class J2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (evenOddCheck(num)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    static boolean evenOddCheck(int num) {
        if (num % 2 == 0) return true;
        return false;
    }
}
