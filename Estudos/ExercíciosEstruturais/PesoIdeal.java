import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a sua altura:\n");
		double Altura = scanner.nextFloat();
		
		double PesoIdeal = ((72.7 * Altura) - 58);
		
		System.out.println("Baseado na sua altura, o seu peso ideal é de " + PesoIdeal + " kg.");
		scanner.close();
	}
}
