import java.util.Scanner;

public class contas5numeros {
	public static void main(String[] args) {
		
		double i, maiorNumero = 0, somaDosNumeros = 0, cont = 0;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		for (i = 0; i <5; i++) {
			System.out.println("Informe um n�mero: ");
			double numeroInformado = scanner.nextDouble();
			
			if (numeroInformado > maiorNumero) {
				maiorNumero = numeroInformado;
			}
			somaDosNumeros += numeroInformado;
			cont++;
		}
		double mediaDosNumeros = somaDosNumeros/cont;
		System.out.printf("O maior n�mero informado foi %2.2f \nA soma dos n�mero � igual � %2.2f \nA m�dia dos n�meros � igual � %2.2f", maiorNumero, somaDosNumeros, mediaDosNumeros);
		scanner.close();
	}
}
