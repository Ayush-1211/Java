package methods;
public class Methods_3 {
    
    static void inc(int x){
        x++;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        int a=10;
        inc(a);        
        System.out.println(a);      // Inc() cannot change actual value of 'a'
    }
}
