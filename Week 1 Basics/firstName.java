// Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
import java.util.*;
class firstName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int t=sc.nextInt();
        
        
        sc.close();
        for(int i=0;i<t;i++){
            System.out.println(firstName+lastName);
        }
    }
}
