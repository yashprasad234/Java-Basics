import java.util.Scanner;

public class AverageOfThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of the three numbers is : " + average(a, b, c));
    }

    static float average(int a, int b, int c) {
        int sum = a + b + c;
        return (float) sum / 3;
    }
}
