class PrimeNo{
  public static void main(String[] args){
    int num = 38;
    System.out.println(isPrime(num));
  }
  static boolean isPrime(int num){
    // Brute Force
    // if(num==2){
    //   return true;
    // }
    // for(int i = 2 ; i<num ; i++){
    //   if(num % i == 0){
    //     return false;
    //   }
    // }
    // return true;

    // Optimal Solution
    for(int  i= 2 ; i*i<=num ; i++){
      if(num<=1){
        return false;
      }
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
}