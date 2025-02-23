// Write a program using switch case which takes a value and prints the respective Size.
//If size is 29 then its smallgiven values for the angles.
import java.util.*;
class Size {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        sc.close();
        
        switch(size){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break; 
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid");
            
        }
    }
}
