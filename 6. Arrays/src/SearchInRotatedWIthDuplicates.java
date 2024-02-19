public class SearchInRotatedWIthDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(search(arr, 1));
    }

//  In this question find out which side of mid is sorted and write the if condition for when the item is in the
//  sorted side from mid then there will be no problemo
    static boolean search(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return true;

            // left side of mid is sorted (mid is also part of the sorted array half)
            if(arr[mid] > arr[st] || arr[mid] > arr[end]) {
                // end = mid - 1;
                if(target < arr[mid] && target >= arr[st])
                    end = mid - 1;
                // st = mid + 1;
                else
                    st = mid + 1;
            }
            // right side of mid is sorted (mid is also part of the sorted array half)
            else if(arr[mid] < arr[st] || arr[mid] < arr[end]) {
                // st = mid + 1;
                if(target > arr[mid] && target <= arr[end])
                    st = mid + 1;
                // end = mid - 1;
                else
                    end = mid - 1;
            }
            // when arr[mid] == arr[st] == arr[end]
            else {
                end--;
            }
        }
        return false;
    }
}
