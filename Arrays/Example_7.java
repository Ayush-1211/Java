package arrays;
public class Example_7 {
    public static void main(String[] args) {
        // Copying an array
        
        int a[] = { 1, 8, 3, 6, 9, 10, 12, 24};
        int b[] = new int[a.length];
 
        b = a;
        b[0]++;
 
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
