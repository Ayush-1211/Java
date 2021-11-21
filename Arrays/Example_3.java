package arrays;
public class Example_3 {
    public static void main(String[] args) {
        // Finding maximum number
        
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int max = A[0];
        
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}
