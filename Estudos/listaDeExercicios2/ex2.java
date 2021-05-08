import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double numeroInicial = scanner.nextDouble();
		
		double antecessor = numeroInicial - 1;
		double sucessor = numeroInicial + 1;
		
		System.out.println("numero informado: " + numeroInicial);
		System.out.println("antecessor: " + antecessor);
		System.out.println("sucessor: " + sucessor);
		scanner.close();
	}
}
