import java.util.Scanner;

public class propriedadesDeTriangulos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um lado de triângulo: ");
		double lado1 = scanner.nextDouble();
		System.out.println("Informe outro lado de triângulo: ");
		double lado2 = scanner.nextDouble();
		System.out.println("Informe outro lado de triângulo: ");
		double lado3 = scanner.nextDouble();
		
		if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
			if (lado1 == lado2 && lado1 == lado3 ) {
				System.out.println("seu triângulo é equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("seu triângulo é isósceles");
			} else {
				System.out.println("seu triângulo é escaleno");
			} 
		} else {
			System.out.println("Valor(es) inválido(s) para um triângulo");
		}
		scanner.close();
	}
}
