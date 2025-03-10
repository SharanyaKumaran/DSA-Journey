import java.util.*;
class ChangeValue{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    Change(n,arr,x);
    for(int i=0;i<n;i++){
    System.out.print(arr[i]);
    }
    sc.close();
  }
  public static void Change(int n,int arr[],int x){

    for(int i=0;i<n;i++){
      arr[i]=x+arr[i];
    }
   
    }
}
