class PrintDivisors{
  public static void main(String[] args){
    int num = 36;
    printDivisors(num);
  }
  static void printDivisors(int num){
    for(int i = 1 ; i<=(int)Math.sqrt(num) ; i++){
      if(num % i == 0){
        System.out.println(i);
        if(i != num/i){
          System.out.println(num/i);
        }
      }
    }
  }
}
