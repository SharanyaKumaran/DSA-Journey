// Write a program which takes two values x and y. Prints x for y number of times.
import java.util.*;
class xytimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        sc.close();
        for(int i=0;i<y;i++){
            System.out.println(x);
        }
    }
}
