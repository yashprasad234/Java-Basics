import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary Number : ");
        int num = sc.nextInt();
        System.out.println("The decimal equivalent of this binary number is : " + binaryToDecimal(num));
    }

    static int binaryToDecimal(int a) {
        int ans = 0, rem = 0, k = 1;
        while(a > 0) {
            rem = a % 10;
            ans += rem * k;
            a /= 10;
            k *= 2;
        }
        return ans;
    }
}
