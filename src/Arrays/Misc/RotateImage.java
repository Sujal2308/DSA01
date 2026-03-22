class RotateImage{
  // Rotate by 90 degrees
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
  static void rotate(int[][] matrix) {
    //Time Complexity: O(n^2)
    //Space Complexity: O(n^2)
        int n = matrix.length;
        int[][] newArr = new int[n][n];
        int len = newArr.length;
        int k = 0;

        for(int i = 0 ; i<n ; i++){ // row
          for(int j = 0 ; j<n ; j++){ //col
              newArr[k][len-1]= matrix[i][j];
              k++;
          }
          len--;
          k=0;
        }  

        for(int i = 0; i<n ; i++){
          for (int j = 0 ; j<n ; j++){
              matrix[i][j] = newArr[i][j];
          }
        }           
  }
}