package methods;
public class Parameter_Passing_2 {
    // Call by reference (But in java we can only say 'Parameter Passing')
    static void welcome(String n){
        System.out.println("Welcome "+n);
    }
    public static void main(String[] args) {
        String name = "Ayush Prajapati";
        welcome(name);
    }
}
