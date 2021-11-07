package conditional;
public class If_Else_2 {
    public static void main(String[] args) {
        int a=5,b=15,c=4;
        
        if(a>b && a>c) {
            System.out.println("A is Maximum: " + a);
        }
        else if(b>c) {
            System.out.println("B is Maximum: " + b);
        }
        else {
            System.out.println("C is Maximum: " + c);
        }
    }
}
