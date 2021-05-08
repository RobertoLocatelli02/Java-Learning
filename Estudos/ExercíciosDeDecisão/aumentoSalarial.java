import java.util.Scanner;

public class aumentoSalarial {
	public static void main(String[] args) {
		
		double salarioFinal, aumentoSalarial;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe seu salário: ");
		double salarioInicial = scanner.nextDouble();
		
		if (salarioInicial <= 280) {
			salarioFinal = salarioInicial + (salarioInicial * 0.2);
			aumentoSalarial = salarioFinal - salarioInicial;
			System.out.println("Salario inicial: R$" + salarioInicial );
			System.out.println("Aumento percentual de 20%");
			System.out.println("Valor do aumento: R$" + aumentoSalarial);
			System.out.println("aumento para: R$" + salarioFinal);
		} else if (salarioInicial <=700) {
			salarioFinal = salarioInicial + (salarioInicial * 0.15);
			aumentoSalarial = salarioFinal - salarioInicial;
			System.out.println("Salario inicial: R$" + salarioInicial );
			System.out.println("Aumento percentual de 15%");
			System.out.println("Valor do aumento: R$" + aumentoSalarial);
			System.out.println("aumento para: R$" + salarioFinal);
		} else if (salarioInicial <= 1500) {
			salarioFinal = salarioInicial + (salarioInicial * 0.10);
			aumentoSalarial = salarioFinal - salarioInicial;
			System.out.println("Salario inicial: R$" + salarioInicial );
			System.out.println("Aumento percentual de 10%");
			System.out.println("Valor do aumento: R$" + aumentoSalarial);
			System.out.println("aumento para: R$" + salarioFinal);
		} else if (salarioInicial > 1500) {
			salarioFinal = salarioInicial + (salarioInicial * 0.05);
			aumentoSalarial = salarioFinal - salarioInicial;
			System.out.println("Salario inicial: R$" + salarioInicial );
			System.out.println("Aumento percentual de 5%");
			System.out.println("Valor do aumento: R$" + aumentoSalarial);
			System.out.println("aumento para: R$" + salarioFinal);
		} else {
			System.out.println("valor inválido");
		}
		scanner.close();	
	}
}
