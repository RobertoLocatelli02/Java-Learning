import java.util.Scanner;

public class QuadradoDeQuatroNumeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe 4 números.");
		System.out.println("Número 1: ");
		double numero1 = scanner.nextFloat();
		System.out.println("Número 2: ");
		double numero2 = scanner.nextFloat();
		System.out.println("Número 3: ");
		double numero3 = scanner.nextFloat();
		System.out.println("Número 4: ");
		double numero4 = scanner.nextFloat();
		
		double quadradoNumero1 = Math.pow(numero1,2);
		double quadradoNumero2 = Math.pow(numero2,2);
		double quadradoNumero3 = Math.pow(numero3,2);
		double quadradoNumero4 = Math.pow(numero4,2);
		
		if (quadradoNumero3 >= 1000) {
			System.out.println("\n\nO quadrado do terceiro número é " + quadradoNumero3);
		} else {
			System.out.println("\nO quadrado do primeiro número é " + quadradoNumero1);
			System.out.println("O quadrado do segundo número é " + quadradoNumero2);
			System.out.println("O quadrado do terceiro número é " + quadradoNumero3);
			System.out.println("O quadrado do primeiro número é " + quadradoNumero4);
		}
		scanner.close();
	}
}
