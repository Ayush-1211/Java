/** Constructors have a same name as a class name
 * It will not have any return type
 * It is call automatically whenever we are creating an object
 * 1. Parameterized constructor
 * 2. Non-parameterized constructor
 **/
package object.oriented.programming;

class Rectangle{
    private double length;
    private double breadth;
    public Rectangle(){
        length = 1;
        breadth = 1;
    }
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public Rectangle(double s){
        length=breadth=s;
    }
}

public class Constructor_1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();  // Non-parameterized constructor
        Rectangle r2 = new Rectangle(10,5);
        Rectangle r3 = new Rectangle(10);
    }
}
