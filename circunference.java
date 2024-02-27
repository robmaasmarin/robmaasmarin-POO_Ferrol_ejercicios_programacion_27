

public class circunference {
	double radio;
	
	public void longitudCircun() {
		double longitud = 2 * Math.PI * radio;
		double roundOff = Math.round(longitud * 100.0) / 100.0;
		System.out.println("El área de la circunferencia es de " + roundOff + " cm2.");
	}

}
