import java.util.Scanner;

public class informacoesPessoais {
	public static void main(String[] args) {
		
		String nome;
		char sexo, estadoCivil;
		double salario;
		int idade, tamanhoNome;
		
		Scanner scanner = new Scanner (System.in);
		
		do {
			System.out.println("Informe o nome: ");
			nome = scanner.next();
			System.out.println("Informe sua idade: ");
			idade = scanner.nextInt();
			System.out.println("Informe seu salário: ");
			salario = scanner.nextDouble();
			System.out.println("Informe seu sexo: ");
			sexo = scanner.next().charAt(0);
			System.out.println("Informe seu estado civil: ");
			estadoCivil = scanner.next().charAt(0);
			
			tamanhoNome = nome.length();
			sexo = Character.toLowerCase(sexo);
			estadoCivil = Character.toLowerCase(estadoCivil);
			System.out.println("nome: " + nome);
			System.out.println("idade: " + idade);
			System.out.println("salario: " + salario);
			System.out.println("sexo: " + sexo);
			System.out.println("estado civil: " + estadoCivil);
			System.out.println("Tamanho nome: " + tamanhoNome);
		}
		while (tamanhoNome < 3 || idade < 0 && idade > 150 || salario <= 0 || sexo != 'f' && sexo != 'm' || estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		scanner.close();
	}
}
