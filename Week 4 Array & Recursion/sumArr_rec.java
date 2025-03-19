public class sumArr_rec {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int n=arr.length;
    int sumAr=arrtra(arr,n,0);
    System.out.println(sumAr);
  }
  public static int arrtra(int arr[],int n,int i){
    if(i==n)
    return 0;

    return arr[i]+arrtra(arr,n,i+1);
  }
}
