// class Solution {
//     public int maxProfit(int[] prices) {
        
//         int minIndex = min(prices);
//         int maxIndex = max(prices);
//         if(maxIndex == -1){
//             return 0;
//         }
        
//         return prices[maxIndex] - prices[minIndex];  
//     }
//     public int max(int[] prices){
//         int MaxIndex = -1;
//         int minIndex = min(prices);
//         int max = Integer.MIN_VALUE;
//         for(int i = minIndex +1; i<prices.length ;i++){
//             if(prices[i] > max){
//                 max = prices[i];
//                 MaxIndex = i;
//             }
//         }
//         return MaxIndex;
//     }
//     public int min(int[] prices){
//         int MinIndex = -1;
//         int min = Integer.MAX_VALUE;
//         for(int i = 0; i < prices.length; i++){
//             if(prices[i] < min){
//                 min = prices[i];
//                 MinIndex = i;
//             }
//         }
//         return MinIndex;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i< prices.length; i++){
            minPrice = Math.min(minPrice , prices[i]);
            maxprofit = Math.max(maxprofit ,(prices[i] - minPrice));
            
        }
        return maxprofit;
    }
}
