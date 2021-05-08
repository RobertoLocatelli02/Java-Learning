import java.util.Scanner;

public class enquantoMultiplos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double numeroInformado = scanner.nextDouble();
		
		while (numeroInformado < 100) {
			numeroInformado = numeroInformado * 3;
			System.out.println(numeroInformado);
		}
		scanner.close();
	}
}
