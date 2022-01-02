package inheritance;

class Super{
    public void meth1(){
        System.out.println("Super Method 1");
    }
    public void meth2(){
        System.out.println("Super Method 2");
    }
}
class Sub extends Super{
    @Override
    public void meth2(){
        System.err.println("Sub Method 2");
    }
    public void meth3(){
        System.out.println("Sub Method 3");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        /*Super sup = new Super();
        sup.meth1();
        sup.meth2();
        System.out.println("------------------");
        Sub sb = new Sub();
        sb.meth1();
        sb.meth2();
        sb.meth3();
        System.out.println("-------------------");*/
        Super sup2 = new Sub();
        sup2.meth1();
        sup2.meth2();
    }
}
