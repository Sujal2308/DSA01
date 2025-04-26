class ReverseInteger{
  public static void main(String[] args){
    int num =-123456789;
    System.out.println(reverse(num));
  }
  static int reverse(int num){
    int reverse = 0;
    while(num!=0){
      int lastDigit = num %10;
      reverse = reverse * 10 + lastDigit;
      num = num/10;
    }
    return reverse;
  }
}