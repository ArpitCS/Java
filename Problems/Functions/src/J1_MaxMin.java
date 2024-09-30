import java.util.Scanner;
public class J1_MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter Three Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Maximum: " + max(a, b, c));
        System.out.println("Minimum: " + min(a, b, c));
    }
    static int max(int ...v) {
        int m = v[0];
        for (int i : v) {
            if (i > m) {
                m = i;
            }
        } return m;
    }
    static int min(int ...v) {
        int m = v[0];
        for (int i : v) {
            if (i < m) {
                m = i;
            }
        } return m;
    }
}
