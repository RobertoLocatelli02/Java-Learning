import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o primeiro n�mero: ");
		double primeiroNumero = scanner.nextDouble();
		System.out.println("Informe um segundo n�mero: ");
		double segundoNumero = scanner.nextDouble();
		System.out.println("Informe o terceiro n�mero: ");
		double terceiroNumero = scanner.nextDouble();
		
		double mediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3;
		System.out.printf("a m�dia dos n�meros %2.2f, %2.2f e %2.2f � igual � %2.2f", primeiroNumero, segundoNumero, terceiroNumero, mediaAritmetica);
		scanner.close();
	}
}
