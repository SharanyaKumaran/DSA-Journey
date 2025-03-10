import java.util.*;
class SumArray{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(SumArr(n,arr));
    sc.close();
  }
  public static int SumArr(int n,int arr[]){
    int sum=0;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
      return sum;
    }
}