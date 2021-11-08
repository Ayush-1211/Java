package conditional;
import java.util.*;
public class Example_1 {
    public static void main(String[] args) {
        // Find number is odd or even
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        
        if(n%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
        
    }
}
