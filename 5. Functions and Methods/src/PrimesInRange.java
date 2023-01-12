import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int a) {
        if(a < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0)
                return false;
        }
        return true;
    }
}
