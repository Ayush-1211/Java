package conditional;
import java.util.*;
public class Example_10 {
    public static void main(String[] args) {
        // Make a menu driven program for Arithmetic Operation
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        
        System.out.println("Enter 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words: ");
        String option = sc.nextLine();
        option = option.toUpperCase();
        
        switch(option){
            case "ADD":
                System.out.println("Addition of " + x + " and " + y +" is: " + (x+y));
                break;
            case "SUB":
                System.out.println("Subtraction of " + x + " and " + y +" is: " + (x-y));
                break;
            case "DIV":
                System.out.println("Division of " + x + " and " + y +" is: " + (x/y));
                break;
            case "MUL":
                System.out.println("Multiplication of " + x + " and " + y +" is: " + (x*y));
                break;
            default:
                System.out.println("Invalid Option!!!");
                break;
        }
        
    }
}
