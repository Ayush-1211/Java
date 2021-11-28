package methods;
public class Parameter_Passing_1 {
    // Call by value (But in java we can only say 'Parameter Passing')
    static int add(int x, int y){   // Formal Parameters
        int z;
        z = x + y;
        return z;
    }
    public static void main(String[] args) {
        int a=10,b=15,c;
        c=add(a,b);     // Actual Parameters
        System.out.println(c);
    }
}
