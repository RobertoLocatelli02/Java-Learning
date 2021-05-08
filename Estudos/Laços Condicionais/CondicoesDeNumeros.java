import java.util.Scanner;

public class CondicoesDeNumeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double numeroInformado = scanner.nextDouble();
		
		if (numeroInformado % 2 == 0 && numeroInformado != 0) {
			if (numeroInformado > 0) {
			System.out.println(numeroInformado + " é par e positivo");
			} else {
				System.out.println(numeroInformado + " é par e negativo");
			}
		} else if (numeroInformado % 2 != 0) {
			if (numeroInformado > 0) {
				System.out.println(numeroInformado + " é ímpar e positivo");
			} else {
				System.out.println(numeroInformado + " é ímpar e negativo");
			}
		} else {
			System.out.println("Seu número é nulo");
		}
		scanner.close();
	}
}
