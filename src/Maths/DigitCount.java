class DigitCount{
  public static void main(String[] args){
    int num =123456789;
    System.out.println(CountDigits(num));

  }
  static int CountDigits(int num){
    int count = 0;
    while (num>0){
      num = num/10;
      count++;
    }
    return count;
  }
}