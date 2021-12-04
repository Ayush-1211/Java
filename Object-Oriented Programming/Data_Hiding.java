package object.oriented.programming;

class Rectangle{
    private double length;
    private double breadth;

    public double getLength(){  //Getter method
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    
    public void setLength(double l){    //Setter method
        if(l>=0)
            length = l;
        else
            length = 0;
    }
    public void setBreadth(double b){
        if(b>=0)
            breadth = b;
        else
            breadth = 0;
    }
    
    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}
public class Data_Hiding {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10.5);
        r.setBreadth(5.5);
        
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Is it a square? : "+r.isSquare());
        
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
    }
}
