import java.util.Scanner;

public class numerosSwitchEPropriedades {
	public static void main(String[] args) {
		double conta;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double numero1 = scanner.nextDouble();
		System.out.println("Informe outro número: ");
		double numero2 = scanner.nextDouble();
		System.out.println("Escolha uma operação: \nsoma --> + \nsubtração --> - \nmultiplicação --> * \ndivisão --> / \npotência --> ^");
		String operador = scanner.next();
		
		switch (operador) {
		case "+":
			conta = numero1 + numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f é um número par\n", conta);
			} else {
				System.out.printf("%2.2f é um número impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f é positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f é negativo\n",conta);
			} else {
				System.out.printf("%2.2f é nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f é inteiro\n",conta);
			} else {
				System.out.printf("%2.2f é decimal\n",conta);
			}
			break;
		case "-":
			conta = numero1 - numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f é um número par\n", conta);
			} else {
				System.out.printf("%2.2f é um número impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f é positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f é negativo\n",conta);
			} else {
				System.out.printf("%2.2f é nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f é inteiro\n",conta);
			} else {
				System.out.printf("%2.2f é decimal\n",conta);
			}
			break;
		case "*":
			conta = numero1 * numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f é um número par\n", conta);
			} else {
				System.out.printf("%2.2f é um número impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f é positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f é negativo\n",conta);
			} else {
				System.out.printf("%2.2f é nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f é inteiro\n",conta);
			} else {
				System.out.printf("%2.2f é decimal\n",conta);
			}
			break;
		case "/":
			conta = numero1 / numero2;
			if (conta % 2 == 0) {
				System.out.printf("%2.2f é um número par\n", conta);
			} else {
				System.out.printf("%2.2f é um número impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f é positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f é negativo\n",conta);
			} else {
				System.out.printf("%2.2f é nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f é inteiro\n",conta);
			} else {
				System.out.printf("%2.2f é decimal\n",conta);
			}
			break;
		case "^":
			conta = Math.pow(numero1, numero2);
			if (conta % 2 == 0) {
				System.out.printf("%2.2f é um número par\n", conta);
			} else {
				System.out.printf("%2.2f é um número impar\n",conta);
			}
			
			if (conta > 0) {
				System.out.printf("%2.2f é positivo\n",conta);
			} else if (conta < 0) {
				System.out.printf("%2.2f é negativo\n",conta);
			} else {
				System.out.printf("%2.2f é nulo\n",conta);
			}
			
			if (conta % 1 == 0) {
				System.out.printf("%2.2f é inteiro\n",conta);
			} else {
				System.out.printf("%2.2f é decimal\n",conta);
			}
			break;
		default: 
			System.out.println("Operador inválido");
		}
		scanner.close();
	}
}
