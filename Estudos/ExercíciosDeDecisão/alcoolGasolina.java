import java.util.Scanner;

public class alcoolGasolina {
	public static void main(String[] args) {
		
		double valorAPagar;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o combustível: \nalcool ou gasolina");
		char combustivel = scanner.next().charAt(0);
		combustivel = Character.toLowerCase(combustivel);
		
		switch (combustivel) {
			case 'a': 
				System.out.println("Quantos litros de alcool? ");
				double litrosAlcool = scanner.nextDouble();
				
				if (litrosAlcool <= 20) {
					valorAPagar = 1.9 * litrosAlcool;
					valorAPagar = valorAPagar - (valorAPagar * 0.03);
					System.out.println("Pague R$" + valorAPagar);
				} else {
					valorAPagar = 1.9 * litrosAlcool;
					valorAPagar = valorAPagar - (valorAPagar * 0.05);
					System.out.println("Pague R$" + valorAPagar);
				}
				break;
			case 'g':
				System.out.println("Quantos litros de gasolina? ");
				double litrosGasolina = scanner.nextDouble();
				
				if (litrosGasolina <= 20) {
					valorAPagar = 2.5 * litrosGasolina;
					valorAPagar = valorAPagar - (valorAPagar * 0.04);
					System.out.println("Pague R$" + valorAPagar);
				} else {
					valorAPagar = 2.5 * litrosGasolina;
					valorAPagar = valorAPagar - (valorAPagar * 0.06);
					System.out.println("Pague R$" + valorAPagar);
				}
				break;
			default: 
				System.out.println("Valor inválido");
		}
		scanner.close();
	}
}
