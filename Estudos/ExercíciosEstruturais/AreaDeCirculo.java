import java.util.Scanner;

public class AreaDeCirculo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe a medida do raio de um c�rculo:\n");
		float raio = scanner.nextFloat();
		
		double pi = Math.PI;
		
		double area = pi * Math.pow(raio, 2);
		System.out.println("A �rea desse c�rculo �: " + area + " unidades de �rea.");
		scanner.close();
	}
}
