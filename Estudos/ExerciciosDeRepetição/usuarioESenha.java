import java.util.Scanner;

public class usuarioESenha {
	public static void main(String[] args) {
		
		String usuario, senha;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o nome de usu�rio: ");
		usuario = scanner.next();
		System.out.println("Informe uma senha: ");
		senha = scanner.next();
		if (new String(usuario).equals(senha)) {
		do {
			System.out.println("ERRO: usu�rio e senha n�o podem ser iguais, tente novamente!");
			System.out.println("Informe o nome de usu�rio: ");
			usuario = scanner.next();
			System.out.println("Informe uma senha: ");
			senha = scanner.next();
		}
		while (new String(usuario).equals(senha));
		}
		scanner.close();
	}
}
