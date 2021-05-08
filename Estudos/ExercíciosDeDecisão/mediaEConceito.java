import java.util.Scanner;

public class mediaEConceito {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe sua primeira nota: ");
		double primeiraNota = scanner.nextDouble();
		System.out.println("Informe sua segunda nota: ");
		double segundaNota = scanner.nextDouble();
		
		double mediaParcial = ((primeiraNota + segundaNota) / 2);
		
		if (mediaParcial >= 9 && mediaParcial <= 10) {
			System.out.printf("primeira nota: %2.2f \nsegunda nota: %2.2f \nmédia de aproveitamento: %2.2f \nConceito A",primeiraNota, segundaNota, mediaParcial);
		} else if (mediaParcial >= 7.5 && mediaParcial < 9) {
			System.out.printf("primeira nota: %2.2f \nsegunda nota: %2.2f \nmédia de aproveitamento: %2.2f \nConceito B",primeiraNota, segundaNota, mediaParcial);
		} else if (mediaParcial >= 6 && mediaParcial < 7.5) {
			System.out.printf("primeira nota: %2.2f \nsegunda nota: %2.2f \nmédia de aproveitamento: %2.2f \nConceito C",primeiraNota, segundaNota, mediaParcial);
		} else if (mediaParcial >= 4 && mediaParcial < 6) {
			System.out.printf("primeira nota: %2.2f \nsegunda nota: %2.2f \nmédia de aproveitamento: %2.2f \nConceito D",primeiraNota, segundaNota, mediaParcial);
		} else if (mediaParcial >= 0 && mediaParcial < 4) {
			System.out.printf("primeira nota: %2.2f \nsegunda nota: %2.2f \nmédia de aproveitamento: %2.2f \nConceito E",primeiraNota, segundaNota, mediaParcial);
		} else {
			System.out.println("Valor(es) inválido(s)");
		}
		scanner.close();
	}
}
