class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            int temp = nums[i];
            int reverse = 0;

            while(temp > 0 ){
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }
            set.add(reverse);
        }
        return set.size();

    }
}