public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floorOfNum(arr, 8));
    }

    static int floorOfNum(int[] arr, int target) {
        if(target < arr[0])
            return Integer.MIN_VALUE;
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return arr[end];
    }
}
