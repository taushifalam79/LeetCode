// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length -1;
//         while(left < right){
//             int sum = nums[left] + nums[right];
//             if(sum == target){
//                 return new int[]{left , right};
//             }
//             else if(sum < target){
//                 left++;
//             }else{
//                 right--;
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                int sum = nums[i]+ nums[j];
                if(sum == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
