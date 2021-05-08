import java.util.Scanner;

public class indiceDePoluicao {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o índice de poluição: ");
		double indiceDePoluicao = scanner.nextDouble();
		
		if (indiceDePoluicao >= 0.05 && indiceDePoluicao <= 0.29) {
			System.out.println("índice de poluição aceitável");
		} else if (indiceDePoluicao >= 0.3 && indiceDePoluicao <= 0.39) {
			System.out.println("indústrias do 1º grupo têm que suspender suas atividades");
		} else if (indiceDePoluicao >= 0.4 && indiceDePoluicao <= 0.49) {
			System.out.println("indústrias do 1º e 2º grupos têm que suspender suas atividades");
		} else if (indiceDePoluicao >= 0.5){
			System.out.println("todos os grupos devem paralisar suas atividades");
		} else {
			System.out.println("valor inválido");
		}
		scanner.close();
	}
}
