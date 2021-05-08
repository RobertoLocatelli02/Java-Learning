import java.util.Scanner;

public class anoBissexto {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um ano: ");
		int anoInformado = scanner.nextInt();
		
		if (anoInformado % 4 == 0) {
			System.out.println("O ano é bissexto");
		} else {
			System.out.println("O ano não é bissexto");
		}
		scanner.close();
	}
}
