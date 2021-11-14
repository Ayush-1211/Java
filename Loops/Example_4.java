package loops;
import java.util.*;
public class Example_4 {
    public static void main(String[] args) {
        // Display digit of number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int r;
        while(n>0){
            r = n % 10;
            n = n / 10;
            System.out.println(r);
        }
    }
}
