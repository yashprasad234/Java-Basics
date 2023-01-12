import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of rhombus : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2*n-1; j++) {
                if(j < n-i || j > 2*n-i-1)
                    System.out.print("  ");
                else {
                    if(i > 0 && i < n-1){
                        if(j > n-i && j < 2 * n - i - 1)
                            System.out.print("  ");
                        else
                            System.out.print("* ");
                    }else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
