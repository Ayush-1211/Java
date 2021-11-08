package conditional;
import java.util.*;
public class Example_2 {
    public static void main(String[] args) {
        // Young or not
        
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        
        if(age>=14 && age<=55){
            System.out.println("You are young!!!!");
        }
        else if(age<=14 && age>=0){
            System.out.println("You are child!!!");
        }
        else{
            System.out.println("You are not young!!!!");
        }
    }
}
