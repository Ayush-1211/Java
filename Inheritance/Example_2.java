package inheritance;

class Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear is changed");
    }
}
class LuxuaryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void sunRoof(){
        System.out.println("Sun Roof is opened");
    }
}

public class Example_2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();
        System.out.println("-----------------");
        LuxuaryCar lc = new LuxuaryCar();
        lc.start();
        lc.accelerate();
        lc.changeGear();
        lc.sunRoof();
        System.out.println("-----------------");
        Car c2 = new LuxuaryCar();
        c2.start();
        c2.accelerate();
        c2.changeGear();
    }
}
