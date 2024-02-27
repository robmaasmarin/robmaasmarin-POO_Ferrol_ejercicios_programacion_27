package Círculo;
import java.lang.*;
public class circulo {

	double radio;
	
	
	public void areaCirculo() {
		double area = (Math.PI) *  (radio * radio);
		double roundOff = Math.round(area * 100.0) / 100.0;
		System.out.println("El área del círculo es: " + roundOff + " cm2.");
	}
}
