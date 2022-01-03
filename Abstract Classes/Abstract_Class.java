package pkgabstract.classes;

abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Method 1 of Super");
    }
    abstract public void meth2();
}
class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Method 2 of Sub");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        // We cannot create object of Abstract Class
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
    
}
