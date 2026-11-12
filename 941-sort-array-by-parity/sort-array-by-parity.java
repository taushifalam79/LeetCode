// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int i = -1;
//         int j = nums.length;
//         while(i < j){
//         // while(i<j && nums[i] % 2 == 0){
//         //     i++;
//         // }
//         // while(i < j && nums[j] % 2 != 0){
//         //     j--;
//         // }
//         do{
//             i++;
//         }while(i<j && nums[i] % 2 == 0);
//         do{
//             j--;
//         }while(i<j && nums[j] % 2 != 0);


//         if(i < j){
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             // i++;
//             // j--;
//         }
//         } 
//         return nums;
//     }
// }
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } 
            else if (nums[j] % 2 != 0) {
                j--;
            } 
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        return nums;
    }
}