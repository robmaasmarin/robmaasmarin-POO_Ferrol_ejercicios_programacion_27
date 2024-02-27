package Circunferencia;
import java.util.Scanner;

public class testCircunferencia {
	public static void main(String[] args) {
	Scanner nuevo = new Scanner(System.in);
	circunference nueva = new circunference();
	
	
	System.out.println("Introduce el radio de la circunferencia: ");
	
	nueva.radio = nuevo.nextDouble();
	
	nueva.longitudCircun();
	
	}
}
