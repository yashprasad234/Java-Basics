public class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSubarrays(arr);
    }

    static void printSubarrays(int[] arr) {
        int minSum = arr[0], maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minSum)
                minSum = arr[i];
            maxSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j <= i; j++) {
                if(j != i) {
                    System.out.print(j + ",");
                } else
                    System.out.print(j);
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("The minimum subarray sum is : " + minSum);
        System.out.println("The maximum subarray sum is : " + maxSum);
    }
}
