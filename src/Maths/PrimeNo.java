class PrimeNo{
  public static void main(String[] args){
    int num = 2;
    System.out.println(isPrime(num));
  }
  static boolean isPrime(int num){
    if(num==2){
      return true;
    }
    for(int i = 2 ; i<7 ; i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
}