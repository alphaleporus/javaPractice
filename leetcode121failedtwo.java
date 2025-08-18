public class leetcode121failedtwo {
    public static int maxProfit(int[] prices) {
        int maxProfit =0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i ; j < prices.length ; j++){
                maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        int solution = maxProfit(prices);
        System.out.println(solution);
    }
}
