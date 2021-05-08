import java.util.*;

public class maiorValorDeVetores {
	public static void main(String[] args) {
		
		 double maiorValor = 0;
		 double[] vet = new double [5];
		
		Scanner scanner = new Scanner (System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			vet[i] = scanner.nextDouble();
			
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("\nPosição " + i + " = " + vet[i]);
		}
		System.out.println("maior valor é: " + maiorValor);
		scanner.close();
	}
}
