import java.util.Scanner;

public class VariavelMaiorQue100 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero: ");
		double numeroInformado = scanner.nextDouble();
		
		System.out.println();
		if (numeroInformado > 100 && numeroInformado != 100) {
			System.out.println("seu n�mero � maior que 100, portanto: " + numeroInformado);
		} else if (numeroInformado < 100) {
			System.out.println("seu n�mero � menor que 100, portanto: 0");
		} else {
			System.out.println("seu n�mero � 100");
		}
		scanner.close();
	}
}
