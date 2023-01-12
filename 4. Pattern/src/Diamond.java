import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of diamond : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+i; j++) {
                if(j < n-i-1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n+i; j++) {
                if(j < n-i-1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
