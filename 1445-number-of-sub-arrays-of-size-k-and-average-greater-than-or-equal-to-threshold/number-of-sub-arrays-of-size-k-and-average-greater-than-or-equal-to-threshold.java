class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int windowSum = 0;
        int avg;
        for(int i = 0; i< k; i++){
            windowSum += arr[i]; 
        }
        avg = windowSum/k;
        if(avg >= threshold){
            count++;
        }

        for(int j = k; j < arr.length; j++){
            windowSum += arr[j] - arr[j-k];
            avg = windowSum/k;
            if(avg >= threshold){
                count++;
            }
        }
        return count;
        
    }
}