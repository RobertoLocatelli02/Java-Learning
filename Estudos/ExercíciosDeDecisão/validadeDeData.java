import java.util.Scanner;

public class validadeDeData {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("dd/mm/aaaa");
		System.out.println("Informe um valor: ");
		int dia = scanner.nextInt();
		System.out.println("Informe o segundo valor: ");
		int m�s = scanner.nextInt();
		System.out.println("Informe um terceiro valor: ");
		int ano = scanner.nextInt();
		
		if (dia >= 1 && dia <= 30 && m�s >= 1 && m�s <= 12) {
			System.out.println(dia + "/" + m�s + "/" + ano + " � uma data v�lida");
		} else {
			System.out.println(dia + "/" + m�s + "/" + ano + " n�o � uma data v�lida");
		}
		scanner.close();
	}
}
