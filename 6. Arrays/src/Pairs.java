public class Pairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        pairs(arr);
    }

    static void pairs(int[] arr) {
        int tp = ((arr.length)*(arr.length-1))/2;
        System.out.println("Number of unique pairs that can be formed using the elements in the array is : " + tp);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
        return;
    }
}
