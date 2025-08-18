public class leetcode121failed {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        for (int price : prices) {
            min = Math.min(min, price);
        }
        for(int x = 0; x< prices.length ;x++){
            if(prices[x]==min){
                minIndex=x;
                break;
            }
        }
        for(int j = minIndex; j < prices.length; j++){
            max = Math.max(max, prices[j]);
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] prices = {2,4,1};
        int solution = maxProfit(prices);
        System.out.println(solution);
    }
}
