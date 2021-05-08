import java.util.Scanner; 

public class TempoDoEvento {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe a duração do evento em segundos:\n");
		int tempoEmSegundos = scanner.nextInt();
		
		int tempoEmHora = tempoEmSegundos / 3600;
		int tempoEmMinutos = ((tempoEmSegundos % 3600)/60);
		int tempoFinalEmSegundos = ((tempoEmSegundos % 3600) % 60);
		
		
		System.out.println("Tempo do evento em:");
		System.out.println("Horas: " + tempoEmHora);
		System.out.println("Minutos: " + tempoEmMinutos);
		System.out.println("Segundos: " + tempoFinalEmSegundos);
		scanner.close();
	}
}
