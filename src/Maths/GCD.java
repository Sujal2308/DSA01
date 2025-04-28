//   GCD = Greatest Common Divisor or HCF = Highest Common Factor
class GCD{
  public static void main(String[] args){
    int a = 18;
    int b = 12;
    System.out.println(gcd(a,b));
  }
  static int gcd(int num1, int num2){
   while(num1>0 && num2>0){
     if(num1>num2){
       num1 = num1 % num2;
     }else{
       num2 = num2 % num1;
     }
   }
    if(num1==0){
      return num2;
    }
    return num1;
}
}