import java.util.Scanner;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
