
public class Escopo {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else { acompanhado = false; }
		
		
		if(idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo, Roberto Locatelli!");
		} else { System.out.println("infelizmente você não pode entrar!");
		}
				
				
	}
}
