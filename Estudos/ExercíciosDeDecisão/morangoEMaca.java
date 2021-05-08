import java.util.Scanner;

public class morangoEMaca {
	public static void main(String[] args) {
		
		double valorAPagar, valorTotal = 0, pesoTotal = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Quantos Kg de morango? ");
		double pesoMorango = scanner.nextDouble();
		
		if (pesoMorango <= 5) {
			valorAPagar = 2.5 * pesoMorango;
			valorTotal += valorAPagar; 
			pesoTotal += pesoMorango; 
		} else {
				valorAPagar = 2.2 * pesoMorango;
				valorTotal += valorAPagar;
				pesoTotal += pesoMorango;
		}	
		
		System.out.println("Quantos Kg de maçã? ");
		double pesoMaca = scanner.nextDouble();
		
		if (pesoMaca <= 5) {
			valorAPagar = 1.8 * pesoMaca;
			valorTotal += valorAPagar;
			pesoTotal += pesoMaca; 
		} else {
			valorAPagar = 1.5 * pesoMaca;
			valorTotal += valorAPagar;
			pesoTotal += pesoMaca;			
		}
		
		System.out.println("valor total: " + valorTotal);
		System.out.println("peso total: " + pesoTotal);
		if (pesoTotal >= 8 || valorTotal >= 25) {
			valorAPagar = valorAPagar - (valorAPagar * 0.1);
			System.out.println("Pague R$" + valorTotal);
		} else {
			System.out.println("Pague R$" + valorTotal); 
		}
		scanner.close();
	}
}

