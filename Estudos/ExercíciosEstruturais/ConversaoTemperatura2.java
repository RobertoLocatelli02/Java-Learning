import java.util.Scanner;

public class ConversaoTemperatura2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe a temperatura em Celsius:\n");
		float TemperaturaCelsius = scanner.nextFloat();
		
		double TemperaturaFahrenheit = (TemperaturaCelsius * (9/5) + 32);
		
		System.out.println(TemperaturaCelsius + "ºC = " + TemperaturaFahrenheit + "ºF");	
		scanner.close();
	}
}
