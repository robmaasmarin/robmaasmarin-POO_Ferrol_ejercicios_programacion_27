import java.util.Scanner;
import Circunferencia.circunference;
import EqualNumbers.Equal;
import Higherthan.Higher;
import OrdenarNúmeros.Orden;
import PositiveNegative.Positive;


public class programaSwitch {
	
	public static void main(String[] args) {
		
		Scanner scannerSwitch = new Scanner(System.in);
		
		int option;
		
		System.out.println("Escoge una opción:\n1.Área Círculo\n2.Longitud Circunferencia\n3.Iguales O No\n4.Positivo O Negativo\n5.Número Mayor\n6.De Mayor A Menor");
		
		option = scannerSwitch.nextInt();
		
		boolean again= true;
		while (again){
		again= false;
		switch(option) {
		// OPTION 1 --> ÁREA CÍRCULO
		  case 1:
			  	circulo myCirculo = new circulo();
				System.out.println("Introduce el radio del círculo: ");
				myCirculo.radio = scannerSwitch.nextDouble();
				myCirculo.areaCirculo();
		    break;
		 // OPTION 2 --> LONGITUD CIRCUNFERENCIA
		  case 2:
			  	circunference nueva = new circunference();
				System.out.println("Introduce el radio de la circunferencia: ");
				nueva.radio = scannerSwitch.nextDouble();
				nueva.longitudCircun();
		    break;
		  case 3:
			  	Equal equality = new Equal();
				System.out.println("Introduce el primer número: ");
				equality.num1 = scannerSwitch.nextInt();
				System.out.println("Introduce el segundo número: ");
				equality.num2 = scannerSwitch.nextInt();
				
				equality.equality();
			  
			  break;
		  case 4:
			  	Positive numero = new Positive();
				System.out.println("Introduce un número: ");
				numero.num = scannerSwitch.nextInt();
				
				numero.checker();
			break;
		  case 5:
			  	Higher test = new Higher();
				System.out.println("Introduce un número: ");
				test.num1 = scannerSwitch.nextInt();
				System.out.println("Introduce otro número: ");
				test.num2 = scannerSwitch.nextInt();
				
				test.higher();
			break;
		  case 6:
			  	Orden nuevoOrden = new Orden();
				System.out.println("Introduce el primer número: ");
				nuevoOrden.num1 = scannerSwitch.nextInt();
				
				System.out.println("Introduce el segundo número: ");
				nuevoOrden.num2 = scannerSwitch.nextInt();
				
				System.out.println("Introduce el tercer número: ");
				nuevoOrden.num3 = scannerSwitch.nextInt();
				
				nuevoOrden.ordenar();
			  break;
			  
			  		  
		  default:
		    //
		    again=true;
		    System.out.println("La opción escogida no es válida. Inténtelo de nuevo:\n1.Área Círculo\n2.Longitud Circunferencia\n3.Iguales O No\n4.Positivo O Negativo\n5.Número Mayor\n6.De Mayor A Menor ");
		    option = scannerSwitch.nextInt();
		    break;
		    }
		}
		
		
		
		
	}
	
	

}
