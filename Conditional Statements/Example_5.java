package conditional;
import java.util.*;
public class Example_5 {
    public static void main(String[] args) {
        // Find a given year is leap year or not
        Scanner sc = new Scanner(System.in);
        
        int year;
        System.out.println("Enter year: ");
        year = sc.nextInt();
        
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");   
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
