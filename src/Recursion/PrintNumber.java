class PrintNumber{
  public static void main(String[] args){
    int num = 10;
    printValues(1,num);
  }
  static void printValues(int start,int end){
    if(start>end){
      return;
    }
    printValues(start,end-1);
    System.out.println(end); //backtracking
  }
}