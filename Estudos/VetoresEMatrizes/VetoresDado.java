import java.util.*;

public class VetoresDado {
	public static void main(String[] args) {
		
		int cont = 0, maiorValor = 0;
		int dado;
		
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			dado = random.nextInt(6);
			System.out.println(dado);
			if (dado > maiorValor) {
				maiorValor = dado;
				cont = 0;
				}
			if (dado == maiorValor) {
				cont++;
			}
		}
		System.out.println("Maior valor jogado no dado foi: " + maiorValor);
		System.out.println("E foi jogado " + cont + " vezes");
	}
}
