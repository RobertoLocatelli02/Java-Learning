import java.util.Scanner;

public class indiceDePoluicao {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o �ndice de polui��o: ");
		double indiceDePoluicao = scanner.nextDouble();
		
		if (indiceDePoluicao >= 0.05 && indiceDePoluicao <= 0.29) {
			System.out.println("�ndice de polui��o aceit�vel");
		} else if (indiceDePoluicao >= 0.3 && indiceDePoluicao <= 0.39) {
			System.out.println("ind�strias do 1� grupo t�m que suspender suas atividades");
		} else if (indiceDePoluicao >= 0.4 && indiceDePoluicao <= 0.49) {
			System.out.println("ind�strias do 1� e 2� grupos t�m que suspender suas atividades");
		} else if (indiceDePoluicao >= 0.5){
			System.out.println("todos os grupos devem paralisar suas atividades");
		} else {
			System.out.println("valor inv�lido");
		}
		scanner.close();
	}
}
