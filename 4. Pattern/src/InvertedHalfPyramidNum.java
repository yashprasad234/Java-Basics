import java.util.Scanner;

public class InvertedHalfPyramidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
