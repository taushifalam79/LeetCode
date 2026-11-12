// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int n = nums.length -1;
//         Arrays.sort(nums);
//         return nums[n-k+1];

//     }
// }
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums,0,nums.length-1,nums.length-k);
    }
    public int quickSort(int [] nums, int low, int high, int target){
        if(low == high){
            return nums[low];
        }
        int pi = partition(nums,low,high);
        if(target <= pi){
            return quickSort(nums,low,pi,target );
        }else{
            return quickSort(nums,pi+1, high, target);
        }
    }
    public int partition(int [] nums , int low, int high){
        int i = low-1;
        int j = high+1;
        int pi = nums[low];

        while(true){
            do{
                i++;
            }while(nums[i] < pi);

            do{
                j--;
            }while(nums[j] > pi);

            if(i >= j){
                return j;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}