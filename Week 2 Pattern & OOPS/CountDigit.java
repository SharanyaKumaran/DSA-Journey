import java.util.*;
public class CountDigit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    sc.close();
    int count=0;

    while(num>0){
      count++;
      num/=10;
    }
    System.out.println("The total no of digits: "+count);
  }
  
}
