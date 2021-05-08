
public class Exception1 {
	private static String frase;

	public static void main(String[] args) {
		
		frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) { //captura uma poss�vel exce��o
			//tratamento da exce��o
			System.err.println("A frase inicial est� nula, para solucionar o problema, foi-lhe atribuido um valor default");
			frase = "frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}
}
