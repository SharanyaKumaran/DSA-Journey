import java.util.*;
public class OddDigit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    sc.close();
    int odd=0;

    while(num>0){
      int last=num%10;
      if(last%2!=0){
        odd++;
      }
      num/=10;
    }
    System.out.println("The no of odd digits: "+odd);
  }
  
}
