
import java.util.Arrays;
import java.util.Collections;

public class Orden {
	
	public int num1;
	public int num2;
	public int num3;
	
	public void ordenar() {
		Integer[] myNum = {num1, num2, num3};
		
		Arrays.sort(myNum, Collections.reverseOrder());
	    for (int num : myNum) {
	            System.out.print(num + " ");
	        }
		
		
	}
	
	

}
