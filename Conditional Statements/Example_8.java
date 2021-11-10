package conditional;
public class Example_8 {
    public static void main(String[] args) {
        String str = "Save";
        
        switch(str){
            case "File":
                System.out.println("This is your files");
                break;
            case "Open":
                System.out.println("Open your file or folder");
                break;
            case "Save":
                System.out.println("Your file is saved");
                break;
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
    }
}
