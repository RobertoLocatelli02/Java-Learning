import java.util.Scanner;

public class valores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe um n�mero:\n");
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("O valor do seu n�mero � negativo!");
		}
			else {
				System.out.println ("O valor do seu n�mero � positivo!");
			}
		scanner.close();
	}
}
