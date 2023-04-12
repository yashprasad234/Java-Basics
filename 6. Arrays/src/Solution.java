import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotatedSearch(arr, 1));
    }

    static int findPivot(int[] arr) {
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(mid > 0 && arr[mid] < arr[mid-1])
                return mid;
            if(mid < arr.length-1 && arr[mid] > arr[mid+1])
                return mid+1;
            if(arr[mid] < arr[0])
                end = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }

    static int rotatedSearch(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(arr[pivot] == target)
            return pivot;
        else if(target > arr[pivot])
            return bsearch(arr, target, 0, pivot-1);
        else
            return bsearch(arr, target, pivot+1, arr.length-1);
    }

    static int bsearch(int[] arr, int target, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }
}
