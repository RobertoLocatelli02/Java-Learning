import java.util.*;

public class MatrizSomaDiagonal {
	public static void main(String[] args) {
		
		int linha,coluna, somaDaMatriz =0, somaDaDiagonal = 0;
		int matriz[][] = new int [3][3];
		
		Scanner scanner = new Scanner (System.in);
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Informe um número: ");
				matriz[linha][coluna] = scanner.nextInt();
				
				somaDaMatriz += matriz[linha][coluna];
				if (linha == coluna) {
					somaDaDiagonal += matriz[linha][coluna];
				}
			}
		}
		System.out.println("Soma dos valores da matriz = " + somaDaMatriz);
		System.out.println("Soma da diagonal principal = " + somaDaDiagonal);
	}
}
