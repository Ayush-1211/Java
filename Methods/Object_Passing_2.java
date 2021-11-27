package methods;
public class Object_Passing_2 {
    
    static void change(int A[], int index, int value){
        A[index] = value;
    }
    static void change2(int x, int value){
        x = value;
    }
    public static void main(String[] args) {
        int A[] = {2,3,6,5,10,7,9,30};
        change(A,2,10);
        for(int x:A){
            System.out.print(x+", ");
        }
        System.out.println("");
        
        int x = 10;
        change2(x,40);  // It will not change actual value of array
        System.out.println("Value of primitive: " + x);
    }
}
