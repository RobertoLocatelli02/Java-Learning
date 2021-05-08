import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivZero {
	//demonstra lan�amento de uma exce��o quando ocorre divis�o por zero
	
	
	public static int quociente (int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador; //possibilita divis�o por zero
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		boolean continueLoop = true; //determina se mais entradas s�o necess�rias
		
		do {
		try { //vai ler dois n�meros e vai calcular o quociente
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
			System.out.println("\nVoc� deve entrar com um valor do tipo inteiro");
		} catch (ArithmeticException e) {
			System.err.printf("\nException: %s \n", e);
			scanner.nextLine();
			System.out.println("0 � um denominador inv�lido");
		}
		
		} while(continueLoop);
		scanner.close();
	}
}
