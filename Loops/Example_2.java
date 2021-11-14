package loops;
import java.util.*;
public class Example_2 {
    public static void main(String[] args) {
        // Find sum of n numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of "+n+" number is = "+sum);
    }
}
