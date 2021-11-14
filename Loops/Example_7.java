package loops;
import java.util.*;
public class Example_7 {
    public static void main(String[] args) {
        // Reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int r;
        int rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse number is = "+rev);
    }
}
