public class CountZero_rec {
  public static void main(String[] args) {
    int n=2300500;
    System.out.print(countDigit(n));
  }
  public static int countDigit(int n){
    
    
    if(n==0) return 0;
    if(n%10==0)
    return 1+countDigit(n/10);
    else{
      return countDigit(n/10);
    }
  }
}
