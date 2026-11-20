class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;

        int [] prefixArr  = new int[nums.length];
        int [] suffixArr = new int[nums.length];
        int [] answer = new int[nums.length];
        prefixArr[0] = 1;
        suffixArr[nums.length-1] = 1;
        
        for(int i = 1; i <= nums.length-1; i++){
            prefix = prefix * nums[i-1];
            prefixArr[i] = prefix;
        }
        for(int i = nums.length-2; i >= 0; i--){
            suffix = suffix * nums[i+1]; 
            suffixArr[i] = suffix;
        }
        for(int i = 0; i<= nums.length-1; i++ ){
            answer[i] = prefixArr[i] * suffixArr[i];
        }
        return answer;
    }
}