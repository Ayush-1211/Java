package inheritance;

class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class Display");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();
        
        Sub sb = new Sub();
        sb.display();
        
        Super su2 = new Sub();  // Dynamic Method Dispatch
        su2.display();
        
    }
}
