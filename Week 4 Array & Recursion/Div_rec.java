import java.util.Scanner;

public class Div_rec {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    System.out.println("The Divisor of "+n);
    dividorNum(n,1);
    
  }
  public static void dividorNum(int num,int i){
    if(i*i>num)
    return ;
    if(num%i==0)
    System.out.print(i+" ");
    if(i!=num/i)
    System.out.print(num/i+" ");
    dividorNum(num,i+1);
  }
}
