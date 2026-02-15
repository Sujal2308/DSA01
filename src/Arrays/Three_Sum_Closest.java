class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            int p1 = i+1;
            int p2 = nums.length-1;
            while(p1<p2){
                int sum = nums[i] + nums[p1] +nums[p2];
                if(sum>target){
                    min = Math.min(min,sum);
                    p2--;
                }else{
                    
                 max = Math.max(max,sum);
                    
                    p1++;
                }
            }
        
        }
        if(max==Integer.MIN_VALUE){
            return min;
        }
        if(min==Integer.MAX_VALUE){
            return max;
        }
        int diff1= target-max;
        int diff2 = min-target;
        return diff1>diff2? min : max;
    }
}
