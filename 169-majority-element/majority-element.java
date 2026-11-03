// Brute force 

// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
        
//         for(int i = 0; i < n; i++){
//             int count = 0;
//             for(int j = 0; j < n; j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//             }
//             if (count > n/2){
//             return nums[i];
//             }
//         }
        
//         return -1;
//     }
// }

// applied optimal solution 

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int i = 0; i < nums.length; i++){
            if (count == 0){
                candidate = nums[i];
            }

            if (candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }

        }
        return candidate;
    }
}