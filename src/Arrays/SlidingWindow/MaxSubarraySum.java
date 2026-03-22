class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = k-1;
        int sum = 0;
        for(int i = 0 ; i<=high ; i++){
        
            sum = sum + arr[i];
            
        }
        
        while(high<arr.length){
            max = Math.max(sum,max);
            
            low++;
            high++;
            
            if(high==arr.length){
                
                break;
            }
            sum  = sum - arr[low-1] + arr[high];
        }
        return max;
    }
}
