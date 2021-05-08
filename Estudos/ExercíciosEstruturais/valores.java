import java.util.Scanner;

public class valores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe um número:\n");
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("O valor do seu número é negativo!");
		}
			else {
				System.out.println ("O valor do seu número é positivo!");
			}
		scanner.close();
	}
}
