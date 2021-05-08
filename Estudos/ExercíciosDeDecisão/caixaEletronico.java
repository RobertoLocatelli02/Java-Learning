import java.util.Scanner;

public class caixaEletronico {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o valor de saque: ");
		double valorDeSaque = scanner.nextDouble();
		
		double notasDe100 = (int) valorDeSaque / 100;  // 287 --> 2.87 --> 2 notas e 87 sobrando
		valorDeSaque = valorDeSaque % 100; // 287 % 100 --> 87
		double notasDe50 = (int) valorDeSaque / 50; // 87 / 50 --> 1 nota e 37 sobrando
		valorDeSaque = valorDeSaque % 50; // 87 % 50 --> 37
		double notasDe10 = (int) valorDeSaque / 10; // 37 / 10 --> 3 notas e 7 sobrando
		valorDeSaque = valorDeSaque % 10; // 37 % 10 --> 7
		double notasDe5 = (int) valorDeSaque / 5; // 7 / 5 --> 1 nota e 2 sobrando
		valorDeSaque = valorDeSaque % 5; // 7 % 5 --> 2
		double notasDe1 = valorDeSaque;
		
		System.out.println("Notas de R$100: " + notasDe100);
		System.out.println("Notas de R$50: " + notasDe50);
		System.out.println("Notas de R$10: " + notasDe10);
		System.out.println("Notas de R$5: " + notasDe5);
		System.out.println("Notas de R$1: " + notasDe1);
		scanner.close();
	}
}
