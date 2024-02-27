package Higherthan;
import java.util.Scanner;

public class numeros {
	public static void main(String[] args) {
		
		Scanner nuevo = new Scanner(System.in);
		
		Higher test = new Higher();
		
		System.out.println("Introduce un número: ");
		
		test.num1 = nuevo.nextInt();
		
		System.out.println("Introduce otro número: ");
		
		test.num2 = nuevo.nextInt();
		
		test.higher();
		
		
		
	}
}
