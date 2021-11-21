package arrays;
import java.util.*;

public class Example_2 {
    public static void main(String[] args) {
        // Finding an element
        Scanner sc = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int key;
        System.out.println("Enter Key: ");
        key = sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println("Element at index: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found!!!");
    }
}
