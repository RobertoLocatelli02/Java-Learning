import java.util.Scanner;

public class NumerosESoma {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe um n�mero:\n");
		double Numero1 = scanner.nextDouble();	
		
		System.out.printf("Informe um outro n�mero:\n");
		double Numero2 = scanner.nextDouble();
		
		double soma = Numero1 + Numero2;
		
		System.out.println("Soma = " + soma);
		scanner.close();
	}	
}
