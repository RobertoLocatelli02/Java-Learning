import java.util.Scanner; 

public class ex7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o valor do salario por hora: ");
		double salarioHora = scanner.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = scanner.nextDouble();
		System.out.println("Informe a porcentagem do desconto do INSS: ");
		double porcentagemINSS = scanner.nextDouble();
		porcentagemINSS /= 100;
		
		double salarioBruto = salarioHora * horasTrabalhadas;
		double descontoINSS = salarioBruto - (salarioBruto * porcentagemINSS);
		
		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("Salario Liquido: R$" + descontoINSS);
		scanner.close();
	}
}
