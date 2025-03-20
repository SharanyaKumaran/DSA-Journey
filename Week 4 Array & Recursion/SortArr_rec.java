public class SortArr_rec {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int n=arr.length;
    boolean sumAr=arrtra(arr,n,0);
    System.out.println(sumAr);
  }
  public static boolean arrtra(int arr[],int n,int i){
    if(i>=n-1)
    return true;
    if(arr[i]>arr[i+1])
    return false;

    return arrtra(arr,n,i+1);
  }
}
