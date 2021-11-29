package methods;
public class Example_5 {
    // Overloaded method to validate name and age
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>=5 && age<=50;
    }
    public static void main(String[] args) {
        System.out.println("Name: "+validate("Ayush"));
        System.out.println("Age: "+validate(60));
    }
}
