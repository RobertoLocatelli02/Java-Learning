import java.util.Scanner;

public class classificacaoNadadores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe a idade do nadador: ");
		int idadeDoNadador = scanner.nextInt();
		
		if (idadeDoNadador >= 5 && idadeDoNadador <= 7) {
			System.out.println("Nadador se encaixa na categoria Infantil A");
		} else if (idadeDoNadador >= 8 && idadeDoNadador <= 11) {
			System.out.println("Nadador se encaixa na categoria Infantil B");
		} else if (idadeDoNadador >= 12 && idadeDoNadador <= 13) {
			System.out.println("Nadador se encaixa na categoria Juvenil A");
		} else if (idadeDoNadador >= 14 && idadeDoNadador <= 17) {
			System.out.println("Nadador se encaixa na categoria Juvenil B");
		} else if (idadeDoNadador >= 18) {
			System.out.println("Nadador se encaixa na categoria Adultos");
		} else {
			System.out.println("Pessoa ainda não tem 5 anos para estar em uma categoria");
		}
		scanner.close();
	}
}
