import java.util.Scanner;

public class distanciaEntrePontos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe dois pontos em um plano:\n");
		System.out.println("X1: ");
		float x1 = scanner.nextFloat();
		System.out.println("Y1: ");
		float y1 = scanner.nextFloat();
		System.out.println("X2: ");
		float x2 = scanner.nextFloat();
		System.out.println("Y2: ");
		float y2 = scanner.nextFloat();
		
		double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.printf("A distância entre os dois pontos é: %5.2f",  distancia);
		scanner.close();
	}
}
