import java.util.Scanner;

public class idadeEmAnosMesesDias {
	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner (System.in);
	
			System.out.println("Informe sua idade em dias:");
			int totalDeDias = scanner.nextInt();
		
			int totalDeAnos = totalDeDias / 365;
			int restoDeDias = totalDeDias % 365;
			System.out.println("\nAnos: " + totalDeAnos);
		
			int quantidadeDeMeses = restoDeDias / 30;
			System.out.println("Meses: " + quantidadeDeMeses);
			
			int quantidadeDeDias = restoDeDias % 30;
			System.out.println("dias: " + quantidadeDeDias);
			scanner.close();
		}
		catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}
}
