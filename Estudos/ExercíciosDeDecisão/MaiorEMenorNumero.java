import java.util.Scanner;

public class MaiorEMenorNumero {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero:\n");
		float PrimeiroNumero = scanner.nextFloat();
		
		System.out.println("Informe outro n�mero:\n");
		float SegundoNumero = scanner.nextFloat();
		
		System.out.println("Informe um �ltimo n�mero:\n");
		float TerceiroNumero = scanner.nextFloat();
		
		//encontrando o maior n�mero
		if (PrimeiroNumero > SegundoNumero) {
			if (PrimeiroNumero > TerceiroNumero) {
				System.out.println("O maior n�mero � o " + PrimeiroNumero);
			}
			else {
				System.out.println("O maior n�mero � o " + TerceiroNumero);
			}
		}
		if (SegundoNumero > PrimeiroNumero) {
			if (SegundoNumero > TerceiroNumero) {
				System.out.println("O maior n�mero � o " + SegundoNumero);
			}
			else {
				System.out.println("O maior n�mero � o " + TerceiroNumero);
			}
		}
			
		//encontrando o menor n�mero
			if (PrimeiroNumero < SegundoNumero) {
					if (PrimeiroNumero < TerceiroNumero) {
						System.out.println("O menor n�mero � o " + PrimeiroNumero);
					}
					else {
						System.out.println("O menor n�mero � o " + TerceiroNumero);
					}
				}
				if (SegundoNumero < PrimeiroNumero) {
					if (SegundoNumero < TerceiroNumero) {
						System.out.println("O menor n�mero � o " + SegundoNumero);
					}
					else {
						System.out.println("O menor n�mero � o " + TerceiroNumero);
			}
		}
		scanner.close();
	}
}