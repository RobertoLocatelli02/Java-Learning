
public class paraMultiplos {
	public static void main(String[] args) {
		
		int somatoria = 0;
		 for (int numeros = 1; numeros < 500; numeros++){
	            if (numeros % 3 == 0 && numeros % 2 != 0) {
	            	System.out.print(" " + numeros + " ");
	            	somatoria += numeros;
	            }
		 }
		 System.out.println("\nA soma de todos esses números é: " + somatoria);
	}
}
