import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int a = sc.nextInt();
        System.out.println("Area of the square with the side " + a + " is : " + a*a);
    }
}
