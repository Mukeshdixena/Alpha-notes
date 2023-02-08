package Array;

public class A09_maxProfit {
    static int maxProfit(int prices[]) {
        int mp = 0;
        int bp = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (bp < prices[i]) {
                int profit = prices[i] - bp;
                mp = mp > profit ? mp : profit;
            } else {
                bp = prices[i];
            }
        }

        return mp;
    }
}
