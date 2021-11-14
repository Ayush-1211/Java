package loops;
import java.util.*;
public class Example_1 {
    public static void main(String[] args) {
        // Display multiplication table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
