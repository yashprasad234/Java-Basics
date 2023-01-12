import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth of rectangle : ");
        int m = sc.nextInt();
        System.out.print("Enter the length of rectangle : ");
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == m-1) {
                    System.out.print("* ");
                }
                else if(j== 0 || j == n-1) {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
