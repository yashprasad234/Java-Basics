import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int st = 0, end = arr.length-1;
        while(st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return;
    }
}
