import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angle1=sc.nextInt();
        int angle2=sc.nextInt();
        int angle3=sc.nextInt();
        sc.close();
        int sum=angle1+angle2+angle3;
        if(sum==180){
        System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot be formed");
            
        }
    }
}
