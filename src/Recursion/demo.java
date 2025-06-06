public class demo{
  // print numbers from 1 to 10 via loop
  public static void main(String[] args){
    // for(int i = 1 ;i<=10 ; i++){
    //   System.out.println(i);
    // }
    printNo(0);
  }
  static void printNo(int start){
    if(start==40){
      System.out.println(start);
     return;
    }
    System.out.println(start);
    printNo(start+2);

  }
}