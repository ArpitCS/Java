import java.util.Scanner;
public class J2_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sampleInt = sc.nextInt();
        float sampleFloat = sc.nextFloat();
        double sampleDouble = sc.nextDouble();
        boolean sampleBoolean = sc.nextBoolean();
        String sampleWord = sc.next();
        String sampleString = sc.nextLine();

        System.out.println("Integer: " + sampleInt);
        System.out.println("Float: " + sampleFloat);
        System.out.println("Double: " + sampleDouble);
        System.out.println("Word: " + sampleWord);
        System.out.println("String: " + sampleString);
        System.out.println("Boolean: " + sampleBoolean);
    }
}
