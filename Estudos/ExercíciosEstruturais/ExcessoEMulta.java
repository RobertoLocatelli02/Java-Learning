import java.util.Scanner;

public class ExcessoEMulta {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe quantos quilos de peixe voc� conseguiu:\n");
		float PesoDePeixes = scanner.nextFloat();
		
		if (PesoDePeixes > 50) {
		float ExcessoDePeso = (PesoDePeixes - 50);
		float multa = (ExcessoDePeso * 4);
			System.out.println("Voc� deve R$ " + multa + " de multa.");}
		else {
			System.out.println("Voc� n�o deve multa");
		}
		scanner.close();
	}
}
