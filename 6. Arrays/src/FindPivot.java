public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr) {
        int ind = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i])
                return i+1;
        }
        return -1;
    }
}
