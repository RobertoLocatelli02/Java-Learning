import java.util.Scanner;

public class SalarioMensal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Quanto voc� ganha por hora?:\n");
		float hora = scanner.nextFloat();
		
		System.out.printf("Quantas horas voc� trabalha em um m�s?:\n");
		float mensal = scanner.nextFloat();
		
		float salario = hora * mensal;
		
		System.out.println("O seu sal�rio mensal �: R$" + salario);
		scanner.close();
	}
}
