package methods;
public class Example_4 {
    // Overloaded method to reverse an int or array
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static int [] reverse(int A[]){
        int B[] = new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6};
        System.out.println("Reverse int: "+ reverse(123));
        System.out.println("Reverse array: "+reverse(A));
    }
}
