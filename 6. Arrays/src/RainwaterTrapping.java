public class RainwaterTrapping {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println(rainwater(arr));
    }

    static int rainwater(int[] arr) {
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        int max = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            rmax[i] = max;
        }
        max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            lmax[i] = max;
        }
        int water = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int high = Math.min(lmax[i], rmax[i]);
            water += (high - arr[i]);
        }
        return water;
    }
}
