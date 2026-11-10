class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n -1;

        while(j>= 0){
            if(i >= 0 && nums1[i]> nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;

            }
            k--;
        }
    }
        // int [] newArr = new int[m+n];

    //     int i = 0;
    //     int j = 0; 
    //     int k = 0;

    //     while(i < m && j < n){
    //         if(nums1[i] <= nums2[j]){
    //             newArr[k] = nums1[i];
    //             i++;
    //         }
    //         else{
    //             newArr[k] = nums2[j];
    //             j++;   
    //         }
    //         k++;
    //     }
    //     while(i < m){
    //         newArr[k] = nums1[i];
    //         i++;
    //         k++;
    //     }
    //     while(j < n){
    //         newArr[k] = nums2[j];
    //         j++;
    //         k++;
    //     }
    //     for(int l = 0; l < newArr.length; l++){
    //         nums1[i] = newArr[k];
    //     }
    
}