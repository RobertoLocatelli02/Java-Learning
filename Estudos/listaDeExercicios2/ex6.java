import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("informe o pre�o de um produto: ");
		double precoProduto = scanner.nextDouble();
		
		double reajustePrecoProduto = precoProduto - (precoProduto * 0.09);
		System.out.println("pre�o do produto: " + precoProduto);
		System.out.println("pre�o do produto ap�s o desconto: " + reajustePrecoProduto);
		scanner.close();
	}
}
