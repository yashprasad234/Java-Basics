import java.util.Scanner;

public class ProductOfAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of " + a + ", " + b + " is : " + product(a, b));
    }

    static int product (int a, int b) {
        return a*b;
    }
}
