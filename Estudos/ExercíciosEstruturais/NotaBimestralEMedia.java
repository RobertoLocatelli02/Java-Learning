import java.util.Scanner;

public class NotaBimestralEMedia {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe a nota do primeiro bismetre:\n");
		float primeiro = scanner.nextFloat();	
		
		System.out.printf("Informe a nota do segundo bimestre:\n");
		float segundo = scanner.nextFloat();	
		
		System.out.printf("Informe a nota do terceiro bimestre:\n");
		float terceiro = scanner.nextFloat();	
		
		System.out.printf("Informe a nota do quarto bimestre:\n");
		float quarto = scanner.nextFloat();
		
		float soma = primeiro + segundo + terceiro + quarto;
		float media = soma/4;
		
		System.out.println("Sua média é " + media);
		scanner.close();
	}
}
