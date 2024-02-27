package EqualNumbers;
import java.util.Scanner;

public class testEqual {
	public static void main(String[] args) {
		Scanner nuevo = new Scanner(System.in);
		
		Equal equality = new Equal();
		
		System.out.println("Introduce el primer número: ");
		
		equality.num1 = nuevo.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		
		equality.num2 = nuevo.nextInt();
		
		equality.equality();
	}

}
