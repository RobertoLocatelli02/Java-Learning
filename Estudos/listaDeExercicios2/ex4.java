import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();
		System.out.println("Informe um segundo número: ");
		double segundoNumero = scanner.nextDouble();
		System.out.println("Informe o terceiro número: ");
		double terceiroNumero = scanner.nextDouble();
		
		double mediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3;
		System.out.printf("a média dos números %2.2f, %2.2f e %2.2f é igual à %2.2f", primeiroNumero, segundoNumero, terceiroNumero, mediaAritmetica);
		scanner.close();
	}
}
