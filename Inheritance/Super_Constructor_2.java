package inheritance;

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length=breadth=1;
    }
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        height = h;
    }
    Cuboid(int l,int b,int h){
        super(l,b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }
}

public class Super_Constructor_2 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        System.out.println(c.volume());
        System.out.println("");
        Cuboid c2 = new Cuboid(10);
        System.out.println(c2.volume());
        System.out.println("");
        Cuboid c3 = new Cuboid(5,3,10);
        System.out.println(c3.volume());
    }
}
