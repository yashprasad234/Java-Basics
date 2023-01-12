public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4};
        largestSmallest(arr);
    }

    static void largestSmallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("The largest element in the array is : " + max);
        System.out.println("The smallest element in the array is : " + min);
    }
}
