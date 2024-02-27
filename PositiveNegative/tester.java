package PositiveNegative;
import java.util.Scanner;

public class tester {
	
	public static void main(String[] args) {
		
		Scanner nuevo = new Scanner(System.in);
		
		Positive numero = new Positive();
		
		System.out.println("Introducen un número: ");
		
		numero.num = nuevo.nextInt()
;
		numero.checker();
		
		
	}

}
