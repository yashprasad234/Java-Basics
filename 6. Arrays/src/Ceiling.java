public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceilingOfNum(arr, 19));
    }

    static int ceilingOfNum (int[] arr, int target) {
        if(target > arr[arr.length-1])
            return Integer.MAX_VALUE;
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
        return arr[st];
    }
}
