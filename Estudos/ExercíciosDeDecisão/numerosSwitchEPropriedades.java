import java.util.Scanner;

public class numerosSwitchEPropriedades {
	public static void main(String[] args) {
		double conta;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero: ");
		double numero1 = scanner.nextDouble();
		System.out.println("Informe outro n�mero: ");
		double numero2 = scanner.nextDouble();
		System.out.println("Escolha uma opera��o: \nsoma --> + \nsubtra��o --> - \nmultiplica��o --> * \ndivis�o --> / \npot�ncia --> ^");
		String operador = scanner.next();
		
		switch (operador) {
		case "+":
			conta = numero1 + numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f � um n�mero par\n", conta);
			} else {
				System.out.printf("%2.2f � um n�mero impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f � positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f � negativo\n",conta);
			} else {
				System.out.printf("%2.2f � nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f � inteiro\n",conta);
			} else {
				System.out.printf("%2.2f � decimal\n",conta);
			}
			break;
		case "-":
			conta = numero1 - numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f � um n�mero par\n", conta);
			} else {
				System.out.printf("%2.2f � um n�mero impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f � positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f � negativo\n",conta);
			} else {
				System.out.printf("%2.2f � nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f � inteiro\n",conta);
			} else {
				System.out.printf("%2.2f � decimal\n",conta);
			}
			break;
		case "*":
			conta = numero1 * numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f � um n�mero par\n", conta);
			} else {
				System.out.printf("%2.2f � um n�mero impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f � positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f � negativo\n",conta);
			} else {
				System.out.printf("%2.2f � nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f � inteiro\n",conta);
			} else {
				System.out.printf("%2.2f � decimal\n",conta);
			}
			break;
		case "/":
			conta = numero1 / numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f � um n�mero par\n", conta);
			} else {
				System.out.printf("%2.2f � um n�mero impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f � positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f � negativo\n",conta);
			} else {
				System.out.printf("%2.2f � nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f � inteiro\n",conta);
			} else {
				System.out.printf("%2.2f � decimal\n",conta);
			}
			break;
		case "^":
			conta = Math.pow(numero1, numero2);
			if (conta % 2 == 0) {
				System.out.printf("%2.2f � um n�mero par\n", conta);
			} else {
				System.out.printf("%2.2f � um n�mero impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f � positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f � negativo\n",conta);
			} else {
				System.out.printf("%2.2f � nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f � inteiro\n",conta);
			} else {
				System.out.printf("%2.2f � decimal\n",conta);
			}
			break;
		default: 
			System.out.println("Operador inv�lido");
		}
		scanner.close();
	}
}
