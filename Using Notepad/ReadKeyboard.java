import java.lang.*;
import java.util.*;

class ReadKeyboard {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		System.out.println(x);

		float y = sc.nextFloat();
		System.out.println(y);

		String z = sc.next();		//sc.nextLine() use to print sentances
		System.out.println(z);

	}
}