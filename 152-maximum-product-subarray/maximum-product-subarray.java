// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxProduct = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++){
//             int product = 1;
//             for(int j = i; j < nums.length; j++){
//                 product = product * nums[j];
//                 maxProduct = Math.max(product, maxProduct);
//             }
            
//         }
//         return maxProduct;
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];
        
        for(int i = 1; i< nums.length; i++){
            if(nums[i] < 0 ){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            answer = Math.max(maxProduct, answer);  
        }
        return answer;
    }
}
 
