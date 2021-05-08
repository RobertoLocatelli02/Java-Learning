import java.util.Scanner;

public class usuarioESenha {
	public static void main(String[] args) {
		
		String usuario, senha;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o nome de usuário: ");
		usuario = scanner.next();
		System.out.println("Informe uma senha: ");
		senha = scanner.next();
		if (new String(usuario).equals(senha)) {
		do {
			System.out.println("ERRO: usuário e senha não podem ser iguais, tente novamente!");
			System.out.println("Informe o nome de usuário: ");
			usuario = scanner.next();
			System.out.println("Informe uma senha: ");
			senha = scanner.next();
		}
		while (new String(usuario).equals(senha));
		}
		scanner.close();
	}
}
