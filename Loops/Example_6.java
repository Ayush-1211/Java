package loops;
import java.util.*;
public class Example_6 {
    public static void main(String[] args) {
        // Finding number is Armstrong or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int m=n;
        int sum=0;
        int r;
        
        while(n>0){
            r = n % 10;
            n = n / 10;
            sum = sum + r*r*r;
        }
        if(sum == m){
            System.out.println("Its a Armstrong Number");
        }
        else{
            System.out.println("Its not a Armstrong Number");
        }
    }
}
