import java.util.Scanner;

public class validadeDeData {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("dd/mm/aaaa");
		System.out.println("Informe um valor: ");
		int dia = scanner.nextInt();
		System.out.println("Informe o segundo valor: ");
		int mês = scanner.nextInt();
		System.out.println("Informe um terceiro valor: ");
		int ano = scanner.nextInt();
		
		if (dia >= 1 && dia <= 30 && mês >= 1 && mês <= 12) {
			System.out.println(dia + "/" + mês + "/" + ano + " é uma data válida");
		} else {
			System.out.println(dia + "/" + mês + "/" + ano + " não é uma data válida");
		}
		scanner.close();
	}
}
