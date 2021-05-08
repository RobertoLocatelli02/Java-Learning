import java.util.Scanner; 

public class ValorDoNumero {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número:\n");
		float Numero = scanner.nextFloat();
		
		if (Numero > 0) {
			System.out.println("Seu número é positvo");
        }		
		else if (Numero < 0) {
			System.out.println("Seu número é negativo");
        }	
		else {
			System.out.println("Seu número é nulo");
        }
		scanner.close();
	}
}