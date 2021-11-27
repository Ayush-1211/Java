package methods;
public class Object_Passing_1 {
    
    static void change(int A[], int index, int value){
        A[index] = value;
    }
    public static void main(String[] args) {
        int A[] = {2,3,6,5,7,9,30};
        change(A,2,10);
        for(int x:A){
            System.out.print(x+", ");
        }
        System.out.println("");
    }
}
