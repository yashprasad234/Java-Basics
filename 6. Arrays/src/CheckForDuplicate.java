public class CheckForDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(hasDuplicate(arr));
    }

    static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i])
                    return true;
            }
        }
        return false;
    }
}
