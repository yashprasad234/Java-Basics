import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if(isPrime(a)) {
            System.out.println(a + " is a prime");
        } else
            System.out.println(a + " is not a prime");
    }

    static boolean isPrime(int a) {
        if(a < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i == 0)
                return false;
        }
        return true;
    }
}
