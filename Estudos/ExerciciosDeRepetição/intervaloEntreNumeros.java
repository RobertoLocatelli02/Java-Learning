import java.util.Scanner;

public class intervaloEntreNumeros {
	public static void main(String[] args) {
		
		double soma = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		int num1 = scanner.nextInt();
		System.out.println("Informe um número: ");
		int num2 = scanner.nextInt();
		
		/*IntStream intervalo = IntStream.range(num1,num2);
		intervalo.forEach(System.out::println); */
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
				soma += i;
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
				soma += i;
			}
		}
		System.out.println("Soma do numeros: " + soma);
		scanner.close();
	}
}
