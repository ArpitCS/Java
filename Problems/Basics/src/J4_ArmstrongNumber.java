import java.util.Scanner;
import java.math.*;

public class J4_ArmstrongNumber {
    public static boolean armstrong(int num) {
        int org = num;
        int digits = 0;
        while (org != 0) {
            digits++;
            org /= 10;
        }
        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            ans += Math.pow(digit, digits);
            num /= 10;
        }
        if (ans == num) {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print(armstrong(num));
    }
}
