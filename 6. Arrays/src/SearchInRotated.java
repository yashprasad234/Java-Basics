public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }

    static int findPivot(int[] arr) {
        int st = 0, end = arr.length-1;
        while(st < end) {
            int mid = st + (end - st)/2;
            if(mid > 0 && arr[mid] < arr[mid-1] || mid <= arr.length-1 && arr[mid] > arr[mid+1])
                return arr[mid] < arr[mid-1] ? mid-1 : mid;
            if(arr[mid] > arr[0])
                st = mid + 1;
            else
                end = mid - 1;
        }
        return 0;
    }

    static int rotatedSearch(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(target == arr[pivot])
            return pivot;
        else if(target > arr[0] || pivot == 0)
            return bsearch(arr, target, pivot+1, arr.length-1);
        else
            return bsearch(arr, target, 0, pivot-1);
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

    static int search(int[] arr, int target) {
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] >= arr[0]) {  // To determine which half of the array we are in i.e, increasing half or decreasing half
                if(target < arr[mid] && target >= arr[st])
                    end = mid - 1;
                else
                    st = mid + 1;
            } else {
                if(target > arr[mid] && target <= arr[end])
                    st = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
