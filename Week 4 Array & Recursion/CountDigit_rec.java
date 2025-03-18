public class CountDigit_rec {
  public static void main(String[] args) {
    int n=2345678;
    System.out.print(countDigit(n));
  }
  public static int countDigit(int n){
    
    if(n==0)
    return 0;

    return 1+countDigit(n/10);
  }
}
