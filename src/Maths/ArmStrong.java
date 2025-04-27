class ArmStrong {
  public static void main(String[] args){
    int num =153;
    System.out.println(isArmStrong(num));
  }
  static boolean isArmStrong(int num){
    int sum = 0;
    int original = num;
    while(num>0){
      int lastDigit = num %10;
      sum = sum + lastDigit*lastDigit*lastDigit;
      num = num/10;
    }
    return sum == original;
  }
}