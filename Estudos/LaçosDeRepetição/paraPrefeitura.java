import java.util.Scanner;

public class paraPrefeitura {
	public static void main(String[] args) {
		
		int quantidadeDePessoas;
		double totalSalarioIndividual = 0.0;
		double maiorSalario = 0.0;
		double percentualSalario = 0.0;
		int totalQuantidadeDeFilhos = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		for (quantidadeDePessoas = 0; quantidadeDePessoas <=4; quantidadeDePessoas++) {
			System.out.println("\nInforme seu sal�rio: ");
			double salarioIndividual = scanner.nextDouble();
			System.out.println("Quantidade de filhos: ");
			int quantidadeDeFilhos = scanner.nextInt();
			scanner.close();
			
			if (salarioIndividual > maiorSalario) {
				maiorSalario = salarioIndividual;
			} 
			if (salarioIndividual <= 100) {
				percentualSalario += 1;
			}
			totalSalarioIndividual += salarioIndividual;
			totalQuantidadeDeFilhos += quantidadeDeFilhos;
		}
		totalSalarioIndividual /= quantidadeDePessoas;
		totalQuantidadeDeFilhos /= quantidadeDePessoas;
		percentualSalario = ((percentualSalario*100) / quantidadeDePessoas);
		
		System.out.println("A m�dia salarial da popula��o �: R$" + totalSalarioIndividual);
		System.out.println("A m�dia de filhos da popula��o � " + totalQuantidadeDeFilhos);
		System.out.println("O maior salario � de R$" + maiorSalario);
		System.out.println("O percentual de pessoas com sal�rio de at� R$100 � de " + percentualSalario);
	}
}
