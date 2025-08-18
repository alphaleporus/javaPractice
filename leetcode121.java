public class leetcode121 {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i =1; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        int solution = maxProfit(prices);
        System.out.println(solution);
    }
}
