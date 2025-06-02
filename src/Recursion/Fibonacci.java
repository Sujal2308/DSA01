class Fibonacci{
  public static void main(String[] args){
    int num = 4;
    System.out.println(fibo(num));
  }
  static int fibo(int n){
    if(n<=1){
      return n;
    }
    return fibo(n-1)+fibo(n-2); // multiple recursive calls
  }
}