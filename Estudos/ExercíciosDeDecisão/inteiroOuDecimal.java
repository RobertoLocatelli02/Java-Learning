import java.util.Scanner;

public class inteiroOuDecimal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("informe um número: ");
		double numeroInformado = scanner.nextDouble();
		
		if (numeroInformado % 1 == 0) {
			System.out.println("seu número é inteiro");
		} else {
			System.out.println("seu número é decimal");
		}
		scanner.close();
	}
}
