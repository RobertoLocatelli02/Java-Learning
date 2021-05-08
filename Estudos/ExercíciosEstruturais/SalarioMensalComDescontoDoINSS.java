	import java.util.Scanner;

public class SalarioMensalComDescontoDoINSS {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Quanto voc� ganha por hora?:\n");
		float hora = scanner.nextFloat();
		
		System.out.printf("Quantas horas voc� trabalha em um m�s?:\n");
		float mensal = scanner.nextFloat();
		
		double Salario = hora * mensal;
		double DescontoImpostoDeRenda = (0.11 * Salario);
		double DescontoINSS	= (0.08 * Salario);
		double DescontoSindicato = (0.05 * Salario);
		double SalarioLiquido = (Salario - DescontoImpostoDeRenda - DescontoINSS - DescontoSindicato);
		
		System.out.println("Sal�rio bruto = R$" + Salario);
		System.out.println("Pagou R$" + DescontoINSS + " ao INSS");
		System.out.println("Pagou R$" + DescontoSindicato + " ao Sindicato");
		System.out.println("Sal�rio L�quido = R$" + SalarioLiquido);
		scanner.close();
	}
}
