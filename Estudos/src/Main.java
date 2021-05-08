import java.util.Scanner;

public class Main {
private static Scanner scanner;

/*	static void testingMethods(String lastName) {
		System.out.println(lastName + " Locatelli");
	}
	public static void main(String[] args) {
		testingMethods("Raphael");
		testingMethods("Robson");
		testingMethods("Rodrigo");
		testingMethods("Roberto");
		
		double resultado = 34 % 7;
		System.out.println(resultado); */	
	
	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		int quantidadeDeAlunos;
		double mediaGeral = 0.0;
		for (quantidadeDeAlunos = 0; quantidadeDeAlunos < 5; quantidadeDeAlunos++) {      //calcular a media de 5 alunos
			System.out.println("\nInforme a primeira nota: ");
			double primeiraNota = scanner.nextDouble();
			System.out.println("Informe a segunda nota: ");
			double segundaNota = scanner.nextDouble();
			System.out.println("Informe a terceira nota: ");
			double terceiraNota = scanner.nextDouble();
			
			double mediaDasNotas = ((primeiraNota + segundaNota + terceiraNota) / 3);
			System.out.println("Aluno " + quantidadeDeAlunos + " teve média " + mediaDasNotas);
			
			mediaGeral += mediaDasNotas;
		}
		System.out.println("media geral: " + mediaGeral);
		System.out.println("quantidade de alunos: " + quantidadeDeAlunos);
		
		mediaGeral /= quantidadeDeAlunos;
		System.out.println("A media geral da turma foi " + mediaGeral);
		scanner.close();
		
	}
}
