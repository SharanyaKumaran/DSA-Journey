
import java.util.*;
class RankArray{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Rank(n,arr);
    sc.close();
  }
  public static void Rank(int n,int arr[]){
    
    int[] dupli=arr.clone();
    Arrays.sort(dupli);
    HashMap<Integer,Integer> mapp=new HashMap<>();
    int rank=1;
    for(int num:dupli){
      if(!mapp.containsKey(num)){
        mapp.put(num,rank++);

      }
    }
    for(int i=0;i<n;i++){
      arr[i]=mapp.get(arr[i]);
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    }
}