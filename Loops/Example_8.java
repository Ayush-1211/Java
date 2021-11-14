package loops;
import java.util.*;
public class Example_8 {
    public static void main(String[] args) {
        // Check a number is palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int m=n;
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m){
            System.out.println("Its a palindrome number");
        }
        else{
            System.out.println("Its not a palindrome number");
        }
    }
}
