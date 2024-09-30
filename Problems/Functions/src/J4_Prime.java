import java.util.Scanner;

public class J4_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("Prime Number!");
        } else {
            System.out.println("Non-Prime Number!");
        }
    }
    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
