import java.util.Scanner; 

public class ValorDoNumero {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero:\n");
		float Numero = scanner.nextFloat();
		
		if (Numero > 0) {
			System.out.println("Seu n�mero � positvo");
        }		
		else if (Numero < 0) {
			System.out.println("Seu n�mero � negativo");
        }	
		else {
			System.out.println("Seu n�mero � nulo");
        }
		scanner.close();
	}
}