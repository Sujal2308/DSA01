class Arrays2D{
  public static void main(String[] args){

    // creating 2d-array
    int[][] arr2d = new int[3][];
    arr2d[0] = new int[]{1,2,3,4};
    arr2d[1] = new int[]{5,6,7,8};
    arr2d[2] = new int[]{9,10,11,12};

    for(int i = 0 ;i<arr2d.length ; i++){
      for(int j = 0; j<arr2d[i].length ; j++){
        System.out.println(arr2d[i][j]);
      }
    }
  
  }
}