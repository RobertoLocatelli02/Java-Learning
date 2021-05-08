import java.util.Scanner;

public class salarioPorHorasTrabalhadas {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Quantas horas você trabalhou esse mês?");
		int horasTrabalhadas = scanner.nextInt();
		
		if (horasTrabalhadas > 50) {
			int excessoDeHoras = (horasTrabalhadas - 50);
			int salarioExcedente = (excessoDeHoras * 20);
			int salarioDas50Horas = (50*10);
			System.out.println("Salário Excedente: " + salarioExcedente);
			System.out.println("Salário normal das 50 horas trabalhadas: " + salarioDas50Horas);
			System.out.println("Salário total: " + (salarioExcedente + salarioDas50Horas)); 
		} else {
			int salarioDoTrabalho = (horasTrabalhadas * 10);
			System.out.println("Salário total: " + salarioDoTrabalho);
		}
		scanner.close();
	}
}
