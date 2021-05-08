import java.util.Scanner;

public class notaEntreZeroEDez {
	public static void main(String[] args) {
		
		double numeroInformado;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("informe uma nota entre zero e dez: ");
		numeroInformado = scanner.nextDouble();
		
		if (numeroInformado >10 || numeroInformado < 0) {
		do {
		System.out.println("Valor inválido");
		System.out.println("informe uma nota entre zero e dez: ");
		 numeroInformado = scanner.nextDouble();
		}
		 while (numeroInformado > 10 || numeroInformado < 0);	
		}
		scanner.close();
	}
}
