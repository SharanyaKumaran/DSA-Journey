import java.util.Scanner;

public class ReverseWord {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] arr=str.split(" ");
    StringBuilder res=new StringBuilder();
    for(int i=0;i<arr.length;i++){
      String word=arr[arr.length-i-1];
      if(i%2==0){
        res.append(word.toLowerCase());
      }else{
      res.append(word.toUpperCase());
      }
      if(i<arr.length-1){
        res.append(" ");
      }

    }
    System.out.println(res);
    sc.close();
  }
}
