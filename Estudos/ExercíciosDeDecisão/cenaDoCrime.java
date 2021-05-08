import java.util.Scanner;

public class cenaDoCrime {
	public static void main(String[] args) {
		
		int cont = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Telefonou para a vítima?");
		char resposta1 = scanner.next().charAt(0);
		
		if (resposta1 == 's' || resposta1 == 'S') {
			cont++;
		}
		
		System.out.println("Esteve no local do crime?");
		char resposta2 = scanner.next().charAt(0);
		
		if (resposta2 == 's' || resposta2 == 'S') {
			cont++;
		}
		
		System.out.println("Mora perto da vítima?");
		char resposta3 = scanner.next().charAt(0);
		
		if (resposta3 == 's' || resposta3 == 'S') {
			cont++;
		}
		
		System.out.println("Devia para a vítima?");
		char resposta4 = scanner.next().charAt(0);
		
		if (resposta4 == 's' || resposta4 == 'S') {
			cont++;
		}
		
		System.out.println("Ja trabalhou com a vítima?");
		char resposta5 = scanner.next().charAt(0);
		
		if (resposta5 == 's' || resposta5 == 'S') {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		} else if (cont == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
		scanner.close();
	}
}
