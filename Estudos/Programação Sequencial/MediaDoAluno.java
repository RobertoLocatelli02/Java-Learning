import java.util.Scanner;

public class MediaDoAluno {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe as suas notas:");
		System.out.println("Nota 1: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Nota 3: ");
		double nota3 = scanner.nextDouble();
		
		double ponderacaoDasNotas = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5));
		double resultadoFinal = ponderacaoDasNotas / 10;
		System.out.printf("Com as notas: %2.2f, %2.2f e %2.2f, o aluno teve média final de: %2.2f", nota1, nota2, nota3, resultadoFinal);
		scanner.close();
	}
}
