import java.util.Scanner;

public class equacaoSegundoGrau {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe os valores de a, b & c da equa��o ax� + bx + c");
		System.out.println("a: ");
		double a = scanner.nextDouble();
		
		if (a == 0) {
			System.out.println("a equa��o n�o � do segundo grau");
		} else {
		System.out.println("b: ");
		double b = scanner.nextDouble();
		System.out.println("c: ");
		double c = scanner.nextDouble();
		
		double delta = (Math.pow(b, 2) - (4 * a * c));
		if (delta < 0) {
			System.out.println("a equa��o n�o possui raizes reais");
		} else if (delta == 0) {
			System.out.println("a equa��o possui apenas uma raiz real");
		} else {
			System.out.println("a equa��o possui duas raizes reais");
			}
		}
		scanner.close();
	}
}