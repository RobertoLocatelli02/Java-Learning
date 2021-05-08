import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um saldo: ");
		double saldoInformado = scanner.nextDouble();
		
		double reajusteSaldo = saldoInformado + (saldoInformado * 0.01);
		System.out.printf("Reajuste do saldo %2.2f é igual à %2.2f", saldoInformado, reajusteSaldo);
		scanner.close();
	}
}
