public class firstDigit {
  public static void main(String[] args) {
    int temp=2345,firstDigit=0;
  while(temp>0){
          int last=temp%10;
          temp/=10;
          if(temp==0){
            firstDigit=last;
          }
      }
      System.out.print(firstDigit);
}
  
}
