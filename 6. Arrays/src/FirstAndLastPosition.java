//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//Facebook

import java.util.*;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(arr, target, true);
        ans[1] = binarySearch(arr, target, false);
        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean fIndex) {
        int st = 0, end = arr.length-1, ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target) {
                ans = mid;
                if(fIndex)
                    end = mid - 1;
                else
                    st = mid + 1;
            } else if(arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return ans;
    }
}
