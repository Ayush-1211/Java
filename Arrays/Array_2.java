package arrays;
public class Array_2 {
    public static void main(String[] args) {
        int B[] = {1,2,3,4,5};
        
        for(int i=0; i<B.length;i++){
            System.out.println(B[i]++);
        }
        
        System.out.println("");
        for(int x:B){
            System.out.println(x);
        }
    }
}
