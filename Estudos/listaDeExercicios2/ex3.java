import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double numeroInformado = scanner.nextDouble();
		System.out.println("Numero informado: " + numeroInformado);
		
		numeroInformado += (numeroInformado * 0.10);
		System.out.println("Numero com reajuste de 10%: " + numeroInformado);
		scanner.close();
	}
}
