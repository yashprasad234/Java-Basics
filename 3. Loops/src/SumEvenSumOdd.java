import java.util.Scanner;

public class SumEvenSumOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1 = 0, sum2 = 0;
        System.out.print("How many integers do you want to input : ");
        int i = in.nextInt();
        System.out.print("Input " + i + " integers : ");
        for(int j = 0; j < i; j++) {
            int n = in.nextInt();
            if(n % 2 == 0)
                sum1 += n;
            else
                sum2 += n;
        }
        System.out.println("The sum of all the odd integers inputed is : " + sum2);
        System.out.println("The sum of all the even integers inputed is : " + sum1);
    }
}
