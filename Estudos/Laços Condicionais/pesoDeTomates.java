import java.util.Scanner;

public class pesoDeTomates {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe quantos quilos de tomate voc� conseguiu:\n");
		float pesoDeTomates = scanner.nextFloat();
		
		if (pesoDeTomates > 50) {
		float ExcessoDePeso = (pesoDeTomates - 50);
		float multa = (ExcessoDePeso * 4);
			System.out.println("Voc� deve R$ " + multa + " de multa.");
		}else{
			System.out.println("Voc� n�o excedeu o peso, portanto n�o deve multa");
		}
		scanner.close();
	}
}
