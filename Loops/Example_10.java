package loops;
import java.util.*;
public class Example_10 {
    public static void main(String[] args) {
        // Displya AP series (AP - Arithmetic Progression)
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n: ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int term = a;
        for(int i=0;i<n;i++){
            System.out.print(term+", ");
            term=term+d;
        }
    }
}
