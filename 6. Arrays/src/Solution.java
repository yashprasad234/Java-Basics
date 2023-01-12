//import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-4,-1,-2,-1,-5,-3,-7};
    }

    static int rainWater(int[] arr) {
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        lmax[0] = 0;
        lmax[1] = arr[0];
        for (int i = 2; i < arr.length; i++) {
            lmax[i] = Math.max(lmax[i-1], arr[i-1]);
        }
        rmax[arr.length-1] = 0;
        rmax[arr.length-2] = arr[arr.length-1];
        for (int i = arr.length-3; i >= 0; i--) {
            lmax[i] = Math.max(lmax[i+1], arr[i+1]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Math.min(lmax[i], rmax[i]);
            ans += min - arr[i] > 0 ? min - arr[i] : 0;
        }
        return ans;
    }
}
