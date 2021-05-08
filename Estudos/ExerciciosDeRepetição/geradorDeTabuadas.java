import java.util.Scanner;

public class geradorDeTabuadas {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número: ");
		int num = scanner.nextInt();
		
		for (int i = 0; i<=10; i++) {
		int tabuada = num * i;
		System.out.printf("%d X %d = %d", num, i, tabuada);
		System.out.println();
		}
		scanner.close();
	}
}
