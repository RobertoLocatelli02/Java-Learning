import java.util.Scanner;

public class salarioPorHorasTrabalhadas {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Quantas horas voc� trabalhou esse m�s?");
		int horasTrabalhadas = scanner.nextInt();
		
		if (horasTrabalhadas > 50) {
			int excessoDeHoras = (horasTrabalhadas - 50);
			int salarioExcedente = (excessoDeHoras * 20);
			int salarioDas50Horas = (50*10);
			System.out.println("Sal�rio Excedente: " + salarioExcedente);
			System.out.println("Sal�rio normal das 50 horas trabalhadas: " + salarioDas50Horas);
			System.out.println("Sal�rio total: " + (salarioExcedente + salarioDas50Horas)); 
		} else {
			int salarioDoTrabalho = (horasTrabalhadas * 10);
			System.out.println("Sal�rio total: " + salarioDoTrabalho);
		}
		scanner.close();
	}
}
