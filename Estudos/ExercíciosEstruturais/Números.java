import java.util.Scanner;

public class N�meros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe um n�mero inteiro:\n");
		int PrimeiroNumeroInteiro = scanner.nextInt();
		
		System.out.println("Informe outro n�mero inteiro:\n");
		int SegundoNumeroInteiro = scanner.nextInt();
		
		System.out.println("Agora informe um n�mero real:\n");
		double NumeroReal = scanner.nextFloat ();
		
		double PrimeiraOperacao = ((2 * PrimeiroNumeroInteiro) * (SegundoNumeroInteiro / 2));
		double SegundaOperacao = ((3 * PrimeiroNumeroInteiro) + NumeroReal);
		double TerceiraOperacao = (Math.pow(NumeroReal, 3));
		
		System.out.println("o produto do dobro do primeiro com metade do segundo = " + PrimeiraOperacao);
		System.out.println("a soma do triplo do primeiro com o terceiro = " + SegundaOperacao);
		System.out.println("o terceiro elevado ao cubo = " + TerceiraOperacao);
		scanner.close();
	}
}
