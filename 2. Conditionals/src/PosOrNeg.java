import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < 0)
            System.out.println("The number you entered is negative");
        else
            System.out.println("The number you entered is positive");
    }
}
