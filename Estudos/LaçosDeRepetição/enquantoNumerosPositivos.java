import java.util.Scanner;

public class enquantoNumerosPositivos {
	public static void main(String[] args) {
		
		double numeroInserido;
		double somatoriaDosNumeros = 0.0;
		int totalDeValores = 1;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe um n�mero e informe um n�mero negativo caso queira parar: ");
		numeroInserido = scanner.nextDouble();
		somatoriaDosNumeros += numeroInserido;
		
		while (numeroInserido > 0) { 
			System.out.println("Informem n�mero e informe um n�mero negativo caso queira parar: ");
			numeroInserido = scanner.nextDouble();
			if (numeroInserido >= 0) {
			somatoriaDosNumeros += numeroInserido;
			totalDeValores += 1;
			}
		}
		double mediaDosValores = somatoriaDosNumeros / totalDeValores;
		
		System.out.println("total de n�meros inseridos: " + totalDeValores);
		System.out.println("Somat�ria desses n�meros: " + somatoriaDosNumeros);
		System.out.println("M�dia desses n�meros: " + mediaDosValores);
		scanner.close();
	}
}
