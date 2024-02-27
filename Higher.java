

public class Higher {
	
	public int num1;
	public int num2;
	
	public void higher() {
		if (num1 > num2) {
			System.out.println("El primer número " + num1 + " es mayor que el segundo " + num2 + ".");
		}
		else if (num2 > num1) {
			System.out.println("El segundo número " + num2 + " es mayor que el primero " + num1 + ".");
		}
		else {
			System.out.println("Ambos números son iguales");
		}
	}
	

}
