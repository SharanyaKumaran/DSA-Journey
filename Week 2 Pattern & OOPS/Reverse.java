public class Reverse {
  public static void main(String[] args) {
    int temp=2345,rev=0;
  while(temp>0){
          int last=temp%10;
          rev=rev*10+last;
          temp/=10;
      }
      System.out.print(rev);
}
  
}
