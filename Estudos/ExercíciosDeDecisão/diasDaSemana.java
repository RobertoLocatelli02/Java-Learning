import java.util.Scanner;

public class diasDaSemana {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número para os dias da semana: ");
		int numeroInformado = scanner.nextInt();
		
		switch (numeroInformado) {
			case 1: 
				System.out.println("1- Domingo");
			case 2:
				System.out.println("2- Segunda-feira");
				break;
			case 3:
				System.out.println("3- Terça-feira");
				break;
			case 4:
				System.out.println("4- Quarta-feira");
				break;
			case 5:
				System.out.println("5- Quinta-feira");
				break;
			case 6:
				System.out.println("6- Sexta-feira");
				break;
			case 7:
				System.out.println("7- Sabado");
				break;
			default:
				System.out.println("Número inválido.");
				break;
				
		}	
		scanner.close();
	}
}
