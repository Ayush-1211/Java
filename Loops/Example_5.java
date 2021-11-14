package loops;
import java.util.*;
public class Example_5 {
    public static void main(String[] args) {
        // Count digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int count=0;
        
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Total digits = "+count);
    }
}
