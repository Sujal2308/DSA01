public class Factorial {
  public static void main(String[] args) {
    System.out.println(factorial(4));

  }

  static int factorial(int num) {
    if (num == 0) {
      return 1;
    }
    int fact = 1;
    while (num > 0) {
      fact = fact * num;
      num--;
    }
    return fact;
  }
}