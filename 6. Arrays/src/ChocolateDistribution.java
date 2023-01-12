import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(findMinDiff(arr, 5));
    }

    static int findMinDiff(int[] arr, int m) {
        if(m == 0 || arr.length == 0)
            return 0;
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-m; i++) {
            ans = Math.min(arr[i+m-1] - arr[i], ans);
        }
        return ans;
    }
}
