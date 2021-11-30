package methods;
public class Variable_Arguments_1 {
    static void show(int ...A){
        for(int x:A){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show();
        System.out.println("");
        show(10);
        System.out.println("");
        show(10,20,30);
        System.out.println("");
        show(new int[] {3,5,7,9,11});
    }
}
