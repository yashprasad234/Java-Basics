import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(isEven(num))
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    static boolean isEven(int a) {
        if(a % 2 == 0)
            return true;
        return false;
    }
}
