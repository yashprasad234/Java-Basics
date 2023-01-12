import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        System.out.println("The binomial coefficient of n,r is : " + binomialCoeff(n,r));
    }

    static int binomialCoeff(int n, int r) {
        int ans = fact(n)/fact(r);
        ans /= fact(n-r);
        return ans;
    }

    static int fact(int a) {
        int res = 1;
        for(int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }
}
