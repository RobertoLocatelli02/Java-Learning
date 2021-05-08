import java.util.Scanner;

public class ExcessoEMulta {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe quantos quilos de peixe você conseguiu:\n");
		float PesoDePeixes = scanner.nextFloat();
		
		if (PesoDePeixes > 50) {
		float ExcessoDePeso = (PesoDePeixes - 50);
		float multa = (ExcessoDePeso * 4);
			System.out.println("Você deve R$ " + multa + " de multa.");}
		else {
			System.out.println("Você não deve multa");
		}
		scanner.close();
	}
}
