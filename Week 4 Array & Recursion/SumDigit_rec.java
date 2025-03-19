public class SumDigit_rec {
  public static void main(String[] args) {
    int n=123;
    System.out.print(countDigit(n));
  }
  public static int countDigit(int n){
    
    if(n==0)
    return 0;

    return n%10+countDigit(n/10);
  }
}
