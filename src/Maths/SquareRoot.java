public class SquareRoot{
  public static void main(String[] args){
    int num = 18;
    System.out.println(sqrt(num));
  }
 static int sqrt(int num){
   for(int i = 1 ; i*i<=num ; i++){
     if(num%i==0 && num/i==i){
       return i;
     }
   }
   return -1;
 }
}