import java.util.Scanner;

public class potência {
	public static void main(String[] args) {
		
		int resultado = 1;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Base ^ expoente");
		System.out.println("Base: "); // 3
		int base = scanner.nextInt();
		System.out.println("Expoente: "); // 4
		int expoente = scanner.nextInt();
		
		for (int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		System.out.println(resultado);
		scanner.close();
	}
}
