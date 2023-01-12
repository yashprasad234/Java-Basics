import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
//        int num = 121;
        if(isPalindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }

    static boolean isPalindrome (int a) {
        int res = 0, rem = 0;
        int orig = a;
        while(a > 0) {
            rem = a % 10;
            res = res * 10 + rem;
            a /= 10;
        }
        if(res == orig)
            return true;
        else
            return false;
    }
}
