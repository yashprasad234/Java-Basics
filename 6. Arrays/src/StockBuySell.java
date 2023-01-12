public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7,2,5,3,6,4,1,8};
        System.out.println(profit(arr));
    }

    static int profit(int[] arr) {
        int buy = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < buy)
                buy = arr[i];
            profit = Math.max(profit, arr[i] - buy);
        }
        return profit;
    }
}
