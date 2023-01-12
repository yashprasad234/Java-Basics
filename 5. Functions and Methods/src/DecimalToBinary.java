import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();
        System.out.println("The binary equivalent of " + num + " is : " + decimalToBinary(num));
    }

    static int decimalToBinary(int a) {
        int ans = 0, rem = 0;
        while(a > 0) {
            rem = a % 2;
            ans = ans * 10 + rem;
            a /= 2;
        }
        return reverse(ans);
    }

    static int reverse(int a) {
        int rem = 0, ans = 0;
        while(a > 0) {
            rem = a % 10;
            ans = ans * 10 + rem;
            a /= 10;
        }
        return ans;
    }
}
