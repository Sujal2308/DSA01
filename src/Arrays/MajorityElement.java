class MajorityElement {
  // Moore voting algo
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(majorityElement(arr));

  }

  public static int majorityElement(int[] nums) {
    // Arrays.sort(nums);
    // return nums[nums.length/2];

    int count = 0;
    int initial = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        initial = nums[i];
        count = 1;
      } else if (nums[i] == initial) {
        count++;
      } else
        count--;
    }
    // int counter = 0;
    // for(int i = 0 ; i<nums.length ;i++){
    // if(nums[i]==initial){
    // counter++;
    // }
    // }
    // if(counter>nums.length/2){
    // return initial;
    // }
    // return -1;

    return initial;
  }
}