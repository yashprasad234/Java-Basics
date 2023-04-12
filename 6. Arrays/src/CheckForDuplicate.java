import java.util.Arrays;

public class CheckForDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(hasDuplicate(arr));
    }

    static boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1])
                return true;
        }
        return false;
    }
}
