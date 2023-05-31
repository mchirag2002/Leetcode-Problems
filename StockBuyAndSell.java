public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[] = {2,4,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int max_profit = -1;
        int min = 0;
        int max = 0;
        if(prices.length==1)
        {
            return 0;
        }
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[max])
            {
                max = i;
            }
            if(prices[min]>prices[i])
            {
                min = i;
            }
            if(min>max)
            {
                max = min;
            }
            if(prices[max]-prices[min]>max_profit && min<=max)
            {
                max_profit = prices[max] - prices[min];
            }
        }
        return max_profit;
    }
}
