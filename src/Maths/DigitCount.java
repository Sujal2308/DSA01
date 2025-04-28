class DigitCount{
  public static void main(String[] args){
    int num =123456789;
    System.out.println(CountDigits(num));

  }
  static int CountDigits(int num){
   int count = Math.log10(num)+1;
     return count;
  }
}