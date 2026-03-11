class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Double.MIN_VALUE;
        double sum = 0;
        int low = 0;
        int high = k;

        for(int i = low ; i<high ; i++){
            sum = sum + nums[i];
        }

        avg = sum/k;

      while(high<nums.length){
        sum = sum + nums[high] - nums[low];
        
        if(sum/k>avg){
            avg = sum/k;
        }
        low++;
        high++;
      }
      return avg;

    }
}
