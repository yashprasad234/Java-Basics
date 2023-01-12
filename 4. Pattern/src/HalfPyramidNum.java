import java.util.Scanner;

public class HalfPyramidNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
