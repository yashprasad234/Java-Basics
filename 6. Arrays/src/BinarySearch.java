public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 10;
        System.out.println("The target is at index " + search(arr, target));
    }

    static int search(int[] arr, int target) {
        int st = 0, end = arr.length-1;
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
