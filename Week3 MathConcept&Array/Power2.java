import java.util.Scanner;

public class Power2 {
    
    public static boolean isPowerofTwo(int n) {
        // Efficient method using bitwise operation
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); 
        
        if (isPowerofTwo(n)) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
