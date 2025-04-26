class ExtractionOfDigits{
  public static void main(String[] args){
    int num =123456789;
    extractDigits(num);
  
  }
  static void extractDigits(int num){
    while (num>0){
      int lastDigit = num %10;
      System.out.println(lastDigit);
      num = num/10;
    }
  }
}