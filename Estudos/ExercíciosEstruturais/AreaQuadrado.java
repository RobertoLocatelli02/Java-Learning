import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe a medida do lado de um quadrado:\n");
		float lado = scanner.nextFloat();
		
		double area = Math.pow(lado, 2);
		double resultado = area * 2;
		
		System.out.println("O dobro da �rea desse quadrado �: " + resultado + " unidades de �rea.");
		scanner.close();
	}
}
