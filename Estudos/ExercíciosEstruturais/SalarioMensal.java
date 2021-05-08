import java.util.Scanner;

public class SalarioMensal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Quanto você ganha por hora?:\n");
		float hora = scanner.nextFloat();
		
		System.out.printf("Quantas horas você trabalha em um mês?:\n");
		float mensal = scanner.nextFloat();
		
		float salario = hora * mensal;
		
		System.out.println("O seu salário mensal é: R$" + salario);
		scanner.close();
	}
}
