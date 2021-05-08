
public class moedasTeste {
	public static void main(String[] args) {
		
		moedas[] pessoa = new moedas[3];
		
		pessoa[0] = new moedas ("José", 3000);
		pessoa[1] = new moedas ("João", 5000);
		pessoa[2] = new moedas ("Maria", 4500);
		
		// primeira forma: 
		for (int i = 0; i < 3; i++) {
			pessoa[i].imprimirInformacoes();
		}
		System.out.println();
		
		// segunda forma:  percorrendo a classe moedas com o vetor pessoa[]
		for (moedas loop : pessoa) {
			loop.imprimirInformacoes();
		}
	}
}
