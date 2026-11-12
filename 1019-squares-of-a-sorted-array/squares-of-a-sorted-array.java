class Solution {
    public int[] sortedSquares(int[] nums) {
        int k = 0;
        // int result [] = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            nums[k] = nums[i]*nums[i];
            k++;
        }
        Arrays.sort(nums);
        return nums;
    }
}