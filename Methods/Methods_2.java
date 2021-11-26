package methods;
public class Methods_2 {
    
    int max(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    
    public static void main(String[] args) {
        int a=10,b=15;
        Methods_2 mp = new Methods_2();
        System.out.println(mp.max(a, b));
    }
}
