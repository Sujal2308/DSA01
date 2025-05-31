public class AllPrimeFactors {
  public static void main(String[] args) {
    int num = 13;
    primeFactors(num);
  }

  static void primeFactors(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        boolean isPrime = isPrime(i);
        boolean isPrime2 = isPrime(num / i);
        if (isPrime) {
          System.out.println(i);
        }
        if(isPrime2 && num/i!=i){
          System.out.println(num/i);
        }
      }

    }

  }

  // i*i<=n is better than i<=Math.sqrt(n)
  static boolean isPrime(int num) {
    for (int i = 2; i*i <= n; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}