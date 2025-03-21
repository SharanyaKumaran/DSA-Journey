public class Arraytraverse_rec {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int n=arr.length;
    arrtra(arr,n,0);
  }
  public static void arrtra(int arr[],int n,int i){
  
    if(i==n)
    return ;
    System.out.print(arr[i]+" ");
  

    arrtra(arr,n,i+1);
  }
}
