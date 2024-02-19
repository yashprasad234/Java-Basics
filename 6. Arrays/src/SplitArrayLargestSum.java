public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArrayOptimised(arr, 2));
    }

//   Naive approach using backtracking

    static int splitArray(int[] arr, int k, int ind, int sum, int maxSum, int ans) {
        // K=1 is the base Case
        if (k == 1) {
            maxSum = Math.max(maxSum, sum);
            sum = 0;
            for (int i = ind; i < arr.length; i++) {
                sum += arr[i];
            }
            // we update maxSum
            maxSum = Math.max(maxSum, sum);
            // the answer is stored in ans
            ans = Math.min(ans, maxSum);
            return ans;
        }
        sum = 0;
        // using for loop to divide the array into
        // K-subarray
        for (int i = ind; i < arr.length; i++) {
            sum += arr[i];
            // for each subarray we calculate sum ans update
            // maxSum
            maxSum = Math.max(maxSum, sum);
            // calling function again
            ans = splitArray(arr, k - 1, i + 1, sum, maxSum, ans);
        }
        return ans;
    }

//   Optimized solution using binary search

    static int splitArrayOptimised(int[] arr, int k) {
        int st = 0, end = 0;
        for(int a: arr) {
            st = Math.max(0, a);
            end += a;
        }
        while (st < end) {
            int mid = st + (end - st) / 2;
            int sum = 0, pieces = 1;
            for(int a: arr) {
                if(sum + a <= mid)
                    sum += a;
                else {
                    pieces++;
                    sum = a;
                }
            }
            if(pieces <= k)
                end = mid;
            else
                st = mid + 1;
        }
        return end; // return st; also works here because at this point st == end
    }
}
