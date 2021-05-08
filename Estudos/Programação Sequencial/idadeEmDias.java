import java.util.Scanner;

public class idadeEmDias {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner (System.in);
			System.out.println("Informe a sua idade:\n");
			System.out.println("Anos: ");
			int idadeDaPessoa = scanner.nextInt();

			System.out.println("Meses: ");
			int mesesDaPessoa = scanner.nextInt();

			System.out.println("Dias: ");
			int diasDaPessoa = scanner.nextInt();

			int quantidadeDeDiasAno = idadeDaPessoa * 365;
			int quantidadeDeDiasMes = mesesDaPessoa * 30;
			int resultado = quantidadeDeDiasAno  + quantidadeDeDiasMes + diasDaPessoa;
			System.out.println("Total de dias em " + idadeDaPessoa + " anos = " + resultado + " dias");
			scanner.close();
		}
		catch (Exception e){
			System.out.println("Valor inválido");
		}
	}
}
