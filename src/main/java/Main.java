// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
   int num =123456789;
    while (num>0){
      int lastDigit = num %10;
      System.out.println(lastDigit);
      num = num/10;
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}