package arrays;
public class Example_1 {
    public static void main(String[] args) {
        // Finding sum of given numbers
        
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println("Sum is: "+sum);
    }
}