// Write a program to take x and print multiples of x till 1000.
import java.util.*;
class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        
        
        sc.close();
        for(int i=x;i<=1000;i=i+100){
            System.out.println(i);
        }
    }
}
