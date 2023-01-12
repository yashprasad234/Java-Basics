public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int a: arr) {
            min = Math.min(a, min);
            max = Math.max(a, max);
        }
        System.out.println("Min in the array is : " + min + " and Max in the array is : " + max);
    }
}
