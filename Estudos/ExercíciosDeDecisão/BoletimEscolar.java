import java.util.Scanner;

public class BoletimEscolar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe sua primeira nota parcial:\n");
		float PrimeiraNotaParcial = scanner.nextFloat();
		
		System.out.println("Informe sua segunda nota parcial:\n");
		float SegundaNotaParcial = scanner.nextFloat();
		
		float Media = ((PrimeiraNotaParcial + SegundaNotaParcial) / 2);
		
		if (Media == 10) {
			System.out.println("Aprovado com Distinção");}
		else if (Media >= 7) {
			System.out.println("Aprovado");}
		else {
			System.out.println("Reprovado");}
		scanner.close();
	}
}
