package methods;
public class Method_Overloading {
    static int max(int x, int y){
        return x>y?x:y;
    }
    static float max(float x, float y){
        if(x>y)
          return x;
        else
          return y;
    }
    public static void main(String[] args) {
        System.out.println(max(10,15));
        System.out.println(max(12.4f,12.5f));
    }
}
