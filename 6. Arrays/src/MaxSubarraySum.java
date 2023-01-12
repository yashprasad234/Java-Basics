public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        System.out.println("The maximum subarray sum is : " + maxSubarraySum(arr));
    }

    static int maxSubarraySum(int[] arr) {
        int currSum = arr[0], maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(currSum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
