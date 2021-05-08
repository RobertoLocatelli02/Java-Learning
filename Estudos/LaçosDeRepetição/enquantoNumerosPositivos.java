import java.util.Scanner;

public class enquantoNumerosPositivos {
	public static void main(String[] args) {
		
		double numeroInserido;
		double somatoriaDosNumeros = 0.0;
		int totalDeValores = 1;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe um número e informe um número negativo caso queira parar: ");
		numeroInserido = scanner.nextDouble();
		somatoriaDosNumeros += numeroInserido;
		
		while (numeroInserido > 0) { 
			System.out.println("Informem número e informe um número negativo caso queira parar: ");
			numeroInserido = scanner.nextDouble();
			if (numeroInserido >= 0) {
			somatoriaDosNumeros += numeroInserido;
			totalDeValores += 1;
			}
		}
		double mediaDosValores = somatoriaDosNumeros / totalDeValores;
		
		System.out.println("total de números inseridos: " + totalDeValores);
		System.out.println("Somatória desses números: " + somatoriaDosNumeros);
		System.out.println("Média desses números: " + mediaDosValores);
		scanner.close();
	}
}
