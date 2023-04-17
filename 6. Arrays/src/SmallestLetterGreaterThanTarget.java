//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreaterLetter(letters, 'k'));
    }
    
    static char nextGreaterLetter(char[] arr, char target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] <= target)
                st = mid + 1;
            else if(arr[mid] > target)
                end = mid - 1;
        }
        return arr[st % n];
    }
}
