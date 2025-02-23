// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n1=sc.nextInt();
        sc.close();
        switch(n1){
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        default:
            System.out.print("Invalid");
            break;
        }
    }
}
