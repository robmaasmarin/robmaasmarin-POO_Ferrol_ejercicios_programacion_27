package Círculo;
import java.util.Scanner;

public class testCirculo {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		circulo myCirculo = new circulo();
		
		System.out.println("Introduce el radio del círculo: ");
		
		
		myCirculo.radio = myScanner.nextDouble();
		
		myCirculo.areaCirculo();
	}

}
