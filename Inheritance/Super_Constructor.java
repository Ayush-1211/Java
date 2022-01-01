package inheritance;
class Parent{
    Parent(){
        System.out.println("Non-Param of Parent");
    }
    Parent(int x){
        System.out.println("Param of Parent "+x);
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Non-Param of Child");
    }
    Child(int y){
        System.out.println("Param of Child");
    }
    Child(int x, int y){
        super(x);   // This must be the first line
        System.out.println("2 Param of Child "+y);
    }
}
public class Super_Constructor {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("");
        Child c2 = new Child(10);
        System.out.println("");
        Child c3 = new Child(10,20);
    }
}
