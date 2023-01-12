import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The sum of the digits of " + num + " is : " + sumOfDigits(num));
    }

    static int sumOfDigits (int a) {
        int sum = 0, rem = 0;
        while(a > 0) {
            rem = a % 10;
            sum += rem;
            a /= 10;
        }
        return sum;
    }
}
