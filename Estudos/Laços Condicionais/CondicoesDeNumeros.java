import java.util.Scanner;

public class CondicoesDeNumeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero: ");
		double numeroInformado = scanner.nextDouble();
		
		if (numeroInformado % 2 == 0 && numeroInformado != 0) {
			if (numeroInformado > 0) {
			System.out.println(numeroInformado + " � par e positivo");
			} else {
				System.out.println(numeroInformado + " � par e negativo");
			}
		} else if (numeroInformado % 2 != 0) {
			if (numeroInformado > 0) {
				System.out.println(numeroInformado + " � �mpar e positivo");
			} else {
				System.out.println(numeroInformado + " � �mpar e negativo");
			}
		} else {
			System.out.println("Seu n�mero � nulo");
		}
		scanner.close();
	}
}
