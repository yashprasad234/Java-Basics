public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = findPos(arr,10);
        System.out.println(ans);
    }

    static int findPos(int[] arr, int target) {
        int st = 0, end = 1;
        while (target > arr[end]) {
            int temp = end+1;
            end = end + (end - st + 1) * 2;
            st = temp;
        }
        return binarySearch(arr, target, st, end);
    }

    static int binarySearch(int[] arr, int target, int st, int end) {
        while (st <= end) {
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
