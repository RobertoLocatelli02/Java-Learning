import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivZero {
	//demonstra lançamento de uma exceção quando ocorre divisão por zero
	
	
	public static int quociente (int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador; //possibilita divisão por zero
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		boolean continueLoop = true; //determina se mais entradas são necessárias
		
		do {
		try { //vai ler dois números e vai calcular o quociente
			System.out.println("Informe o numerador: ");
			int numerador = scanner.nextInt();
			System.out.println("Informe o denominador: ");
			int denominador = scanner.nextInt();
			
			int resultado = quociente(numerador, denominador);
			System.out.printf("Resultado: %d / %d = %d", numerador, denominador, resultado);
			continueLoop = false; //entrada bem-sucedida; fim do loop
		} catch (InputMismatchException e) {
			System.err.printf("\nException: %s \n", e);
			scanner.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro");
		} catch (ArithmeticException e) {
			System.err.printf("\nException: %s \n", e);
			scanner.nextLine();
			System.out.println("0 é um denominador inválido");
		}
		
		} while(continueLoop);
		scanner.close();
	}
}
