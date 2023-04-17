//https://leetcode.com/problems/find-in-mountain-array

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};

    }

    static int findInMountainArray(int target, int[] arr) {
        int peak = findPeak(arr);
        int ans = binarySearch(target, arr, 0, peak);
        if(ans != -1)
            return ans;
        return binarySearch(target, arr, peak+1, arr.length-1);
    }

    static int findPeak(int[] arr) {
        int st = 0, end = arr.length - 1;
        while(st < end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] < arr[mid+1])
                st = mid+1;
            else
                end = mid;
        }
        return st;
    }

    static int binarySearch(int target, int[] arr, int st, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = (arr[st] < arr[end]);

        while(st <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}
