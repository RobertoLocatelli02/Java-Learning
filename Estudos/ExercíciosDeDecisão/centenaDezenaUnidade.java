import java.util.Scanner;

public class centenaDezenaUnidade {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double numero = scanner.nextDouble();
		
		double unidade = numero % 10;
		numero = (numero - unidade) / 10;
		double dezena = numero % 10;
		numero = (numero - dezena) / 10;
		double centena = numero;
		
		System.out.println(centena + " centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s)" );
		scanner.close();
	}
}
