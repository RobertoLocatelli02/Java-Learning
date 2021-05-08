import java.util.Scanner;

public class areaDeTriangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Para o cálculo da área do triângulo, informe:");
		System.out.println("Base: ");
		double baseDoTriangulo = scanner.nextDouble();
		System.out.println("Altura: ");
		double alturaDoTriangulo = scanner.nextDouble();
		
		if (baseDoTriangulo > 0 && alturaDoTriangulo > 0) {
			double areaDoTriangulo = ((baseDoTriangulo * alturaDoTriangulo)/2);
			System.out.println("A área desse triangulo é: " + areaDoTriangulo);
		} else if (baseDoTriangulo <= 0 && alturaDoTriangulo > 0) {
			System.out.println("Valor inválido para a base do triângulo");
		} else if (baseDoTriangulo > 0 && alturaDoTriangulo <= 0) {
			System.out.println("Valor inválido para a altura do triângulo");
		} else {
			System.out.println("Valores inválidos");
		}
		scanner.close();
	}
}
