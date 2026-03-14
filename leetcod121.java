public class leetcod121 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxValue = Math.max(maxValue, price - minPrice);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
