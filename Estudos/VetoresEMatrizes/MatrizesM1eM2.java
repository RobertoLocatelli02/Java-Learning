import java.util.*;

public class MatrizesM1eM2 {
	public static void main(String[] args) {
		
		double[][] matriz1 = new double [4][6];
		double[][] matriz2 = new double [4][6];
		double[][] matrizSecundaria1 = new double [4][6];
		double[][] matrizSecundaria2 = new double [4][6];
		
		Scanner scanner = new Scanner (System.in);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("Informe N1: ");
				matriz1[i][j] = scanner.nextDouble();
				System.out.println("Informe N2: ");
				matriz2[i][j] = scanner.nextDouble();
				
				matrizSecundaria1[i][j] = matriz1[i][j] + matriz2[i][j];
				matrizSecundaria2[i][j] = matriz2[i][j] - matriz2[i][j];
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("Matriz M1: " + matrizSecundaria1[i][j]);
				System.out.println("Matriz M2: " + matrizSecundaria2[i][j]);
			}
		}
		scanner.close();
	}
}
