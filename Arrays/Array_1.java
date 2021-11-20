package arrays;
public class Array_1 {
    public static void main(String[] args) {
        int A[] = new int[5];  // Method 1
        
        int B[] = {1,2,3,4,5};  // Method 2
        
        int C[];
        C = new int[10];    // Method 3
        
        int[] D = new int[10];  // Method 4
        
        B[2] = 15;
        
        System.out.println("Method 1:");
        for(int i=0; i<A.length;i++){
            System.out.println(A[i]);
        }
        
        System.out.println("Method 2:");
        for(int i=0; i<B.length;i++){
            System.out.println(B[i]);
        }
        
        System.out.println("For Each Loop: ");
        for(int x:B){
            System.out.println(x);
        }
    }
    
}
