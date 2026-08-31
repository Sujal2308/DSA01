public class maxSumOfSubarrayOfSizeK {
    public static void main(String[] args) {
        System.out.println(new int[]{100,200,300,400,500},2);
    }
      public static int maxSubarraySum(int[] arr, int k) {
        // Code here
     
     int max = Integer.MIN_VALUE;
     int sum = 0;
     int low = 0 ;
     int high = 0;
     
     for(;high<k;high++){
         sum+=arr[high];
     }
     max = Math.max(max,sum);
     
     while(high<arr.length){
         sum = sum + arr[high] - arr[low];
         max = Math.max(max,sum);
         low++;
         high++;
     }
     
     return max;
     
    }
}
