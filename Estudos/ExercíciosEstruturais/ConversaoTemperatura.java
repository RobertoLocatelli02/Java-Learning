import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe a temperatura em Fahrenheit:\n");
		float TemperaturaFahrenheit = scanner.nextFloat();
		
		float TemperaturaCelsius =  5 * ((TemperaturaFahrenheit - 32) / 9);
		
		System.out.println(TemperaturaFahrenheit + "ºF = " + TemperaturaCelsius + "ºC");	
		scanner.close();
	}
}
