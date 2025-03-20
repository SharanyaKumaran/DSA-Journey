import java.util.Scanner;

public class Power_rec {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pow=sc.nextInt();
    sc.close();
    System.out.println("The Power of "+n+" is " +powNum(n, pow));
    
    
  }
  public static int powNum(int num,int i){
    if(i==0)
    return 1 ;
    
    return num*powNum(num,i-1);
  }
}
