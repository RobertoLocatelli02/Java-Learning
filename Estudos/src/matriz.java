import java.util.*;

public class matriz {
	public static void main(String[] args) {
	
		int matriz[][] = new int [4][4];
		int linha,coluna, resultado = 0;
		
		Scanner scanner = new Scanner (System.in);
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Informe um número: ");
				matriz[3][3] = scanner.nextInt();
				 resultado += matriz[3][3];
			}
			System.out.println();
		}
		System.out.println(resultado);
	}
}
