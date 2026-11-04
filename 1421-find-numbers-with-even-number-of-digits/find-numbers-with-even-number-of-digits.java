class Solution {
    public int findNumbers(int[] nums) {
        int evenNumberDigits = 0;
        for(int i = 0; i < nums.length; i++){

            int num = nums[i];
            int count = 0;
            while(num != 0){
                // int digit = nums[i] % 10;
                count++;
                num = num / 10;
            }
            if(count % 2 == 0){
                evenNumberDigits++;
            }
        }
        return evenNumberDigits;
    }
}