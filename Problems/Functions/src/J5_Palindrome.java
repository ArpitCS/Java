import java.util.Scanner;

public class J5_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if(isPalindrome(num)) System.out.println("Palindrome Number");
        else System.out.println("Non-Palindrome Number");
    }

    static boolean isPalindrome(int num) {
        int temp = 0;
        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            temp = (temp * 10) + digit;
        }
        return temp == num;
    }
}