import java.util.Scanner;

public class QuadradoDeQuatroNumeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe 4 n�meros.");
		System.out.println("N�mero 1: ");
		double numero1 = scanner.nextFloat();
		System.out.println("N�mero 2: ");
		double numero2 = scanner.nextFloat();
		System.out.println("N�mero 3: ");
		double numero3 = scanner.nextFloat();
		System.out.println("N�mero 4: ");
		double numero4 = scanner.nextFloat();
		
		double quadradoNumero1 = Math.pow(numero1,2);
		double quadradoNumero2 = Math.pow(numero2,2);
		double quadradoNumero3 = Math.pow(numero3,2);
		double quadradoNumero4 = Math.pow(numero4,2);
		
		if (quadradoNumero3 >= 1000) {
			System.out.println("\n\nO quadrado do terceiro n�mero � " + quadradoNumero3);
		} else {
			System.out.println("\nO quadrado do primeiro n�mero � " + quadradoNumero1);
			System.out.println("O quadrado do segundo n�mero � " + quadradoNumero2);
			System.out.println("O quadrado do terceiro n�mero � " + quadradoNumero3);
			System.out.println("O quadrado do primeiro n�mero � " + quadradoNumero4);
		}
		scanner.close();
	}
}
