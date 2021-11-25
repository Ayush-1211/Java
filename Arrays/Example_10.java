package arrays;
public class Example_10 {
    public static void main(String[] args) {
        // Sorting an array
        
        String arr[] = {"python","java","c","php","angular","react"};
        
        java.util.Arrays.sort(arr);
        
        for(String x:arr){
            System.out.println(x);
        }
    }
}
