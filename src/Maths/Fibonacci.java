public class Fibonacci {
  public static void main(String[] args) {
    int num = 10;
    fibonacci(num);
  }

  static void fibonacci(int num) {
    int prev = 0;
    int current = 1;
    System.out.println(prev);
    System.out.println(current);
    for (int i = 2; i < num; i++) {
      int next = prev + current;
      System.out.println(next);
      prev = current;
      current = next;
    }
  }
}