import java.util.Scanner;

public class propriedadesDeTriangulos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um lado de tri�ngulo: ");
		double lado1 = scanner.nextDouble();
		System.out.println("Informe outro lado de tri�ngulo: ");
		double lado2 = scanner.nextDouble();
		System.out.println("Informe outro lado de tri�ngulo: ");
		double lado3 = scanner.nextDouble();
		
		if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
			if (lado1 == lado2 && lado1 == lado3 ) {
				System.out.println("seu tri�ngulo � equil�tero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("seu tri�ngulo � is�sceles");
			} else {
				System.out.println("seu tri�ngulo � escaleno");
			} 
		} else {
			System.out.println("Valor(es) inv�lido(s) para um tri�ngulo");
		}
		scanner.close();
	}
}
