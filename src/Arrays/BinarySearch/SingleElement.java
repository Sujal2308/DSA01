class SingleElement{
  // Given a sorted array consisting of only integers where every element appears exactly twice except for one element which appears exactly once. Find this single element that appears only once.
  
  //Leetcode 540
    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr));
    }
    static int singleElement(int[] arr){
      // using linear search
      for(int i = 0 ; i<nums.length ; i++){
        if(i!= nums.length-1 && nums[i]==nums[i+1]){

            i++;

        }else{
            return nums[i];
        }


      }
      return nums[nums.length-1];
    }
}