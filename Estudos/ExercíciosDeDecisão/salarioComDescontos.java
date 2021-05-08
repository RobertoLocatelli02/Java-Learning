import java.util.Scanner;

public class salarioComDescontos {
	public static void main(String[] args) {
		
		double descontoIR;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o salario ganho por hora: ");
		double salarioHora = scanner.nextDouble();
		System.out.println("Informe o total de horas trabalhadas no mês: ");
		double horasNoMes = scanner.nextDouble();
		
		double salarioBruto = salarioHora * horasNoMes;
		double descontoSindicato = (salarioBruto * 0.03);
		double descontoFGTS = (salarioBruto * 0.11);
		double descontoINSS = (salarioBruto * 0.10);
		double salarioLiquido = salarioBruto - descontoSindicato - descontoFGTS - descontoINSS;
		
		if (salarioBruto <= 900) {
			descontoIR = 0;
			salarioLiquido -= descontoIR;
			System.out.println(salarioHora + " * " + horasNoMes + ": R$" + salarioBruto);
			System.out.println("(-)IR: R$" + descontoIR);
			System.out.println("(-)INSS (10%): R$" + descontoINSS);
			System.out.println("(-)FGTS (11%): R$" + descontoFGTS );
			System.out.println("(-)Sindicato (3%): R$" + descontoSindicato);
			System.out.println("Salário Líquido: R$" + salarioLiquido);			
		} else if (salarioBruto <= 1500) {
			descontoIR = (salarioBruto * 0.5);
			salarioLiquido -= descontoIR;
			System.out.println(salarioHora + " * " + horasNoMes + ": R$" + salarioBruto);
			System.out.println("(-)IR (5%): R$" + descontoIR);
			System.out.println("(-)INSS (10%): R$" + descontoINSS);
			System.out.println("(-)FGTS (11%): R$" + descontoFGTS );
			System.out.println("(-)Sindicato (3%): R$" + descontoSindicato);
			System.out.println("Salário Líquido: R$" + salarioLiquido);			
		} else if (salarioBruto <= 2500) {
			descontoIR = (salarioBruto * 0.10);
			salarioLiquido -= descontoIR;
			System.out.println(salarioHora + " * " + horasNoMes + ": R$" + salarioBruto);
			System.out.println("(-)IR (10%): R$" + descontoIR);
			System.out.println("(-)INSS (10%): R$" + descontoINSS);
			System.out.println("(-)FGTS (11%): R$" + descontoFGTS );
			System.out.println("(-)Sindicato (3%): R$" + descontoSindicato);
			System.out.println("Salário Líquido: R$" + salarioLiquido);	
		} else {
			descontoIR = (salarioBruto * 0.20);
			salarioLiquido -= descontoIR;
			System.out.println(salarioHora + " * " + horasNoMes + ": R$" + salarioBruto);
			System.out.println("(-)IR (20%): R$" + descontoIR);
			System.out.println("(-)INSS (10%): R$" + descontoINSS);
			System.out.println("(-)FGTS (11%): R$" + descontoFGTS );
			System.out.println("(-)Sindicato (3%): R$" + descontoSindicato);
			System.out.println("Salário Líquido: R$" + salarioLiquido);	
		}
		scanner.close();
	}
}
