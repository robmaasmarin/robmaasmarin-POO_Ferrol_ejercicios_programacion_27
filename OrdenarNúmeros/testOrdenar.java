package OrdenarNúmeros;
import java.util.Scanner;

public class testOrdenar {
	public static void main(String[] args) {
		
		Scanner nuevo = new Scanner(System.in);
		Orden nuevoOrden = new Orden();
		
		System.out.println("Introduce el primer número: ");
		
		nuevoOrden.num1 = nuevo.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		
		nuevoOrden.num2 = nuevo.nextInt();
		System.out.println("Introduce el tercer número: ");
		
		nuevoOrden.num3 = nuevo.nextInt();
		
		nuevoOrden.ordenar();
		
		
	}

}
