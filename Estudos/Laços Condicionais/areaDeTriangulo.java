import java.util.Scanner;

public class areaDeTriangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Para o c�lculo da �rea do tri�ngulo, informe:");
		System.out.println("Base: ");
		double baseDoTriangulo = scanner.nextDouble();
		System.out.println("Altura: ");
		double alturaDoTriangulo = scanner.nextDouble();
		
		if (baseDoTriangulo > 0 && alturaDoTriangulo > 0) {
			double areaDoTriangulo = ((baseDoTriangulo * alturaDoTriangulo)/2);
			System.out.println("A �rea desse triangulo �: " + areaDoTriangulo);
		} else if (baseDoTriangulo <= 0 && alturaDoTriangulo > 0) {
			System.out.println("Valor inv�lido para a base do tri�ngulo");
		} else if (baseDoTriangulo > 0 && alturaDoTriangulo <= 0) {
			System.out.println("Valor inv�lido para a altura do tri�ngulo");
		} else {
			System.out.println("Valores inv�lidos");
		}
		scanner.close();
	}
}
