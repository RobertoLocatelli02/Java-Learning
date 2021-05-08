
public class façaEnquantoContagem {
	public static void main(String[] args) {
		
		int numero = 233;
		System.out.print(numero + " ");
		do {
			if (numero >= 300 && numero <= 400) {
				numero = numero + 3;
			} else {
				numero = numero + 5;
			}
			System.out.print(numero + " ");		} 
		while (numero >= 233 && numero <= 456);
		System.out.println(numero);
	}
}
	