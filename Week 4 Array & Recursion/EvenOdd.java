import java.util.*;
class EvenOddy{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Countno(n,arr);
    sc.close();
  }
  public static void Countno(int n,int arr[]){
    int evenC=0,oddC=0;
    for(int i=0;i<n;i++){
      if(arr[i]%2==0)
      {
        evenC++;
      }
      else{
      oddC++;}
    }
    System.out.println("EvenCount: "+evenC+"  "+"OddCount:" +oddC);
    }
}
