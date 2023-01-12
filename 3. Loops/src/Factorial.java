import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        System.out.println("The factorial of " + n + " is : " + p);
    }
}
